package solution.decoratorpattern;

public abstract class MyLunch_S {
    public String description;

    public String description() {
        return description;
    }

    public abstract int cost();
}
