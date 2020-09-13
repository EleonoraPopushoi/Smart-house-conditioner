package ru.netology.smart.house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature (16);
        conditioner.setMaxTemperature (26);
        conditioner.setCurrentTemperature (21);
        conditioner.increaseCurrentTemperature();
        assertEquals(22, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature (16);
        conditioner.setMaxTemperature (26);
        conditioner.setCurrentTemperature (21);
        conditioner.decreaseCurrentTemperature();
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureStartingFromMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature (16);
        conditioner.setMaxTemperature (26);
        conditioner.setCurrentTemperature (26);
        conditioner.increaseCurrentTemperature();
        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureStartingFromMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature (16);
        conditioner.setMaxTemperature (26);
        conditioner.setCurrentTemperature (16);
        conditioner.decreaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureStartingFromMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature (16);
        conditioner.setMaxTemperature (26);
        conditioner.setCurrentTemperature (16);
        conditioner.increaseCurrentTemperature();
        assertEquals(17, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureStartingFromMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature (16);
        conditioner.setMaxTemperature (26);
        conditioner.setCurrentTemperature (26);
        conditioner.decreaseCurrentTemperature();
        assertEquals(25, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature (16);
        conditioner.setMaxTemperature (26);
        conditioner.setCurrentTemperature (30);
        conditioner.increaseCurrentTemperature();
        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureAboveMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature (16);
        conditioner.setMaxTemperature (26);
        conditioner.setCurrentTemperature (12);
        conditioner.decreaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }
}
