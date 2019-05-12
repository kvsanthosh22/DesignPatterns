package solution.decoratorpattern.mainitems;

import solution.decoratorpattern.MyLunch_S;

public class Roti_S extends MyLunch_S {
    @Override
    public String description() {
        return "Roti";
    }

    @Override
    public int cost() {
        return 30;
    }
}
