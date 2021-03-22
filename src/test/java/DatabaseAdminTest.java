import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Erin", "LK989C00L", 25000.50);
    }

    @Test
    public void hasName(){
        assertEquals("Erin", databaseAdmin.getName());
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Pam");
        assertEquals("Pam", databaseAdmin.getName());
    }

    @Test
    public void cannotChangeNameToNull(){
        databaseAdmin.setName(null);
        assertEquals("Erin", databaseAdmin.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("LK989C00L", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000.50, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(500.00);
        assertEquals(25500.50, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryWithNegativeAmount(){
        databaseAdmin.raiseSalary(-100.00);
        assertEquals(25000.50, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(250.01, databaseAdmin.payBonus(), 0.01);
    }
}
