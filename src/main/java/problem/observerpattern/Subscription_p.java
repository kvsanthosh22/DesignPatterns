package problem.observerpattern;

/**
 * As per the requirement from school,
 * Principal, sir, teacher should be updated with a mail when a new student is enrolled
 * <p>
 * NOTE: the problem by doing like this concrete approach are:
 * 1. if new person wants to be updated, we need to change the code
 * 2. Concrete approach.
 */
public class Subscription_p implements Isubscription_p {
    private String name;
    private int age;
    private String standard;

    private void updateTeachers() {
        System.out.println("Sending mail to teachers with details: new student added: " + name + " " + age + " " + standard);
    }

    private void updateSir() {
        System.out.println("Sending mail to sir with details: new student added: " + name + " " + age + " " + standard);
    }

    private void updatePrincipal() {
        System.out.println("Sending mail to principal with details: new student added: " + name + " " + age + " " + standard);
    }

    public void onStudentAdded() {
        updatePrincipal();
        updateTeachers();
        updateSir();
    }

    public void addStudent(final String name, final String standard, final int age) {
        this.name = name;
        this.age = age;
        this.standard = standard;
        onStudentAdded();
    }
}
