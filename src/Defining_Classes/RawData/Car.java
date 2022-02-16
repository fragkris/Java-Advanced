package Defining_Classes.RawData;

import java.util.List;
import java.util.Map;

public class Car {

    private String model;
    private Engine engine; //speed, power
    private Cargo cargo; //weight, Type
    private Tires tires;//t1 pressure, t1 age, t2 pressure, t2 age, ...

    public Car(String model, Engine engine, Cargo cargo, Tires tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tires getTires() {
        return tires;
    }
}
