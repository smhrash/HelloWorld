package oop.inheritance;

public class TestCar {

    public static void main(String[] args) {

        Car car = new Car();

        car.wheel();
        car.door();
        car.headLights();
        car.sideMirror();
        car.brake();
        car.rearViewMirror();
        car.tyres();
        System.out.println("=======================================");

        ElectricCar ec = new ElectricCar();
        ec.automaticDoorHandle();
        ec.doRunWithoutGas();
        ec.headLights();
        ec.tyres();

        System.out.println("=======================================");

        HybridCar hc = new HybridCar();
        
        hc.autoGear();
        hc.twoWayPowerSupply();
        hc.door();
        hc.rearViewMirror();

    }
}
