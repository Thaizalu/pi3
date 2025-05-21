package com.gacci.gacci_data_generator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class S3Service {


    public String uploadFile(MultipartFile file) throws IOException {

        try (FileOutputStream w = new FileOutputStream(new File(file.getName()))) {
            w.write(file.getBytes());
            w.close();
        }
        return file.getName();
    }

    public byte[] downloadFile(String fileUrl) throws IOException {

        try (FileInputStream is = new FileInputStream(new File(fileUrl))) {
            return is.readAllBytes();
        }
    }


}
