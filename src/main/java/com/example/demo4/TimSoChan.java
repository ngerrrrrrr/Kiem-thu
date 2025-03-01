package com.example.demo4;

public class TimSoChan {
    public static boolean timSoChan(Integer n){
        if (n == null){
            throw new IllegalArgumentException("Bạn chưa nhập giá trị");
        }
        return n % 2 == 0;
    }
}
