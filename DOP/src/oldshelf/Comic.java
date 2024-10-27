package oldshelf;

public class Comic extends Book {

	private final String Title;
	private final int ageOfMainCharacter;

	public Comic(String Title,int ageOfMainCharacter) {
		this.Title = Title;
		this.ageOfMainCharacter = ageOfMainCharacter;
	}
	
	public String get_title()
	{
		return this.Title;
	}
	

	@Override
	public String toString() {
		return "Title of the book is "+this.Title+"\n Age of the Main Character is "+this.ageOfMainCharacter;
	}

	@Override
	public int hashCode() {
		return this.Title.hashCode()+ageOfMainCharacter;
	}
	
	@Override
	public boolean equals(Object o) {
		return this.Title.hashCode()==o.hashCode();
	}
}
