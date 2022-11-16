package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrillTest{
    @Test
    public void priceOfCopiesBetween1And4Test(){
        //given I have a test
        Drill drill = new Drill();
        //given I have a quantity of 2
        drill.multiply(2);
        //when I multiply the quantity by the amount
        int amount = drill.multiply(2);
        //check that price is correct
        assertEquals(4000,amount);
    }

    @Test
    public void priceOfCopiesBetween5And9Test(){
        //given I have a test
        Drill drill = new Drill();
        //given I have a quantity of 6
        drill.multiply(6);
        //when I multiply the quantity by the amount
        int amount = drill.multiply(6);
        //check that price is correct
        assertEquals(10_800,amount);
    }

    @Test
    public void priceOfCopiesBetween10And29Test(){
        //given I have a test
        Drill drill = new Drill();
        //given I have a quantity of 10
        drill.multiply(10);
        //when I multiply the quantity by the amount
        int amount = drill.multiply(10);
        //check that price is correct
        assertEquals(16_000, amount);
    }

    @Test
    public void priceOfCopiesBetween30And49Test(){
        //given I have a test
        Drill drill = new Drill();
        //given I have a quantity of 30
        drill.multiply(30);
        //when I multiply the quantity by the amount
        int amount = drill.multiply(30);
        //check that price is correct
        assertEquals(45_000, amount);
    }

    @Test
    public void priceOfCopiesBetween50And99Test(){
        //given I have a test
        Drill drill = new Drill();
        //given I have a quantity of 50
        drill.multiply(50);
        //when I multiply the quantity by the amount
        int amount = drill.multiply(52);
        //check that price is correct
        assertEquals(67_600, amount);
    }

    @Test
    public void priceOfCopiesBetween100And199Test(){
        //given I have a test
        Drill drill = new Drill();
        //given I have a quantity of 100
        drill.multiply(100);
        //when I multiply the quantity by the amount
        int amount = drill.multiply(120);
        //check that price is correct
        assertEquals(144_000, amount);
    }

    @Test
    public void priceOfCopiesBetween200And499Test(){
        //given I have a test
        Drill drill = new Drill();
        //given I have a quantity of 200
        drill.multiply(200);
        //when I multiply the quantity by the amount
        int amount = drill.multiply(200);
        //check that price is correct
        assertEquals(220_000, amount);
    }

    @Test
    public void priceOfCopiesBetween500AndAboveTest(){
        //given I have a test
        Drill drill = new Drill();
        //given I have a quantity of 500
        drill.multiply(500);
        //when I multiply the quantity by the amount
        int amount = drill.multiply(500);
        //check that price is correct
        assertEquals(500_000, amount);
    }
}
