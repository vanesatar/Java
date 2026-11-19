package sef.module9.activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        person.setWeight(70);
        assertEquals(70, person.getWeight());

        person.setHeight(1.70f);
        assertEquals(1.70f, person.getHeight(), 0.001f);
    }

    @Test
    public void testGetBodyMassIndex() {
        assertEquals("Underweight", person.getBodyMassIndex(50, 1.70));
        assertEquals("Normal weight", person.getBodyMassIndex(70, 1.70));
        assertEquals("Overweight", person.getBodyMassIndex(85, 1.70));
        assertEquals("Obese", person.getBodyMassIndex(100, 1.70));

        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.70));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(-10, 1.70));
        assertEquals("Invalid input", person.getBodyMassIndex(70, -1.70));
        assertEquals("Invalid input", person.getBodyMassIndex(601, 1.70));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 3.1));
    }
}
