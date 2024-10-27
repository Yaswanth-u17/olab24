package newshelf;

public interface IBook {

}

enum FictionType
{
    Comedy,
    Tragedy,
    GoK
}
    record TextBook(String subject) implements IBook{
        public String toString()
        {
            return "Subject of the TextBook is " + this.subject + "\n"; 
        }
    }
    record Comic(String title,int ageOfMainCharacter) implements IBook{
        @Override
        public String toString()
        {
            return "Title is "+this.title + "\nAge of Main Character is " + this.ageOfMainCharacter;
        }

        @Override
        public int hashCode()
        {
            return this.title.hashCode()+ageOfMainCharacter;
        }
    }
    record Fiction(String Name,FictionType type) implements IBook
    {
        @Override
        public String toString()
        {
            return "Name is " + this.Name + "\nFictional Type is " + type + "\n";
        }
    }
