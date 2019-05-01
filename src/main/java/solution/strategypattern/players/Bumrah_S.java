package solution.strategypattern.players;

import solution.strategypattern.skills.batting.NotABatsman;
import solution.strategypattern.skills.bowling.BestBowler;
import solution.strategypattern.skills.fielding.AverageFielder;

public class Bumrah_S {
    public void showMySkills() {
        final CricketPlayers_S cricketPlayers = new CricketPlayers_S();
        System.out.println("Hello I am Bumrah! Here is my profile:");
        cricketPlayers.setBattingSkills(new NotABatsman());
        cricketPlayers.setFieldingSkills(new AverageFielder());
        cricketPlayers.setBowlingSkills(new BestBowler());
        cricketPlayers.showBattingSkills();
        cricketPlayers.showFieldingSkills();
        cricketPlayers.showBowlingSkills();
    }
}
