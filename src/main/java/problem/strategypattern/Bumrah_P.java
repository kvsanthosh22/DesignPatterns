package problem.strategypattern;

/**
 * Here comes the problem. Bumrah IS-A cricket player having skills.
 * But he is not a batsman and keeper. He is a bowler.
 * So he need to override these skills individually to project himself as best bowler
 * The problems are:
 * 1. Code re-usability is gone
 * 2. Code maintenance is gone
 * 3. Code duplication
 * 4. Composition over inheritance violated
 * 5. Increasing in number of lines in code if new skills are added like all-rounder skills
 */
public class Bumrah_P extends CricketPlayer_P {
    public void displayName() {
        System.out.println("Hello I am Bumrah! Here is my profile..");
    }

    @Override
    public void batingSkills() {
        System.out.println("I am not a batsmen!");
    }

    @Override
    public void keepingSkills() {
        System.out.println("I am not a keeper!");
    }

    @Override
    public void feildingSkils() {
        System.out.println("I am an average fielder!");
    }

    @Override
    public void bowlingSkills() {
        System.out.println("I am the best bowler in the world!");
    }
}
