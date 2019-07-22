import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setup() {
        developer = new Developer("Jim", "AB123456", 25000);
    }

    @Test
    public void canGetName() {
        assertEquals("Jim", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("AB123456", developer.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(25000, developer.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, developer.payBonus());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2.00);
        assertEquals(25500, developer.getSalary());
    }

}
