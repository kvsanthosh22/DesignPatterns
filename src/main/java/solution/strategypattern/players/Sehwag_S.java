package solution.strategypattern.players;

import solution.strategypattern.skills.batting.BestBatsman;
import solution.strategypattern.skills.bowling.AverageBowler;
import solution.strategypattern.skills.fielding.AverageFielder;

public class Sehwag_S {

    public void showMySkills() {
        final CricketPlayers_S cricketPlayers = new CricketPlayers_S();
        System.out.println("Hello I am Sehwag! Here is my profile:");
        cricketPlayers.setBattingSkills(new BestBatsman());
        cricketPlayers.setBowlingSkills(new AverageBowler());
        cricketPlayers.setFieldingSkills(new AverageFielder());
        cricketPlayers.showBattingSkills();
        cricketPlayers.showFieldingSkills();
        cricketPlayers.showBowlingSkills();
    }
}
