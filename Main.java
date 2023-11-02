import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Lingkaran {

    @Test
    public void testHitungLuasDenganRadiusPositif() {
        // Pengujian radius positif.
        double expected = 3.14 * 5 * 5;  // expected output untuk radius = 5
        double actual = Lingkaran.hitungLuas(5); // Merubah Circle menjadi Lingkaran
        assertEquals(expected, actual, 0.01);  // 0.01 adalah delta (toleransi error)
    }

    @Test
    public void testHitungLuasDenganRadiusNegatif() {
        // Pengujian radius negatif.
        assertThrows(IllegalArgumentException.class, () -> {
            Lingkaran.hitungLuas(-5); // Merubah Circle menjadi Lingkaran
        }, "Radius harus bernilai positif");
    }

    @Test
    public void testHitungLuasDenganRadiusNol() {
        // Pengujian radius bernilai 0.
        assertThrows(IllegalArgumentException.class, () -> {
            Lingkaran.hitungLuas(0); // Merubah Circle menjadi Lingkaran
        }, "Radius harus bernilai positif");
    }
}
