package test;

import main.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    @Test
    void getWeight() {
        Car test = new Car(1000.0,"Gas motor",5,null,null,null,null);
        assertEquals(1000.0,test.getWeight(),0.01);
    }

    @Test
    void getPoweredBy() {
        Car test = new Car(1000.0,"Gas motor",5,null,null,null,null);
        assertEquals("Gas motor",test.getPoweredBy());
    }

    @Test
    void getNumberOfPassangers() {
        Car test = new Car(1000.0,"Gas motor",5,null,null,null,null);
        assertEquals(5,test.getNumberOfPassangers());
    }

    @Test
    void getMotorPower() {
        Car test1 = new Car(1000.0,"Gas motor",5,null,null,null,null);
        assertEquals(10.0,test1.getMotorPower(),0.01);

        Car test2 = new Car(1000.0,"Gas motor",5,120.7,null,null,null);
        assertEquals(120.7,test2.getMotorPower(),0.01);
    }

    @Test
    void consumedCombustorCalc() {
        Car test2 = new Car(1000.0,"Gas motor",5,120.7,"XJ25", 10.0,null);
        test2.setTraveledDistance(120.0);
        assertEquals(12.0,test2.consumedCombustorCalc(),0.01);
        test2.setTraveledDistance(250.0);
        assertEquals(25.0,test2.consumedCombustorCalc(),0.01);
    }
}