package problem.strategypattern;

/**
 * Super class exposing cricket player skills.
 * Using this super class, every players can inherit and make use of available methods.
 */
public abstract class CricketPlayer_P {

    public abstract void displayName();

    public void batingSkills() {
        System.out.println("I am a great batsman having 60 average score!");
    }

    public void bowlingSkills() {
        System.out.println("I am a spin bowler!");
    }

    public void feildingSkils() {
        System.out.println("I am not a good fielder!");
    }

    public void keepingSkills() {
        System.out.println("I am not a keeper!");
    }
}
