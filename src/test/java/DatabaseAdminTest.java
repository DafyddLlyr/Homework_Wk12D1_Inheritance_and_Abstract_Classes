import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dbAdmin;

    @Before
    public void setup() {
        dbAdmin = new DatabaseAdmin("Bob", "AB123456", 30000);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", dbAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("AB123456", dbAdmin.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, dbAdmin.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(300, dbAdmin.payBonus());
    }

    @Test
    public void canRaiseSalary() {
        dbAdmin.raiseSalary(2.00);
        assertEquals(30600, dbAdmin.getSalary());
    }

    @Test
    public void cannotUseNegativeValueForRaisingSalary() {
        dbAdmin.raiseSalary(-2.00);
        assertEquals(30000, dbAdmin.getSalary());
    }

    @Test
    public void canChangeName() {
        dbAdmin.setName("James");
        assertEquals("James", dbAdmin.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        dbAdmin.setName(null);
        assertEquals("Bob", dbAdmin.getName());
    }

}
