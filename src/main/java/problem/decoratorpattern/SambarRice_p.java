package problem.decoratorpattern;

public class SambarRice_p extends MyLunch_P {
    @Override
    public String getDescription() {
        return "Sambar Rice";
    }

    @Override
    public int cost() {
        return 35;
    }
}
