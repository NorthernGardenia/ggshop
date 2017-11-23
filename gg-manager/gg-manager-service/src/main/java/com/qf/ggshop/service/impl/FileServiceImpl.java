package com.qf.ggshop.service.impl;

import com.qf.ggshop.common.util.FtpUtils;
import com.qf.ggshop.common.util.IDUtils;
import com.qf.ggshop.common.util.Prop;
import com.qf.ggshop.common.util.PropKit;
import com.qf.ggshop.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.print.attribute.DateTimeSyntax;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public Map<String, Object> imageUpload(MultipartFile onLoad) {

        String originalFilename = onLoad.getOriginalFilename();
        System.out.println("originalName"+originalFilename);
        String fileT = originalFilename.substring(originalFilename.lastIndexOf("."));
        System.out.println("拓展名---->"+fileT);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("/yy/MM/dd");
        String filePath = simpleDateFormat.format(date);
        String imageName = IDUtils.genImageName();
        Prop prop = PropKit.use("ftp.properties");
        Map<String,Object> map = new HashMap<>();
        boolean flag=false;
        try {
            System.out.println(prop.get("ftp.host")+"pp"+ prop.getInt("ftp.post")+"username"+prop.get("ftp.username")+"password"+prop.get("ftp.password"));
             flag = FtpUtils.uploadFile(prop.get("ftp,host"), prop.getInt("ftp.post"),
                    prop.get("ftp.username"), prop.get("ftp.password"), prop.get("ftp.basepath"),
                    filePath, imageName + fileT, onLoad.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(flag){
            map.clear();
            map.put("state","SUCCESS");
            map.put("original",originalFilename);
            map.put("size",onLoad.getSize());
            map.put("title",imageName + "." + fileT);
            map.put("type",fileT);
            map.put("url",filePath+"/"+imageName + fileT);
        }

        return map;
    }
}
