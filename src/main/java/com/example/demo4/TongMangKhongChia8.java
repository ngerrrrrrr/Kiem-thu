package com.example.demo4;

import java.util.Arrays;

public class TongMangKhongChia8 {
    public static int tinhTong(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Bạn chưa nhập dữ liệu");
        }
        return Arrays.stream(arr)
                .filter(num -> num >= 1 && num <= 50 && num % 8 != 0) // Giữ số trong khoảng 1-50, bỏ số chia hết cho 8
                .sum();

    }
}
