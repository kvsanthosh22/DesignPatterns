package problem.decoratorpattern;

public class CurdRice_P extends MyLunch_P {
    @Override
    public String getDescription() {
        return "CurdRice";
    }

    @Override
    public int cost() {
        return 20;
    }
}
