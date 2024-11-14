package com.nhhgrp.backend.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
    public int uploadFile(MultipartFile file, String fileName);
}
