import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Lab11Test.
 *
 * @author  Karl R. Wurst
 * @version Lab 12
 */
public class FacultyTest
{
    /**
     * Default constructor for test class Lab10Test
     */
    public FacultyTest()
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
    public void testFaculty1() {
        Faculty faculty1 = new Faculty("Mary", "Johnson", "34567", "5432", 52000, "Assistant Professor");
        assertEquals("FACULTY:\tMary Johnson\tID = 34567\tExtension = 5432\tSalary = $52,000.00\tFaculty Rank = Assistant Professor",
            faculty1.toString());
    }

    @Test
    public void testFaculty2() {
        Faculty faculty2 = new Faculty("Peter", "Clinton", "34987", "1290", 76000, "Professor");
        assertEquals("FACULTY:\tPeter Clinton\tID = 34987\tExtension = 1290\tSalary = $76,000.00\tFaculty Rank = Professor",
            faculty2.toString());
    }
}
