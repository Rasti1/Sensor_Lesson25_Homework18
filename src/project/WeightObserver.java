package project;

class WeightObserver implements Observer {
    @Override
    public void update(int temperature) {
        int weight = Math.max(1, 1 + temperature * 2);
        System.out.println("Weight is " + weight + "g.");
    }
}
