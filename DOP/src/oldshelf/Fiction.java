package oldshelf;

public class Fiction extends Book {

	private final String Name;
	private static FictionType type;
	public Fiction(String title,FictionType comedy) {
		this.Name = title;
		Fiction.type = comdey;
	}
	public String get_name()
	{
		return this.Name;
	}
	@Override
	public String toString(){
		return "Name : " + this.Name + "\n Fictional Type : " + type + "\n";
	}

}
