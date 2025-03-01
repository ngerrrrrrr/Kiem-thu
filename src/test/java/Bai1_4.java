import com.example.demo4.TongMangBoQua100;
import com.example.demo4.TongMangKhongChia8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Bai1_4 {
    @Test
    void testTinhTong(){
        assertEquals(30, TongMangKhongChia8.tinhTong(new int[]{25, 5}));
        assertEquals(0, TongMangKhongChia8.tinhTong(new int[]{}));
        assertEquals(0, TongMangKhongChia8.tinhTong(new int[]{0, 0, 0}));
        assertEquals(10, TongMangKhongChia8.tinhTong(new int[]{10}));
    }

    @Test
    void testNullArr() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> TongMangKhongChia8.tinhTong(null));
        assertEquals("Bạn chưa nhập dữ liệu", exception.getMessage());
    }
}
