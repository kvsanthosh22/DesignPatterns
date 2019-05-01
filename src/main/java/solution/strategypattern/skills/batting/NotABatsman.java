package solution.strategypattern.skills.batting;

import solution.strategypattern.skills.BattingSkills;

public class NotABatsman implements BattingSkills {
    public void battingSkills() {
        System.out.println("I am not a batsman! I hate to bat.");
    }
}
