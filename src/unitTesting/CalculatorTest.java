package unitTesting;

import org.junit.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTest {

// After will execute last
@After
    public  void testDoSum(){
         int actualResult= Calculator.doSum(40,45);
          // expected result is 85
        int expectedResult=85;

       Assert.assertEquals("Test Fail",expectedResult,actualResult);
//        if(actualResult==expectedResult){
//            System.out.println("test Passed");
//        }else {System.out.println("test faild");}
    }
    // @before will execute the test case first
    @Before @DisplayName("we are testing DoSub method")
    public void testDoSub(){
    int actualResult=Calculator.doSub(46,40);
    int expectedResult=6;
    Assert.assertEquals("test fail",expectedResult,actualResult);
    }

  // negative testing
    @Test @DisplayName("first test case")

    public void testDosub1(){
    int expectedResult=Calculator.doSub(65,64);
    int acutalResult=3;
    Assert.assertNotEquals("Test Fail",expectedResult,acutalResult);


    }


    // After will execute last
@Test
    public void testDoMulti()
    {
    double actualResults=  Calculator.doMulti(5.0,3.0);

    double expectedResult=15.0;

    Assert.assertEquals("Test Fail",expectedResult,actualResults);
}
@BeforeAll
    public static void welcome()
{
    System.out.println("before Class");
}

}
