package com.qf.ggshop.web;

import com.qf.ggshop.service.FileService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 富文本表编辑器
 */
@Controller
@RequestMapping("/file")
public class FileAction {

    @Autowired
    private FileService fileService;

    @RequestMapping(value="/upload",method = RequestMethod.GET)
    public void ueditorUpload(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String action = request.getParameter("action");
        if("config".equals(action)){
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            IOUtils.copy(this.getClass().getClassLoader().getResourceAsStream("config.json"),response.getWriter(),"UTF-8");
        }
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> imageUpload(MultipartFile upfile){
        upfile.getOriginalFilename();
        return fileService.imageUpload(upfile);
    }

}
