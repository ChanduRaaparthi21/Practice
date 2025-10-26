import com.chandu.Calc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcTest {

    @Test
    public void testAdd() {
         Calc  calc= new Calc();
        int result = calc.add(2, 3);
        assertEquals(9, result, "2 + 3 should equal 5");
    }
}
