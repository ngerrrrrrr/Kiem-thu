import com.example.demo4.TinhTong;
import com.example.demo4.TongMangBoQua100;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Bai1_3 {
    @Test
    void testTinhTong(){
        assertEquals(120, TongMangBoQua100.tinhTong(new int[]{80, 40, 120}));
        assertEquals(0, TongMangBoQua100.tinhTong(new int[]{150}));
        assertEquals(-10, TongMangBoQua100.tinhTong(new int[]{-5, -5, 130}));
        assertEquals(0, TongMangBoQua100.tinhTong(new int[]{0, 0, 0, 120}));
        assertEquals(10, TongMangBoQua100.tinhTong(new int[]{-5, 15, 120}));
    }

    @Test
    void testNullArr() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> TongMangBoQua100.tinhTong(null));
        assertEquals("Bạn chưa nhập dữ liệu", exception.getMessage());
    }
}
