package tudelft.ghappy;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class GHappyTest {

    private GHappy gHappy;

    @BeforeEach
    @DisplayName("Initialize GHappy()")
    void initializeGHappy() {
        gHappy = new GHappy();
    }

    @ParameterizedTest(name = "gword={0}, result={1}")
    @CsvSource( { "abc,false", "agc,false", "gag,false", "aaggbb, true", "ggaa,true", "aagg, true", "aaggaa,true", "abcd,false", "a, false", "g,false" } )
    @DisplayName("Verify GG")
    void verifyGG(String gword, boolean expectedResult) {
        boolean result = gHappy.gHappy(gword);
        assertEquals(expectedResult, result);
    }

}
