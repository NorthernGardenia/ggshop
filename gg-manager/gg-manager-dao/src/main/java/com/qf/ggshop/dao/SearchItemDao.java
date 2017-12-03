package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.vo.ItemSearchCustom;
import com.qf.ggshop.pojo.vo.SearchItemResult;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SearchItemDao {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SolrServer solrServer;


    public SearchItemResult search(SolrQuery query) {
        SearchItemResult result=null;
        try {

            //根据query查询索引库
            QueryResponse queryResponse = solrServer.query(query);
            //取得查询结果。得到索引库中文档域对象
            SolrDocumentList solrDocumentList = queryResponse.getResults();
            //取得查询记录数
            long numFound = solrDocumentList.getNumFound();
            result = new SearchItemResult();
            result.setRecordCount(numFound);
            //取商品列表高亮显示
            Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
            List<ItemSearchCustom> itemList = new ArrayList<>();
            //遍历文档域对象
            for (SolrDocument solrDocument : solrDocumentList) {
                ItemSearchCustom item = new ItemSearchCustom();
                item.setId((String) solrDocument.get("id"));
                item.setCatName((String) solrDocument.get("item_category_name"));
                item.setImage((String) solrDocument.get("item_image"));
                item.setPrice((long) solrDocument.get("item_price"));
                item.setSellPoint((String) solrDocument.get("item_sell_point"));

                List<String> list = highlighting.get(solrDocument.get("id")).get("item_title");
                String title = "";
                if (list != null && list.size() > 0) {
                    //高亮部分
                    title = list.get(0);
                } else {
                    //无高亮部分
                    title = (String) solrDocument.get("item_title");
                }
                item.setTitle(title);
                //添加到商品列表
                itemList.add(item);

            }
            result.setItemList(itemList);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }
}
