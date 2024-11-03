package NewSelection.java;

import java.util.*;

public class NewSelection {

	public static String getAgeOrTitle(Object o) {
		
		// if (o instanceof Book) {

		// 	if(o instanceof Comic)
		// 	{
		// 		return ((Comic)o).get_title();
		// 	}
		// 	else if(o instanceof Fiction)
		// 	{
		// 		return ((Fiction)o).get_name();
		// 	}
		// 	else if(o instanceof TextBook)
		// 	{
		// 		return ((TextBook)o).get_subject();
		// 	}
		// 	else 
		// 	  return null;
			
		// }
		// return null;

		return switch (o) {
				case Comic comic -> comic.get_title();
				case Fiction fiction -> fiction.get_name();
				case TextBook textBook -> textBook.get_subject();
				default -> null;
			};
	}

	public static void main(String[] args) {
		
		TextBook tb = new TextBook("OOPS");
		Comic cb = new Comic("Superman: The superhero",25);
		Fiction fb = new Fiction("Harry POtter ",FictionType.Comedy);
		
		System.out.println(tb.toString() + "\n");
		System.out.println(cb.toString() + "\n");
		System.out.println(fb.toString() + "\n");
		
		System.out.println("getting  getAgeorTitle for Textbook : " + getAgeOrTitle(tb) + "\n");
		System.out.println("getting  getAgeorTitle for Comic: " + getAgeOrTitle(cb) + "\n");
		System.out.println("getting  getAgeorTitle for Fiction : " + getAgeOrTitle(fb) + "\n");
		
	}
    {

    	IBook<Integer> cb1 = new Comic("Spiderman", 17);
        IBook<Integer> cb2 = new Comic("Thor", 45);
        IBook<FictionType> fb1 = new Fiction("Sherlock", FictionType.Tragedy);
        IBook<FictionType> fb2 = new Fiction("Harry Potter", FictionType.Comedy);
        IBook<String> tb1 = new TextBook("OOPS");
        IBook<String> tb2 = new TextBook("Maths");

		System.out.println("\nTesting compareTo method:");
        System.out.println("cb1 vs cb2: " + cb1.compareTo(cb2)); 
        System.out.println("fb1 vs fb2: " + fb1.compareTo(fb2));
        System.out.println("tb1 vs tb2: " + tb1.compareTo(tb2));
	}
}