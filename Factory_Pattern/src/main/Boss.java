package main;

public class Boss {

    public void viewCar() {
        CarFactory carFactory = new CarFactory();
        carFactory.viewCar("HONDA");
        carFactory.viewCar("NEXUS");
        carFactory.viewCar("TOYOTA");
    }

}
