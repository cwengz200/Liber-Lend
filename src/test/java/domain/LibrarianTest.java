package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibrarianTest {
    @Test
    public void testLibrarian() {

        Librarian librarian = new Librarian.Builder().setFirstName("Lizzy").setLastName("James").setContactNo(0215662730).setOffice("2.8A").setTasks("Ordering books.").build();
        Librarian newlibrarian = new Librarian.Builder().setFirstName("Katlego").setLastName("Makano").setOffice("2.5A").setTasks("Processing late fees.").build();
        Librarian templibrarian = new Librarian.Builder().setFirstName("Waden").setLastName("Van Wyk").setTasks("Organizing book display.").build();

        assertEquals(librarian, newlibrarian);
        assertNotEquals(newlibrarian, templibrarian);

    }

}