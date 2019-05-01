package solution.strategypattern.players;

import solution.strategypattern.skills.BattingSkills;
import solution.strategypattern.skills.BowlingSkills;
import solution.strategypattern.skills.FieldingSkills;

public class CricketPlayers_S {
    public BattingSkills battingSkills;
    public BowlingSkills bowlingSkills;
    public FieldingSkills fieldingSkills;

    public void showBattingSkills() {
        battingSkills.battingSkills();
    }

    public void showFieldingSkills() {
        fieldingSkills.fieldingSkills();
    }

    public void showBowlingSkills() {
        bowlingSkills.bowlingSkills();
    }

    public BattingSkills getBattingSkills() {
        return battingSkills;
    }

    public void setBattingSkills(BattingSkills battingSkills) {
        this.battingSkills = battingSkills;
    }

    public BowlingSkills getBowlingSkills() {
        return bowlingSkills;
    }

    public void setBowlingSkills(BowlingSkills bowlingSkills) {
        this.bowlingSkills = bowlingSkills;
    }

    public FieldingSkills getFieldingSkills() {
        return fieldingSkills;
    }

    public void setFieldingSkills(FieldingSkills fieldingSkills) {
        this.fieldingSkills = fieldingSkills;
    }
}
