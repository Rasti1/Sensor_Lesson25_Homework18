package project;

public class ObserverPatternDemo {
    public static void main(String[] args) {

        Substance substance = new Substance();
        Observer colorObserver = new ColorObserver();
        Observer weightObserver = new WeightObserver();

        substance.registerObserver(colorObserver);
        substance.registerObserver(weightObserver);

        substance.setTemperature(10);
        substance.setTemperature(-4);

    }
}
