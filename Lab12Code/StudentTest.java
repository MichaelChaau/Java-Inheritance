import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  Karl R. Wurst
 * @version Lab 12
 */
public class StudentTest
{
    Course course1, course2, course3, course4;

    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
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
        course1 = new Course("CS", 101, "Basics of CS", 3);
        course2 = new Course ("MA", 190, "Pre-Calculus", 4);
        course3 = new Course("EN", 101, "Writing I", 3);
        course4 = new Course("HI", 111, "U.S. History I", 3);
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
    public void testStudent1() {
        Student student1 = new Student("Joe", "Smith", "12345");

        student1.addCourse(course1, "FA", 2010, 3.7);
        student1.addCourse(course2, "FA", 2010, 3.0);
        student1.addCourse(course3, "S1", 2011, 0.0);
        student1.addCourse(course4, "SP", 2012, 1.3);

        assertEquals("STUDENT:\tJoe Smith\tID = 12345\tGPA = 2.007\tCredits Completed = 10\nHere are all the courses the student has taken so far\n-----------------------------------------------------\nCS\t101\tBasics of CS\t3CR\tFA2010\t3.7\nMA\t190\tPre-Calculus\t4CR\tFA2010\t3.0\nEN\t101\tWriting I\t3CR\tS12011\t0.0\nHI\t111\tU.S. History I\t3CR\tSP2012\t1.3\n",
            student1.toString());
    }

    @Test
    public void testStudent2() {
        Student student2 = new Student("Robert", "Wilson", "67890");

        student2.addCourse(course1, "SP", 2009, 2.0);
        student2.addCourse(course2, "SP", 2010, 2.3);
        student2.addCourse(course3, "SP", 2010, 2.7);

        assertEquals("STUDENT:\tRobert Wilson\tID = 67890\tGPA = 2.33\tCredits Completed = 10\nHere are all the courses the student has taken so far\n-----------------------------------------------------\nCS\t101\tBasics of CS\t3CR\tSP2009\t2.0\nMA\t190\tPre-Calculus\t4CR\tSP2010\t2.3\nEN\t101\tWriting I\t3CR\tSP2010\t2.7\n",
            student2.toString());
    }
}
