package unitTesting;

public class Calculator {

    /**
     * this method is to do summation
     * @param num1
     * @param num2
     * @return
     * Athor: Ali
     */
    public static int doSum(int number1, int number2){
       int  num1=number1;
        int num2=number2;
        int total=num1+num2;
        System.out.println("Total is "+total);
        return total;
    }

    /**
     * this method is to do the sub
     * @param number1
     * @param number2
     * @return
     * Author: Ali
     */
   public static int doSub(int number1, int number2){
        int num1= number1;
        int num2= number2;
        int total= num1-num2;
       System.out.println("the total is "+total);
        return total;
   }

    /**
     * this method is to do multiplication
     * @param num1
     * @param num2
     * @return
     * Author: Ali
     */
 public static double doMulti(double num1,double num2){
double total=num1*num2;
       return num1*num2;
 }
}
