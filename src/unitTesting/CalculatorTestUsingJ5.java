package unitTesting;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTestUsingJ5 {


@Test
    public  void testDoSum(){
         int actualResult= Calculator.doSum(40,45);
          // expected result is 85
        int expectedResult=85;

       Assert.assertEquals("Test Fail",expectedResult,actualResult);
//        if(actualResult==expectedResult){
//            System.out.println("test Passed");
//        }else {System.out.println("test faild");}
    }
    @Test(timeout = 100)
    public void testDoSub(){
    int actualResult=Calculator.doSub(46,40);
    int expectedResult=5;
    Assert.assertEquals("test fail",expectedResult,actualResult);
    }

  // negative testing
    @Test

    public void testDosub1(){
    int expectedResult=Calculator.doSub(65,64);
    int acutalResult=3;
    Assert.assertNotEquals("Test Fail",expectedResult,acutalResult);


    }


@Test
    public void testDoMulti()
    {
    double actualResults=  Calculator.doMulti(5.0,3.0);

    double expectedResult=15.0;
    Assert.assertEquals("Test Fail",expectedResult,actualResults);
}

}
