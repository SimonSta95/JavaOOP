package OOPMapsAndSets;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MedicationTest {

    @Test
    void testMedicationConstructorAndGetters() {
        Medication medication = new Medication("Ibuprofen", 3.99, 50);

        assertEquals("Ibuprofen", medication.getName());
        assertEquals(3.99, medication.getPrice());
        assertEquals(50, medication.getAvailability());
    }

    @Test
    void testMedicationEqualsAndHashCode() {
        Medication medication1 = new Medication("Ibuprofen", 3.99, 50);
        Medication medication2 = new Medication("Ibuprofen", 3.99, 50);
        Medication medication3 = new Medication("Paracetamol", 2.99, 20);

        assertEquals(medication1, medication2);
        assertNotEquals(medication1, medication3);

        assertEquals(medication1.hashCode(), medication2.hashCode());
        assertNotEquals(medication1.hashCode(), medication3.hashCode());
    }

    @Test
    void testMedicationToString() {
        Medication medication = new Medication("Ibuprofen", 3.99, 50);
        String expected = "Medication{name='Ibuprofen', price=3.99, quantity=50}";

        assertEquals(expected, medication.toString());
    }
}

