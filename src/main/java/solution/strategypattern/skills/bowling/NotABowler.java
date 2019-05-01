package solution.strategypattern.skills.bowling;

import solution.strategypattern.skills.BowlingSkills;

public class NotABowler implements BowlingSkills {
    public void bowlingSkills() {
        System.out.println("I am not a bowler!");
    }
}
