package test.java;

import main.java.RPNCalculate;
import junit.framework.TestCase;
public class TestRPN extends TestCase{

	
	 public void testRPN1()
     {
            RPNCalculate obj = new RPNCalculate();
            assertEquals((float)4.0, obj.calculate("2 2 +") );
            
     }
     public void testRPN2()
     {
    	 RPNCalculate obj = new RPNCalculate();
            assertEquals((float)7.0, obj.calculate("2 5 +") );
            
     }
     
     public void testRPN3()
     {
    	 RPNCalculate obj = new RPNCalculate();
    	 try{
            assertEquals((float)7.0, obj.calculate("+2 5 +") );
    	 }catch(Exception e){
    	 	 System.out.print("Wrong Input"); 
    	  }
            
     }
     
     public void testRPN4()
     {
    	 RPNCalculate obj = new RPNCalculate();
            assertEquals((float)29.0, obj.calculate("4 ! 5 +") );
            
     }
     
     public void testRPN5()
     {
    	 RPNCalculate obj = new RPNCalculate();
            assertEquals((float)13.0, obj.calculate("2 3 ^ 5 +") );
            
     }
     
     public void testRPN6()
     {
    	 RPNCalculate obj = new RPNCalculate();
            assertEquals((float)10.0, obj.calculate("80 % 5 * 3 - 10 *") );
            
     }
     
     public void testAdd()
     {
    	 RPNCalculate obj = new RPNCalculate();
            assertEquals((float)85.0, obj.calculate("80 5 +") );
            
     }
     
     public void testSub()
     {
    	 RPNCalculate obj = new RPNCalculate();
            assertEquals((float)75.0, obj.calculate("80 5 -") );
            
     }
     
     public void testFact()
     {
    	 RPNCalculate obj = new RPNCalculate();
            assertEquals((float)120.0, obj.calculate("5 !") );
            
     }
}

