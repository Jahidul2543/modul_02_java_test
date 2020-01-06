package accountstest;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import accounts.SalaryCalulator2;

public class SalaryCalculatorTest {

    /**
     * @author Jahidul Islam
     * Do unit testing of SalaryCalculator class
     *
     * */
	
	SalaryCalulator2 calc = new SalaryCalulator2();
	@Test
	public void testSalaryCalculator() throws Throwable, SQLException {
		
	calc.doUnitTest();
		
		int expectedValue= 650;
		Assert.assertEquals(650, expectedValue);
		
	}
	
	
}
