import java.text.*;
import java.util.*;
/**
 * Super Class for employees
 *
 * @Michael Chau
 * @version 1
 */
public class Employee extends Person
{
    private String extension;
    private double salary;
    private String rank;
    private int yearsOfService;
    public Employee(String firstName, String lastName, String id, String extension, double Salary)
    {
        super(firstName, lastName, id);
        this.extension = extension;
        this.salary = salary;
     }   
    /**
      * Returns the phone extension.
      *
      * @return the phone extension
    */
    public String getExtension() {
     return extension;
    }
    /**
      * Sets the phone extension.
      *
      * @param extension the phone extension to set
    */
    public void setExtension(String extension) {
     this.extension = extension;
    }
    /**
      * Returns the salary.
      *
      * @return the salary
    */
    public double getSalary() {
     return salary;
    }
    /**
      * Sets the salary.
      *
      * @param salary the salary to set
    */
    public void setSalary(double salary) {
     this.salary = salary;
    }
    public String toString(){
        String str = "";
        str += this.getClass().getName().toUpperCase() + "\tExtension = " + extension +
				"\tSalary = " + salary;
         return str;
    }
}


