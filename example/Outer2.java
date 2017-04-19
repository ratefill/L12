package by.epam.l12.example;

import java.util.Date;

public class Outer2
{
	private Inner inner;
	private String str;
	private Date date;

	Outer2()
	{
		str = "string in outer";
		date = new Date();
		inner = new Inner();
	}

	class Inner
	{
		public void method()
		{
			System.out.println(str);
			System.out.println(date.getTime());
		}
	}

	public void callMethodInInner()
	{
		inner.method();
	}
}
