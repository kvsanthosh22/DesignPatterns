package solution.strategypattern;

import org.junit.Test;
import solution.strategypattern.players.Bumrah_S;
import solution.strategypattern.players.Sehwag_S;

public class TestCricketPlayers_S {
    @Test
    public void testMySkills() {
        final Sehwag_S sehwag_s = new Sehwag_S();
        sehwag_s.showMySkills();
        System.out.println("-------------------------------");
        final Bumrah_S bumrah_s = new Bumrah_S();
        bumrah_s.showMySkills();
    }
}
