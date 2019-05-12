package solution.decoratorpattern.mainitems;

import solution.decoratorpattern.MyLunch_S;

public class WhiteRice extends MyLunch_S {
    @Override
    public String description() {
        this.description = "White Rice";
        return description;
    }

    @Override
    public int cost() {
        return 20;
    }
}
