package solution.decoratorpattern;

import org.junit.Test;
import solution.decoratorpattern.decorators.ButterMilk_S;
import solution.decoratorpattern.decorators.ChannaMasala_S;
import solution.decoratorpattern.decorators.Sambar_S;
import solution.decoratorpattern.mainitems.Chapathi_S;
import solution.decoratorpattern.mainitems.WhiteRice;

public class Test_DecoratorPattern_S {
    @Test
    public void testDecoratorPatternSolution() {
        final MyLunch_S myLunch_s = new ButterMilk_S(new Sambar_S(new WhiteRice()));

        System.out.println("Bill: " + myLunch_s.description() + ": Rs. " + myLunch_s.cost());

        final MyLunch_S myLunch_s1 = new ChannaMasala_S(new ButterMilk_S(new Chapathi_S()));

        System.out.println("Bill: " + myLunch_s1.description() + ": Rs. " + myLunch_s1.cost());

    }
}
