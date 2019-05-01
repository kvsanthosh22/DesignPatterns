package problem.strategypattern;

import org.junit.Test;

public class TestCricketPlayers_P {
    @Test
    public void testCricketers() {
        final Sehwag_P sehwag_p = new Sehwag_P();
        sehwag_p.displayName();
        sehwag_p.batingSkills();
        sehwag_p.bowlingSkills();
        sehwag_p.feildingSkils();
        sehwag_p.keepingSkills();
        System.out.println("-----------------------------------------");
        final Bumrah_P bumrah_p = new Bumrah_P();
        bumrah_p.displayName();
        bumrah_p.batingSkills();
        bumrah_p.bowlingSkills();
        bumrah_p.keepingSkills();
        bumrah_p.feildingSkils();
    }
}
