package problem.decoratorpattern;

import org.junit.Test;

public class Test_DecoratorPattern_P {

    @Test
    public void testDecoratorPatternProblem() {
        final SambarRice_p sambarRice_p = new SambarRice_p();

        final SambarPlusCurdRice_p sambarPlusCurdRice_p = new SambarPlusCurdRice_p();

        System.out.println("Bill: " + sambarPlusCurdRice_p.getDescription() + " : " + " Rs. " + sambarPlusCurdRice_p.cost());
    }
}
