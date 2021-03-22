import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Pete", "RT234C00L", 32000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Pete", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("RT234C00L", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(32000.00, developer.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(750.00);
        assertEquals(32750, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(320.00, developer.payBonus(), 0.01);
    }
}
