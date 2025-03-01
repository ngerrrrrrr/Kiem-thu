package com.example.demo4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TinhTong {
    public static int tinhTong(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Bạn chưa nhập dữ liệu");
        }
        return Arrays.stream(arr).sum();
    }
}
