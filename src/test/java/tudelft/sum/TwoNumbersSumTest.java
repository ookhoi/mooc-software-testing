package tudelft.sum;

import java.util.ArrayList;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class TwoNumbersSumTest {

    private TwoNumbersSum twosum;

    @BeforeEach
    @DisplayName("Initialize TwoNumbersSum()")
    void initializeTwoNumbersSum() {
        twosum = new TwoNumbersSum();
    }

    @Test
    @DisplayName("sum 11 and 22")
    void sum11and12() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(Integer.valueOf(1));
        number1.add(Integer.valueOf(1));
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(Integer.valueOf(2));
        number2.add(Integer.valueOf(2));
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(Integer.valueOf(3));
        expectedResult.add(Integer.valueOf(3));
        ArrayList<Integer> result = twosum.addTwoNumbers(number1, number2);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("sum 10 and 20")
    void sum10and20() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(Integer.valueOf(1));
        number1.add(Integer.valueOf(0));
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(Integer.valueOf(2));
        number2.add(Integer.valueOf(0));
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(Integer.valueOf(3));
        expectedResult.add(Integer.valueOf(0));
        ArrayList<Integer> result = twosum.addTwoNumbers(number1, number2);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("sum 99 and 99")
    void sum99and99() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(Integer.valueOf(9));
        number1.add(Integer.valueOf(9));
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(Integer.valueOf(9));
        number2.add(Integer.valueOf(9));
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(Integer.valueOf(1));
        expectedResult.add(Integer.valueOf(9));
        expectedResult.add(Integer.valueOf(8));
        ArrayList<Integer> result = twosum.addTwoNumbers(number1, number2);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("sum 1 and 12")
    void sum1and12() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(Integer.valueOf(1));
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(Integer.valueOf(1));
        number2.add(Integer.valueOf(2));
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(Integer.valueOf(1));
        expectedResult.add(Integer.valueOf(3));
        ArrayList<Integer> result = twosum.addTwoNumbers(number1, number2);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("sum 9 and 9")
    void sum9and9() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(Integer.valueOf(9));
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(Integer.valueOf(9));
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(Integer.valueOf(1));
        expectedResult.add(Integer.valueOf(8));
        ArrayList<Integer> result = twosum.addTwoNumbers(number1, number2);
        assertEquals(expectedResult, result);
    }

}
