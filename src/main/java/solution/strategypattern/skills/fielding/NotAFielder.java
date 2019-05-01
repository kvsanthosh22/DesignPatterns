package solution.strategypattern.skills.fielding;

import solution.strategypattern.skills.FieldingSkills;

public class NotAFielder implements FieldingSkills {
    public void fieldingSkills() {
        System.out.println("I am not a fielder!");
    }
}
