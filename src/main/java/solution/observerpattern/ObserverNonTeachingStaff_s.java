package solution.observerpattern;

public class ObserverNonTeachingStaff_s implements IObserver_s {
    private Subject_s subject_s;

    public ObserverNonTeachingStaff_s(final Subject_s subject_s) {
        this.subject_s = subject_s;
        subject_s.addObserver(this);
    }

    public void update(String name, int age, String standard) {
        System.out.println("Sending mail to non-teaching staff with details: new student added: " + name + " " + age + " " + standard);
    }
}
