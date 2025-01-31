package domain;

/**
 * Book.java
 * Class for the Book
 * Author: Peter Buckingham (220165289)
 * Date: 17 March 2021
 */

import java.util.Objects;


public class Book {
    private long id;
    private final String title;
    private final Author author;
    private final Publisher publisher;
    private final String ISBN;
    private final String imageLink;
    private final String description;
    private final Genre genre;
    private final Language language;
    private final int edition;

    private Book(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.publisher = builder.publisher;
        this.ISBN = builder.ISBN;
        this.imageLink = builder.imageLink;
        this.description = builder.description;
        this.genre = builder.genre;
        this.language = builder.language;
        this.edition = builder.edition;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // getters

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getImageLink() {
        return imageLink;
    }

    public String getDescription() {
        return description;
    }

    public Genre getGenre() {
        return genre;
    }

    public Language getLanguage() {
        return language;
    }

    public int getEdition() {
        return edition;
    }

    // Builder class

    public static class Builder {
        private long id;
        private final String title;
        private final Author author;
        private final Publisher publisher;
        private final String ISBN;
        private String imageLink;
        private String description;
        private Genre genre;
        private Language language;
        private int edition;

        public Builder(String title, Author author, Publisher publisher, String ISBN) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.ISBN = ISBN;
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder imageLink(String imageLink) {
            this.imageLink = imageLink;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder genre(Genre genre) {
            this.genre = genre;
            return this;
        }

        public Builder language(Language language) {
            this.language = language;
            return this;
        }

        public Builder edition(int edition) {
            this.edition = edition;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Book)) return false;
        Book other = (Book) o;
        return Objects.equals(title, other.title) &&
                Objects.equals(ISBN, other.ISBN) &&
                edition == other.edition &&
                Objects.equals(imageLink, other.imageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, ISBN, edition, imageLink);
    }
}
