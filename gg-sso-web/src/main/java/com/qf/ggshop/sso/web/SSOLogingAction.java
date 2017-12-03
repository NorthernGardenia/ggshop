package com.qf.ggshop.sso.web;

import com.qf.ggshop.pojo.bean.Answer;
import com.qf.ggshop.pojo.po.GsUser;
import com.qf.ggshop.service.GsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SSOLogingAction extends BaseAction{


    private static final Logger logger = LoggerFactory.getLogger(SSOLogingAction.class);

    @Autowired
    private GsUserService gsUserService;

    @ResponseBody
    @RequestMapping("/user/login.do")
    public Answer login(GsUser user){
        try{
            GsUser user1 = gsUserService.selevByUser(user.getUsername(), user.getPassword());
            // user.getUsername().equals("22");
           // System.out.print(user.getUsername().equals("2"));
            if (null != user1) {
                return super.renderAnswer("success");
            }
            return super.renderAnswer("error");
        }catch(Exception e) {
            e.printStackTrace();
            logger.info(e.getMessage());
            return super.renderError(e.getMessage());
        }
    }
}
