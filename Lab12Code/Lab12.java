/*
 * Copyright (C) 2020 Aparna Mahadev
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
/**
 * Creates students, faculty, and staff. Assigns courses to them.
 *
 * @author Aparna Mahadev
 * @version Lab 12
 */
public class Lab12 {
    /**
      * Creates students, faculty, and staff. Assigns courses to Students
      *
      * @param args command-line arguments (not used)
     */
     public static void main(String[] args) {
         Student student1, student2;
         Course course1, course2, course3, course4;

	 student1 = new Student("Joe", "Smith", "12345");
	 course1 = new Course("CS", 101, "Basics of CS", 3);
	 student1.addCourse(course1, "FA", 2010, 3.7);
	 course2 = new Course ("MA", 190, "Pre-Calculus", 4);
	 student1.addCourse(course2, "FA", 2010, 3.0);
	 course3 = new Course("EN", 101, "Writing I", 3);
	 student1.addCourse(course3, "S1", 2011, 0.0);
	 course4 = new Course("HI", 111, "U.S. History I", 3);
	 student1.addCourse(course4, "SP", 2012, 1.3);

	 student2 = new Student("Robert", "Wilson", "67890");
	 student2.addCourse(course1, "SP", 2009, 2.0);
	 student2.addCourse(course2, "SP", 2010, 2.3);
	 student2.addCourse(course3, "SP", 2010, 2.7);

	 System.out.println(student1);
	 System.out.println();
	 System.out.println(student2);

	 Staff staff = new Staff("Fred", "Jones", "23456", "9876", 41000, 12);
	 System.out.println();
	 System.out.println(staff);

         Faculty faculty1 = new Faculty("Mary", "Johnson", "34567", "5432",
	          52000, "Assistant Professor");
	 System.out.println();
	 System.out.println(faculty1);

	 Faculty faculty2 = new Faculty("Peter", "Clinton", "34987", "1290",
	             76000, "Professor");
	 System.out.println();
	 System.out.println(faculty2);
     }
}