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
 * Represents a staff member with first and last name, id, phone extension,
 * salary and years of service.
 *
 * @author Aparna Mahadev
 * @version Lab 12
 */
public class Staff extends Employee{
    private int yearsOfService;

    /**
      * Creates a staff member.
      *
      * @param firstName the first name of the staff member
      * @param lastName the last name of the staff member
      * @param id the id of the staff member
      * @param extension the phone extension of the staff member
      * @param salary the salary of the staff member
      * @param years the number of years the staff member worked for the campus
    */
    public Staff(String firstName, String lastName, String id,
            String extension, double salary, int years) {
        super(firstName, lastName, id, extension, salary);
        yearsOfService = years;
    }

    /**
      * Returns a pretty version of the staff member
      *
      * @return a string representation of the staff member
    */
    public String toString() {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String s = this.getClass().getName().toUpperCase() + "\tYears of Service = "
               + yearsOfService;
        return s;
    }
}
