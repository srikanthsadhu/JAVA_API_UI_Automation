import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Created by srikanthsadhu on 23/09/2018.
 */
public class CaluculatorTest {
    public static HGSCalculatorSoap calculator;

    @BeforeClass
    public static void setup() {
        calculator = new HGSCalculatorSoap();
    }


    @Test
    public void addTest() throws Exception {
        int a = 22;
        int b = 5;
        performOperation("add", a, b, a+b);


    }

    @Test
    public void substractTest() throws Exception {
        int a = 22;
        int b = 5;
        performOperation("substract", a, b, a-b);


    }
    @Test
    public void multiply() throws Exception {
        int a = 22;
        int b = 5;
        performOperation("multiply", a, b, a*b);


    }
    @Test
    public void divide() throws Exception {
        int a = 22;
        int b = 5;
        performOperation("divide", a, b, a/b);


    }



    private void performOperation(String operation, int inputParam1,int inputParam2, int expectedResult) throws Exception {
       int actualResult = 0;
        switch (operation) {
            case "add":
                 actualResult = calculator.Add(inputParam1,inputParam2);
                break;
            case "substract":
                actualResult = calculator.Subtract(inputParam1,inputParam2);
                break;
            case "divide":
                actualResult = Integer.parseInt(calculator.Divide(inputParam1,inputParam2));
                break;
            case "multiply":
                actualResult = Integer.parseInt(calculator.Multiply(inputParam1,inputParam2));
                break;
        }
        Assert.assertEquals("results from calculator dont match for operation: "+operation+" !!",actualResult , expectedResult);
    }
}
