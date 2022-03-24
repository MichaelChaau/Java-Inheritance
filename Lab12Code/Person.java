import java.util.ArrayList;
import java.text.*;
import java.util.*;
/**
 * Super Class for people
 *
 * @Michael Chau
 * @version 1
 */
public class Person
{
    private String firstName;
    private String lastName;
    private String id;
    public Person(String firstName, String lastName, String id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /**
      * Sets the first name.
      *
      * @param firstName the firstName to set
    */
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }
    /**
      * Returns the first name.
      *
      * @return the firstName
    */
    public String getFirstName() {
	return firstName;
    }
    /**
      * Sets the last name.
      *
      * @param lastName the lastName to set
    */
    public void setLastName(String lastName) {
	this.lastName = lastName;
    }
    /**
      * Returns the last name.
      *
      * @return the lastName
    */
    public String getLastName() {
	return lastName;
    }
    /**
      * Returns the id.
      *
      * @return the id
    */
    public String getId() {
	 return id;
    }
    /**
     * Accessor method
     * @return a String representation of the person object
     */
    public String toString() {
        String str = "";
        str += (firstName + " " + lastName);
        return str;
    }
}


