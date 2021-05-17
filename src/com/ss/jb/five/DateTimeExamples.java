/**
 * 
 */
package com.ss.jb.five;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/** All three coding examples from DateTime Assignment questions
 * @author chris
 *
 */
public class DateTimeExamples {

	/** Write an example that, for a given year,
	 *  reports the length of each month within that year.
	 *     
	 * @param year
	 */
	public static void printExample1 (int year) {
		
		try {
            Year.of(year);
        } catch (DateTimeException dte) {
            dte.printStackTrace();
            return;
        }
		
		for (Month m: Month.values()) {
			YearMonth ym = YearMonth.of(year, m);
			System.out.println(m.toString() + ": " + ym.lengthOfMonth() + " days");
		}
		
	}
	
	
	/** Write an example that, for a given month of the current year, 
	 *  lists all of the Mondays in that month.
	 *  
	 *  @param
	 */
	public static void printExample2 (String m) {
		Month month = null;

        try {
            month = Month.valueOf(m.toUpperCase());
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
        }

        System.out.println("For the month of " + month + ": ");
        
        LocalDate date = Year.now().atMonth(month).atDay(1).
              with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        
        Month mi = date.getMonth();
        
        while (mi == month) {
            System.out.println(date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }
	}
	
	/** Write an example that tests whether a given date occurs
	 *  on Friday the 13th.
	 * 
	 *  @param 
	 * */
	public static void printExample3 (String m, int day) {
		Month month = null;
        LocalDate date = null;

        try {
            month = Month.valueOf(m.toUpperCase());
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
            return;
        }

        try {
            date = Year.now().atMonth(month).atDay(day);
        } catch (DateTimeException dte) {
        	dte.printStackTrace();
        	return;
        }
        
        System.out.println(date.query((d) -> {
        	return ((d.get(ChronoField.DAY_OF_MONTH) == 13) &&
                    (d.get(ChronoField.DAY_OF_WEEK) == 5));
        }));
	}
	
	public static void main(String[] args) {
		// 1
		printExample1(1965);
		
		System.out.println();
		
		// 2
		printExample2("December");
		
		System.out.println();
		
		//3
		printExample3("October", 13);

	}

}
