package class_activity_5A;

import org.junit.jupiter.api.Test;
import week_3.class_activity_17A.class_activity_5A.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    /*@Test
    void itShouldAddTwoNumbers() {
        SimpleCalculator calculator = new SimpleCalculator();

        int actual = calculator.addTwoNumbers(2,2);
       // int expected = 4; OR

        assertEquals(5, actual);*/

    @Test
    void ItShouldAddTwoNumbers(){
        SimpleCalculator calculator = new SimpleCalculator();

        int actual = calculator.addTwoNumbers(2,2);
        assertEquals(5, actual);


    }
    /*@Test
    void itShouldPrintHelloWorld(){
        SimpleCalculator calculator = new SimpleCalculator();

        String actual = calculator.hello();
        String expected = "Hello World";

        assertEquals(actual, expected);*/

       @Test
    void itShouldPrintHelloWorld(){
           SimpleCalculator calculator = new SimpleCalculator();

           String actual = calculator.hello();
           String expected = "Hello World";

           assertEquals(actual, expected);
    }
}