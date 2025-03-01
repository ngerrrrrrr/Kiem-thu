import com.example.demo4.QuanLySinhVien;
import com.example.demo4.SinhVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bai2 {
    private QuanLySinhVien quanLySinhVien;

    @BeforeEach
        void setUp(){
            quanLySinhVien = new QuanLySinhVien();
    }

    @Test
    void testThem(){
        SinhVien sinhVien = new SinhVien("SV01", "Long", 20, 9.0f, 2, "PTPM");
        quanLySinhVien.them(sinhVien);
        assertEquals(sinhVien, quanLySinhVien.timKiem("SV01"));
    }
}
