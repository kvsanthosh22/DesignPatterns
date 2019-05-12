package problem.decoratorpattern;

/**
 * Our hotel now started with few products. SO as of now not an issue.
 * If new products added on daily basis our system will get class explosion and difficult to maintain.
 */
public abstract class MyLunch_P {
    public String description = "Unknown food";

    public abstract int cost();

    public String getDescription() {
        return description;
    }
}
