import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StaffTest.
 *
 * @author  Karl R. Wurst
 * @version Lab 12
 */
public class StaffTest
{
    /**
     * Default constructor for test class StaffTest
     */
    public StaffTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testStaff() {
        Staff staff = new Staff("Fred", "Jones", "23456", "9876", 41000, 12);
        assertEquals("STAFF:\tFred Jones\tID = 23456\tExtension = 9876\tSalary = $41,000.00\tYears of Service = 12",
            staff.toString());
    }

}
