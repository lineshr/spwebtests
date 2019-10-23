import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class ValidatorTest {
public static void main()
 
@Test
 public void TestValidate()
{
    Boolean actual, expected=true;
    Validator val = new Validator();
    actual = val.Validate("Gouri", "Sohoni");
    assertEquals(expected,actual);
}
}
