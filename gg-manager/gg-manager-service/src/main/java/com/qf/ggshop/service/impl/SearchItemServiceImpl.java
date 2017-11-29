package com.qf.ggshop.service.impl;

import com.qf.ggshop.dao.ItemSearchCustomMapper;
import com.qf.ggshop.dao.SearchItemDao;
import com.qf.ggshop.pojo.vo.ItemSearchCustom;
import com.qf.ggshop.pojo.vo.SearchItemResult;
import com.qf.ggshop.service.SearchItemService;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class SearchItemServiceImpl implements SearchItemService {

    @Autowired
    private ItemSearchCustomMapper itemSearchCustomDao;
    @Autowired
    private SolrServer solrServer;
    @Autowired
    private SearchItemDao searchItemDao;

    @Override
    public boolean importAllItems() {
        //采集数据：保存在list中
        List<ItemSearchCustom> list = itemSearchCustomDao.getSearchItemList();
        //创建索引库documentList
        //遍历
        for (ItemSearchCustom itemSearchCustom : list) {
            //创建solr的文档对象，形成文档域
            SolrInputDocument document=new SolrInputDocument();
            document.addField("id",itemSearchCustom.getId());
            document.addField("item_title",itemSearchCustom.getTitle());
            document.addField("item_sell_point",itemSearchCustom.getSellPoint());
            document.addField("item_price",itemSearchCustom.getPrice());
            document.addField("item_image",itemSearchCustom.getImage());
            document.addField("item_category_name",itemSearchCustom.getCatName());

            //写入索引库
            try {
                solrServer.add(document);
            } catch (SolrServerException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //提交
            try {
                solrServer.commit();
            } catch (SolrServerException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return true;
    }


    @Override
    public SearchItemResult search(String keyword, Integer page, int rows) {
        //创建solrQuery对象
        SolrQuery query = new SolrQuery();
        //设置查询条件
        query.setQuery(keyword);
        //设置分页条件
        if(page<0){
            page=1;
        }
          query.setStart((page-1)*rows);
        query.setRows(rows);
        //设置默认搜索域
        query.set("df", "item_keywords");
        //开启高亮显示
        query.setHighlight(true);
        query.addHighlightField("item_title");
        query.setHighlightSimplePre("<em style=\"color:red\">");
        query.setHighlightSimplePost("</em>");
        //调用dao调查
        SearchItemResult searchResult=searchItemDao.search(query);
        //计算总页数
        long recordCount = searchResult.getRecordCount();
        int totalPage=(int)((recordCount+rows-1)/rows);

        //添加返回结果
        searchResult.setTotalPages(totalPage);

        return searchResult;
    }
}
