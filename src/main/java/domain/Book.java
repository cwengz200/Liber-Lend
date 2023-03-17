package domain;

/*
    Book.java
    CLass for the Book POJO
    Author: Peter Buckingham (220165289)
    Date: 17 March 2021
*/

public class Book {
    private final String title;
    private final Author author;
    private final Publisher publisher;
    private final String ISBN;
    private final String imageLink;
    private final String description;
    private final Genre genre;
    private final Language language;

    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.publisher = builder.publisher;
        this.ISBN = builder.ISBN;
        this.imageLink = builder.imageLink;
        this.description = builder.description;
        this.genre = builder.genre;
        this.language = builder.language;
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

    // Builder class

    public static class Builder {
        private final String title;
        private final Author author;
        private final Publisher publisher;
        private final String ISBN;
        private String imageLink;
        private String description;
        private Genre genre;
        private Language language;

        public Builder(String title, Author author, Publisher publisher, String ISBN) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.ISBN = ISBN;
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

        public Book build() {
            return new Book(this);
        }
    }
}
