package solution.observerpattern;

import org.junit.Test;

public class Test_ObserverPattern {

    @Test
    public void testObserverPattern_s() {
        final Subject_s subject_s = new Subject_s();
        //Now three observers are added
        final ObserverPrincipal_s observerPrincipal_s = new ObserverPrincipal_s(subject_s);
        final ObserverTeacher_s observerTeacher_s = new ObserverTeacher_s(subject_s);
        final ObserverNonTeachingStaff_s observerNonTeachingStaff_s = new ObserverNonTeachingStaff_s(subject_s);
        //Now let we add new student to school and all observers will receive mail
        subject_s.addStudent("Santhosh", "12th Standard", 18);
    }
}
