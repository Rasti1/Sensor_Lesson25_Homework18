package project;

class ColorObserver implements Observer {
    @Override
    public void update(int temperature) {
        if (temperature <= 0) {
            System.out.println("Color is white.");
        } else {
            System.out.println("Color is black.");
        }
    }
}
