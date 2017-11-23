package com.qf.ggshop.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public interface FileService {
    Map<String,Object> imageUpload(MultipartFile onLoad);
}
