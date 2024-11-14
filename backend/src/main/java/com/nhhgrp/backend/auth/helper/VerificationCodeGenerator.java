package com.nhhgrp.backend.auth.helper;

import java.util.Random;

public class VerificationCodeGenerator {
    public static String generateCode(){
        Random random = new Random();
        // 100000 + random số từ 0 đến 899999
        // => Đảm bảo code luôn có 6 chữ số từ 100000 đến 999999
        int code = 100000 + random.nextInt(900000);
        return String.valueOf(code);
    }
}
