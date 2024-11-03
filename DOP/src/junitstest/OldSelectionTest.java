package junitstest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import oldshelf.Comic;
import oldshelf.Fiction;
import oldshelf.FictionType;
import oldshelf.OldSelection;
import oldshelf.TextBook;

public class OldSelectionTest {

    @Test
    public void testGetAgeOrTitleWithComic() {
        Comic cb = new Comic("Superman: The superhero", 25);
        String result = OldSelection.getAgeOrTitle(cb);
        assertEquals("Superman: The superhero", result, "Correct outcome obtained.");
    }

    @Test
    public void testGetAgeOrTitleWithFiction() {
        Fiction fb = new Fiction("Harry POtter ", FictionType.Comedy);
        String result = OldSelection.getAgeOrTitle(fb);
        assertEquals("Harry POtter ", result, "Correct outcome obtained.");
    }

    @Test
    public void testGetAgeOrTitleWithTextBook() {
        TextBook tb = new TextBook("OOPS");
        String result = OldSelection.getAgeOrTitle(tb);
        assertEquals("OOPS", result, "Correct outcome obtained.");
    }

    @Test
    public void testGetAgeOrTitleWithInvalidObject() {
        String result = OldSelection.getAgeOrTitle("Not a Book");
        assertEquals("", result, "Expected empty string for Not a Book instance");
    }
}