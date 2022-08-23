import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class DonateMovieTest {
    // 1)
    //write the assertion first
    //work backward

    // 2)
    //before writing the function to PASS , run the test and see what error that you are getting
    //check if it's related to the actual assertion? refactor to PASS: refactor to PASS -> TESTING THE TEST

    // 3)

    @Test
    public void donateVoid() { 
        Library library = new Library();
        Movie movie = new Movie();
        library.donate(movie);
        assertTrue(library.contains(movie));
    }


}
