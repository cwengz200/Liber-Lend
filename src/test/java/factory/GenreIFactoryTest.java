package factory;

import domain.Genre;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenreIFactoryTest {

    @Test
    public void createGenre () {
        Genre genre = GenreIFactory.createGenre("sci-fi", "the description", null, null);
        System.out.println(genre.toString());
        assertNotNull(genre);
    }
}