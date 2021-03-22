import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Michael", "PY678C00L", 55000.00, "Sales");
    }

    @Test
    public void managerHasName(){
        assertEquals("Michael", manager.getName());
    }

    @Test
    public void managerHasNationalInsuranceNumber(){
        assertEquals("PY678C00L", manager.getNationalInsuranceNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(55000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void managerHasDept(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseManagerSalary(){
        manager.raiseSalary(500.50);
        assertEquals(55500.50, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetManagerBonusAmount(){
        assertEquals(550.00, manager.payBonus(), 0.01);
    }
}

