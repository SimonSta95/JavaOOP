package OOPMapsAndSets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PharmacyTest {

    private Pharmacy pharmacy;

    @BeforeEach
    void setUp() {
        pharmacy = new Pharmacy();
    }

    @Test
    void testSaveAndGetCount() {
        assertEquals(0, pharmacy.getCount());

        Medication medication = new Medication("Ibuprofen", 3.99, 50);
        pharmacy.save(medication);

        assertEquals(1, pharmacy.getCount());
    }

    @Test
    void testFindMedication() {
        Medication medication = new Medication("Ibuprofen", 3.99, 50);
        pharmacy.save(medication);

        Medication found = pharmacy.findMedication("Ibuprofen");
        assertNotNull(found);
        assertEquals("Ibuprofen", found.getName());
        assertEquals(3.99, found.getPrice());
        assertEquals(50, found.getAvailability());

        Medication notFound = pharmacy.findMedication("Paracetamol");
        assertNull(notFound);
    }

    @Test
    void testDeleteMedication() {
        Medication medication = new Medication("Ibuprofen", 3.99, 50);
        pharmacy.save(medication);
        assertEquals(1, pharmacy.getCount());

        pharmacy.delete("Ibuprofen");
        assertEquals(0, pharmacy.getCount());

        Medication notFound = pharmacy.findMedication("Ibuprofen");
        assertNull(notFound);
    }

    @Test
    void testPrintStorage() {
        Medication med1 = new Medication("Ibuprofen", 3.99, 50);
        Medication med2 = new Medication("Paracetamol", 2.99, 20);

        pharmacy.save(med1);
        pharmacy.save(med2);

        pharmacy.printStorage();
    }
}

