package by.epam.l12.example;

import java.util.Date;

public class Outer1
{
	private String str;
	Date date;

	Outer1()
	{
		str = "string in outer";
		date = new Date();
	}

	class Inner
	{
		public void method()
		{
			System.out.println(str);
			System.out.println(date.getTime());
		}
	}
}