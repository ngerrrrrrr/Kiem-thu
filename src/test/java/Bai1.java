import com.example.demo4.TinhTong;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Bai1 {
    @Test
    void testTinhTong(){
        assertEquals(10, TinhTong.tinhTong(new int[]{1, 2, 3, 4}));
        assertEquals(0, TinhTong.tinhTong(new int[]{}));
        assertEquals(-10, TinhTong.tinhTong(new int[]{-5, -5}));
        assertEquals(0, TinhTong.tinhTong(new int[]{0, 0, 0}));
        assertEquals(10, TinhTong.tinhTong(new int[]{-5, 15}));
    }

    @Test
    void testNullArr() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> TinhTong.tinhTong(null));
        assertEquals("Bạn chưa nhập dữ liệu", exception.getMessage());
    }
}
