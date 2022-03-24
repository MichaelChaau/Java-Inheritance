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
import java.text.*;
import java.util.*;

/**
 * Represents a faculty member with first and last name, id, phone extension,
 * salary, and faculty rank.
 *
 * @author Aparna Mahadev
 * @version Lab 12
 */
public class Faculty extends Employee {
    private String rank;

    /**
      * Creates a faculty member.
      *
      * @param firstName first name of the faculty member
      * @param lastName last name of the faculty member
      * @param id id number of the faculty member
      * @param extension phone extension of the faculty member
      * @param salary salary of the faculty member
    */
    public Faculty(String firstName, String lastName, String id,
                   String extension, double salary, String rank) {
	super(firstName, lastName, id, extension, salary);
	this.rank = rank;
    }

    /**
      * Sets the faculty rank.
      *
      * @param rank the rank to set
     */
    public void setRank(String rank) {
	 this.rank = rank;
    }
 
    /**
      * Returns the rank.
      *
      * @return the rank
    */
    public String getRank() {
	 return rank;
    }
 
    /**
      * Prints a faculty member in a pretty format.
      *
      * @return a string representing the faculty member.
    */
    public String toString() {
	 NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
	 String s = this.getClass().getName().toUpperCase() + "\tFaculty Rank = " + rank;
	 return s;
    }
}
