import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup() {
        director = new Director("Ricky", "AB123456", 100000, "Technology", 20000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Ricky", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("AB123456", director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100000, director.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Technology", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(20000.00, director.getBudget(), 0.00);
    }

    @Test
    public void directorBonusIsTwoPercent() {
        assertEquals(2000, director.payBonus());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5.00);
        assertEquals(105000, director.getSalary());
    }

    @Test
    public void cannotUseNegativeValueForRaisingSalary() {
        director.raiseSalary(-2.00);
        assertEquals(100000, director.getSalary());
    }

    @Test
    public void canChangeName() {
        director.setName("James");
        assertEquals("James", director.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        director.setName(null);
        assertEquals("Ricky", director.getName());
    }
}
