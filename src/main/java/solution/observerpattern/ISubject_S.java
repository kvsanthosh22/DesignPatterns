package solution.observerpattern;

public interface ISubject_S {
    void addObserver(final IObserver_s observer);

    void removeObserver(final IObserver_s observer);

    void notifyObserver();
}
