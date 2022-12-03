package Test;
import static org.junit.jupiter.api.Assertions.*;
import Java.DragonCave;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DragonCaveTest {
    DragonCave test;
    @BeforeEach
    void setUp()
    {
        test = new DragonCave();
    }
    @Test
    void test()
    {
        int output = test.chooseCave();
        assertEquals(1, output);
    }
    @AfterEach
    void tearDown()
    {
    }
}