package tudelft.mirror;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    private Mirror mirror = new Mirror();

    @ParameterizedTest(name = "Look for \"{1}\" at both the beginning and the end of \"{0}\"")
    @CsvSource( { "abXYZba,ab", "abca,a", "aba,aba", "abXZba,ab", "abhhhca,a" } )
    @DisplayName("Look for a mirror image (backwards) string at both the beginning and end of the given string")
    void lookForMirror(String inString, String mirrorString) {
        String resultString = mirror.mirrorEnds(inString);

        assertEquals(mirrorString, resultString,
                "Look for \"{1}\" at both the beginning and the end of \"{0}\"");
    }

}
