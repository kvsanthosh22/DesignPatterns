package solution.observerpattern;

public class ObserverPrincipal_s implements IObserver_s {
    private Subject_s subject;

    public ObserverPrincipal_s(final Subject_s subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void update(String name, int age, String standard) {
        System.out.println("Sending mail to principal with details: new student added: " + name + " " + age + " " + standard);
    }
}
