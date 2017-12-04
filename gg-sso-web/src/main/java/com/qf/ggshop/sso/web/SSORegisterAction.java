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
public class SSORegisterAction extends BaseAction{

    private static final Logger logger = LoggerFactory.getLogger(SSOLogingAction.class);

    @Autowired
    private GsUserService gsUserService;


    @ResponseBody
    @RequestMapping("/user/register.do")
    public Answer saveUser(GsUser gsUser, String content){
        int i = 0;
        try {
            i = gsUserService.saveGsUser(gsUser,content);
            if (i == 1) {
                return super.renderAnswer("success");
            }
            return super.renderAnswer("error");
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
            return  super.renderAnswer(e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping("/user/registerSelect.do")
    public int selectUser(GsUser gsUser, String content){
        int i = 0;
        try {
            i = gsUserService.selectGsUser(gsUser,content);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }


}
