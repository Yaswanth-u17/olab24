package newshelf;


public class NewSelection {

	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Book) {

			if(o instanceof Comic)
			{
				return ((Comic)o).get_title();
			}
			else if(o instanceof Fiction)
			{
				return ((Fiction)o).get_name();
			}
			else if(o instanceof TextBook)
			{
				return ((TextBook)o).get_subject();
			}
			else 
			  return null;
			
		}
		return null;
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
}
