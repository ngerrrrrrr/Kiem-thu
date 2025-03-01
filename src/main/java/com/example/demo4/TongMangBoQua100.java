package com.example.demo4;

import java.util.Arrays;

public class TongMangBoQua100 {

    public static int tinhTong(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Bạn chưa nhập dữ liệu");
        }
        return Arrays.stream(arr)
                .filter(num -> num <= 100) // Bỏ qua số lớn hơn 100
                .sum();
    }
}
