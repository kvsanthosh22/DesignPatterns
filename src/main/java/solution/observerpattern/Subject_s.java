package solution.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Observer pattern makes publisher + subscription
 * <p>
 * Now it is easy to add new observes
 */
public class Subject_s implements ISubject_S {
    private final List<IObserver_s> observers;
    private String name;
    private int age;
    private String standard;

    public Subject_s() {
        observers = new ArrayList<IObserver_s>();
    }

    public void addObserver(IObserver_s observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver_s observer) {
        final int position = observers.indexOf(observer);
        if (position > 0) {
            observers.remove(position);
        }
    }

    public void addStudent(final String name, final String standard, final int age) {
        this.name = name;
        this.age = age;
        this.standard = standard;
        notifyObserver();
    }

    public void notifyObserver() {
        observers.forEach(observers -> observers.update(name, age, standard));
    }
}
