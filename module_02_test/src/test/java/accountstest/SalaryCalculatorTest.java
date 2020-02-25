package accountstest;

import accounts.Employee;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculatorTest {
    List<Employee> employees = new ArrayList<>();

    @BeforeClass
    public void setup() {

        for (int i = 0; i < 10; i++) {
            employees.add(new Employee());
        }


    }

    /**
     * @author Jahidul Islam
     * Do unit testing of SalaryCalculator class
     */

    @Test
    public void testCal() {
        int sum = 0;
        for (Employee e : employees) {
            sum += e.salary;
        }
        Assert.assertEquals(sum, 100);
        Assert.assertNotEquals(sum, 50);
    }


}
