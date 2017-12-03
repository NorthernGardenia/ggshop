package com.qf.ggshop.sso.web;

import com.qf.ggshop.pojo.bean.Answer;

public class BaseAction {

    public <T> Answer<T>  renderAnswer(T result) {
        Answer<T> answer = new Answer();
        answer.setCode(0);
        answer.setResult(result);
        answer.setMsg("操作成功");
        return answer;
    }

    public <T> Answer<T> renderError(String msg) {
        Answer<T> answer = new Answer();
        answer.setCode(1);
        answer.setMsg(msg);
        return answer;
    }
}
