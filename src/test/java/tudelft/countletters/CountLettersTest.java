package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void firstWordDoesMatch() {
        int words = new CountLetters().count("car|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWordDoesMatch() {
        int words = new CountLetters().count("cats|tester");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void NoMatch() {
        int words = new CountLetters().count("coffee|tax");
        Assertions.assertEquals(0, words);
    }

}
