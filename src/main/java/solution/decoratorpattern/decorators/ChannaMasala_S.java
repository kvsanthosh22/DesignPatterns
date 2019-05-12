package solution.decoratorpattern.decorators;

import solution.decoratorpattern.MyLunch_Decorator_S;
import solution.decoratorpattern.MyLunch_S;

public class ChannaMasala_S extends MyLunch_Decorator_S {
    private MyLunch_S myLunch_s;

    public ChannaMasala_S(final MyLunch_S myLunch_s) {
        this.myLunch_s = myLunch_s;
    }

    @Override
    public String description() {
        return myLunch_s.description()+ "Channa Masala";
    }

    @Override
    public int cost() {
        return 20 + myLunch_s.cost();
    }
}
