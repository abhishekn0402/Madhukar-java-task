package com.datebondproject.pkg;

import java.time.LocalDate;
import java.time.Month;
class DateBand
{
	public LocalDate startDate;
	public LocalDate endDate;
	public DateBand() {}
	public DateBand(LocalDate startDate, LocalDate endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	LocalDate finalStart;
	LocalDate finalEnd;
	public DateBand findOverlappingBand(DateBand dateBand, DateBand dateBand1) throws CustomException{
		
		if(dateBand.endDate.compareTo(dateBand.startDate) < 0 || dateBand1.endDate.compareTo(dateBand1.startDate) < 0) {
			System.out.println("Not possible to compare, end date must be greater than start date");
			return null;
		} else if(dateBand1.startDate.compareTo(dateBand.endDate) > 0) {
			throw new CustomException("NoOverlappingBandFound");
		} else {
			int startDifference = dateBand.startDate.compareTo(dateBand1.startDate);
			int endDifference = dateBand.endDate.compareTo(dateBand1.endDate);
			if(startDifference < 0) {
				finalStart = dateBand1.startDate;
				if(endDifference < 0) {
					finalEnd = dateBand.endDate;
				} else {
					finalEnd = dateBand1.endDate;
				}
			} else {
				finalStart = dateBand.startDate;
				if(endDifference < 0) {
					finalEnd = dateBand.endDate;
				} else {
					finalEnd = dateBand1.endDate;
				}
			}
			DateBand db3 = new DateBand(finalStart, finalEnd);
			return db3;	
		}
	}
	@Override
	public String toString() {
		return "DateBand [startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}
public class Mainclass
{

	public static void main(String[] args) throws com.datebondproject.pkg.CustomException
	{
		DateBand dateBand=new DateBand(LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 31));
		DateBand dateBand1 = new DateBand(LocalDate.of(2020, Month.JANUARY, 15), LocalDate.of(2020, Month.FEBRUARY, 20));
		DateBand db = new DateBand();
		DateBand db4 = db.findOverlappingBand(dateBand, dateBand1);
		System.out.println(db4);

	}

}
