package solution.decoratorpattern.mainitems;

import solution.decoratorpattern.MyLunch_S;

/**
 * Attaches additional responsibility to object at runtime
 */
public class Chapathi_S extends MyLunch_S {
    @Override
    public String description() {
        return "Chapathi";
    }

    @Override
    public int cost() {
        return 25;
    }
}
