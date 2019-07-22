import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup() {
        manager = new Manager("Mr. Smith", "AB123456", 40000, "Marketing");
    }

    @Test
    public void hasName() {
        assertEquals("Mr. Smith", manager.getName());
    }

    @Test
    public void hasNINO() {
        assertEquals("AB123456", manager.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000, manager.getSalary());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Marketing", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.00);
        assertEquals(40400, manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(400, manager.payBonus());
    }

}
