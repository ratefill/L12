package by.epam.l12.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/*Напишите собственные примеры, показывающие особенности
применения внутренних, вложенных и анонимных классов.*/

public class HW01internalclass
{
	public static void main(String[] args)
	{
		Outer o = new Outer();
		o.print();
		System.out.println();
		System.out.println();
		o.sort();
		o.print();

		System.out.println();
		Outer.Inner oi = new Outer().new Inner(999, "морковная жопка");
		System.out.println(oi.getId() + ", " + oi.getName());
		oi = null;
		System.out.println();
		Outer.Nested.printGUID();
	}

}

class Outer
{
	private List<Inner> arr;
	private static String guid = "85784990-6450-4759-9EBA-A4368C49BBB5";

	public Outer()
	{
		arr = new ArrayList<Inner>();
		arr.add(new Inner(1, "шоколад"));
		arr.add(new Inner(2, "телефон"));
		arr.add(new Inner(3, "Ямал"));
		arr.add(new Inner(4, "Азбука"));
	}

	public void print()
	{
		for (Inner i : arr)
		{
			System.out.print(i.id + ", " + i.name);
			System.out.println();
		}
		;
	}

	public void sort()
	{
		arr.sort(new Comparator<Inner>() {
			@Override
			public int compare(Inner i1, Inner i2)
			{
				return i1.name.compareToIgnoreCase(i2.name);
			}
		});
	}

	class Inner
	{
		private int id;
		private String name;

		public Inner(int id, String name)
		{
			this.id = id;
			this.name = name;
		}

		public int getId()
		{
			return id;
		}

		public String getName()
		{
			return name;
		}
	}

	static class Nested
	{
		public static void printGUID()
		{
			System.out.println(Outer.guid);
		}
	}
}
