package org.example.poo.datastructure;

public class Demo {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.setCouleur("bleu");
        electricCar.setNbrRoue(5);

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.setCouleur("rouge");
        motorCycle.setNbrRoue(2);

        PetrolCar petrolCar = new PetrolCar();
        petrolCar.setCouleur("noir");
        motorCycle.setNbrRoue(4);

        SuperCar superCar = new SuperCar();

        Engine[] engines = {electricCar, motorCycle, petrolCar};

        for (Engine engine: engines) {
            moveVehicle(engine);
        }

        Vehicle[] vehicles = {superCar, electricCar, petrolCar, motorCycle};
    }

    public static void moveVehicle(Engine engine){
        if (engine instanceof ElectricCar){
            System.out.println("electrique");

            ((ElectricCar) engine).drive();
        } else if (engine instanceof MotorCycle) {
            System.out.println("motorcylce");
            ((MotorCycle) engine).drive();
        } else if (engine instanceof PetrolCar) {
            System.out.println("petrolcar");
            ((PetrolCar) engine).drive();
        }
    }

}
