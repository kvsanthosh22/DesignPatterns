package solution.decoratorpattern.decorators;

import solution.decoratorpattern.MyLunch_Decorator_S;
import solution.decoratorpattern.MyLunch_S;

public class Sambar_S extends MyLunch_Decorator_S {
    private MyLunch_S myLunch_s;

    public Sambar_S(final MyLunch_S myLunch_s) {
        this.myLunch_s = myLunch_s;
    }

    @Override
    public String description() {
        return myLunch_s.description() + " Sambar";
    }

    @Override
    public int cost() {
        return 10 + myLunch_s.cost();
    }
}
