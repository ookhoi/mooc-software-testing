package tudelft.caesarshift;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher caesarShiftCipher;

    @BeforeEach
    @DisplayName("Initialize CaesarShiftCipher ()")
    void CaesarShiftCipher() {
        caesarShiftCipher = new CaesarShiftCipher();
    }

    @ParameterizedTest(name = "gword={0}, shift={1}, result={2}")
    @CsvSource( { "abc, 3, def", "xyz, 3, abc", "sander, 26, sander", "sander, 13, fnaqre", "abc xyz, 3, def abc" } )
    @DisplayName("Verify CaesarShiftCipher")
    void verifyCaesarShiftCipher(String plainText, int shift, String encryptedText) {
        String result = caesarShiftCipher.CaesarShiftCipher(plainText, shift);
        assertEquals(encryptedText, result);
    }

}
