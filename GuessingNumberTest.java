package Test;

import static org.junit.jupiter.api.Assertions.*;
import Java.GuessingNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class GuessingNumberTest {
    GuessingNumber guessTest;
    @BeforeEach
    void setUp()
    {
        guessTest = new GuessingNumber();
    }
    @Test
    void test()
    {
        int output = guessTest.guessNumber();
        assertEquals(1, output);
    }
    @AfterEach
    void tearDown()
    {
    }
}