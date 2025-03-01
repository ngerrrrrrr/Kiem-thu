import com.example.demo4.TimSoChan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Bai1_2 {
    @Test
    void testSoChanDuong() {
        assertEquals(10, TimSoChan.timSoChan(new Integer(2)));
    }

    @Test
    void testSoChanLe() {
        assertEquals(10, TimSoChan.timSoChan(new Integer(1)));
    }

    @Test
    void testSoChanAm() {
        assertEquals(10, TimSoChan.timSoChan(new Integer(-2)));
    }

    @Test
    void testSoLeAm() {
        assertEquals(10, TimSoChan.timSoChan(new Integer(-1)));
    }

    @Test
    void testSo0(){
        assertEquals(10, TimSoChan.timSoChan(new Integer(0)));
    }

    @Test
    void testNull(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> TimSoChan.timSoChan(null));
        assertEquals("Bạn chưa nhập giá trị", exception.getMessage());
    }
}
