package solution.observerpattern;

public class ObserverTeacher_s implements IObserver_s {
    private Subject_s subject;

    public ObserverTeacher_s(final Subject_s subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void update(String name, int age, String standard) {
        System.out.println("Sending mail to teachers with details: new student added: " + name + " " + age + " " + standard);
    }
}
