/*
 * Copyright (C) 2020 Aparna Mahadev
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 */
import java.util.ArrayList;

/**
 * Represents a student with first and last name, id, GPA, and a
 * transcript of courses.
 *
 * @author Aparna Mahadev
 * @version Lab 12
 */
public class Student extends Person{
    private String firstName;
    private String lastName;
    private String id;
    private double gpa;
    private ArrayList<CourseAttempted> transcript;
    private int creditsCompleted;

    /**
     * Creates a student.
     *
     * @param firstName the first name of the student
     * @param lastName the last name of the student
     * @param id the student's id
    */
    public Student(String firstName, String lastName, String id) {
    super(firstName, lastName, id);
    gpa = 0.0;
    transcript = new ArrayList<CourseAttempted> ();
    creditsCompleted = 0;
    }

    /**
      * @return the gpa
    */
    public double getGpa() {
    return gpa;
    }

    /**
      * Adds a course to the student's transcript.
      *
      * @param courseToAdd the course to add
    */
    public void addCourse(Course c, String semester, int year, double grade) {
        CourseAttempted courseToAdd = new CourseAttempted(c, semester, year, grade);
        transcript.add(courseToAdd);

    // the total number of credits attempted is the sum of
    // creditsCompleted and the number of credits of the course to be added
    // to the transcript
    int creditsAttempted = courseToAdd.course.getCredits() + creditsCompleted;

    // gpa is computed by doing the following:
    // for each course attempted, multiply the number of credits by the
    // course grade.
    // gpa is the sum of the above for all the courses divided by the
    // number of total credits
    //
    double currentPoints = gpa * creditsCompleted + courseToAdd.grade *
                            courseToAdd.course.getCredits();

    gpa = currentPoints / creditsAttempted;

    if (courseToAdd.grade > 0)
         creditsCompleted += courseToAdd.course.getCredits();
    }

    /**
     * Returns the list of courses as a String.
     *
     * @return the list of courses the student has taken
     */
    public String getTranscript() {
        String courseList = "";
        for (CourseAttempted ca: transcript)
               courseList = courseList + ca + "\n";

        return courseList;
    }

    /**
     * Returns a String representation of a Student
     *
     * @return a string representing the student
    */
    public String toString() {
        String s = this.getClass().getName().toUpperCase() + ":\t"
                  + "\tGPA = " + gpa + "\tCredits Completed = " + creditsCompleted;
        s += "\nHere are all the courses the student has taken so far";
        s += "\n-----------------------------------------------------";
        s += "\n" + getTranscript();
        return s;
     }

    /**
     * Represents a course attempted by a student
     * in a given semester, year, and a grade
     *
     * @author Aparna Mahadev
     * @version 1
     */

    /* This is an example of inner class.  Inner class is a class within another class.
     * Inner classes can be used to implement helper classes like the one shown here.
     * Here the inner class is defined to be private to restrict its visibility to only
     * the Student class.  Other classes in the package are not aware of its existence and
     * cannot use them.  Outer class Student can access the inner class's private instanc
     * variables directly.  Refer to lines 116, 125 and 130 in this file.  The private
     * instance variable course of the inner class is accessed directly by the outer class (in
     * this case Student).
     */
     private class CourseAttempted  {
         private Course course;
         private String semester; // Fall, Spring, Summer I, Summer II, Intersession
         private int year;
         private double grade;

         /**
          * Constructor for objects of class CourseAttempted
          * @param c The course that was attempted by the student
          * @param semester Semester in which the course was taken
          * @param year Year in which the course was taken
          * @param grade Grade the student received for this course
          */
         public CourseAttempted(Course c, String semester, int year, double grade)   {
               this.course = c;
               this.semester = semester;
               this.year = year;
               this.grade = grade;
         }

         /**
          * Returns a String representation of a course attempted
         */
         public String toString() {
               String s = course.toString();
               s += "\t" + semester + year;
               s += "\t" + grade;
               return s;
         }
     }
}
