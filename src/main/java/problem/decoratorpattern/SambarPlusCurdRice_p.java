package problem.decoratorpattern;

public class SambarPlusCurdRice_p extends MyLunch_P {
    @Override
    public String getDescription() {
        return "Sambar plus curd rice";
    }

    @Override
    public int cost() {
        return 50;
    }
}
