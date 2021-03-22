import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Dwight", "SF626B33T", 40000.00, "Sales", 5000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Dwight", director.getName());
    }

    @Test
    public void canChangeName(){
        director.setName("Jim");
        assertEquals("Jim", director.getName());
    }

    @Test
    public void cannotChangeNameToNull(){
        director.setName(null);
        assertEquals("Dwight", director.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("SF626B33T", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDept(){
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(5000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(400.50);
        assertEquals(40400.50, director.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryWithNegativeAmount(){
        director.raiseSalary(-200.00);
        assertEquals(40000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(400.00, director.payBonus(), 0.01);
    }
}
