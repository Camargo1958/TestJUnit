package test;

import main.Cup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Water", 85.5);
        assertEquals("Water",c.getLiquidType());
        assertNotEquals("Juice",c.getLiquidType());
    }

    @Test
    void setLiquidType() {
        Cup a = new Cup("Cofee", 56.7);
        a.setLiquidType("Coke");
        assertEquals("Coke",a.getLiquidType());
        assertNotEquals("Coca",a.getLiquidType());
        a.setPercentFull(34.5);
        assertEquals("Coke",a.getLiquidType());
    }

    @Test
    void getPercentFull() {
        Cup c = new Cup("Water", 85.5);
        assertEquals(85.5,c.getPercentFull(),0.001);
        Cup d = new Cup("Juice", 98.4);
        assertNotEquals(85.5,d.getPercentFull(),0.001);
        assertEquals(98.4,d.getPercentFull(),0.001);
    }

    @Test
    void setPercentFull() {
        Cup d = new Cup("Conhaque",67.9);
        assertNotEquals(85.5,d.getPercentFull(),0.001);
        assertEquals(67.9,d.getPercentFull(),0.001);
        d.setLiquidType("Coke");
        assertEquals(67.9,d.getPercentFull(),0.001);
    }

    @Test
    void getFillStatus() {
        Cup e = new Cup("Wine", 50.0);
        assertEquals("Half", e.getFillstatus());
        e.setPercentFull(0.0);
        assertEquals("Empty", e.getFillstatus());
        e.setPercentFull(5.0);
        assertEquals("Empty", e.getFillstatus());
        e.setPercentFull(5.1);
        assertEquals("Minimum", e.getFillstatus());
        e.setPercentFull(25.0);
        assertEquals("Minimum", e.getFillstatus());
        e.setPercentFull(25.1);
        assertEquals("Almost Half", e.getFillstatus());
        e.setPercentFull(45.0);
        assertEquals("Almost Half", e.getFillstatus());
        e.setPercentFull(45.1);
        assertEquals("Half", e.getFillstatus());
        e.setPercentFull(50.0);
        assertEquals("Half", e.getFillstatus());
        e.setPercentFull(60.0);
        assertEquals("Half", e.getFillstatus());
        e.setPercentFull(60.1);
        assertEquals("Almost Full", e.getFillstatus());
        e.setPercentFull(65.0);
        assertEquals("Almost Full", e.getFillstatus());
        e.setPercentFull(94.9);
        assertEquals("Almost Full", e.getFillstatus());
        e.setPercentFull(95.0);
        assertEquals("Full", e.getFillstatus());
        e.setPercentFull(100.0);
        assertEquals("Full", e.getFillstatus());
        e.setPercentFull(100.1);
        assertEquals("LEVEL METER OUT OF RANGE", e.getFillstatus());
        e.setPercentFull(-0.05);
        assertEquals("LEVEL METER OUT OF RANGE", e.getFillstatus());
    }


}