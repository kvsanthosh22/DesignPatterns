package problem.observerpattern;

import org.junit.Test;

public class Test_ObserverPattern_p {
    @Test
    public void testObserverPatternProblem() {
        final Subscription_p subscription_p = new Subscription_p();
        subscription_p.addStudent("santhosh", "5th", 23);
    }
}
