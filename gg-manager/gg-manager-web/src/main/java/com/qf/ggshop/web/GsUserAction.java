package com.qf.ggshop.web;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.po.GsUser;
import com.qf.ggshop.service.GsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@Scope("prototype")
public class GsUserAction {

    @Autowired
    private GsUserService gsUserService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @ResponseBody
    @RequestMapping("/gsUsers")
    public Result<GsUser> listGsUserByPage(Page page){
        Result<GsUser> result = null;
        try{
            result = new Result<GsUser>();

            result = gsUserService.listGsUserByPage(page);



        }catch (Exception e){

            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return result;

    }

    @ResponseBody
    @RequestMapping("/items/freeze")
    public int upItems(@RequestParam("ids[]") List<Long> ids){
        int i = 0;
        try {
                i = gsUserService.freezeGsUser(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
