package oldshelf;

public class TextBook extends Book {

	private final String subject;
	public TextBook(String subject) {
		this.subject = subject;
	}

	public String get_subject()
	{
		return this.subject;
	}
	@Override
	public String toString() {
		return "Subejct of the Text Book is " + this.subject + "\n";
	}

}
