package domain;
/*
    Magazine.java
    Class for the Magazine builder POJO
    Author: Peter Buckingham (220165289)
    Date: 17 March 2021
*/



import java.util.Date;

public class Magazine {
    private final String title;
    private final String barcode;
    private final Author author;
    private final Publisher publisher;
    private final Language language;
    private final Genre genre;
    private final int edition;
    private final Date publicationDate;
    private final String imageUrl;

    public Magazine(MagazineBuilder builder) {
        this.title = builder.title;
        this.barcode = builder.barcode;
        this.author = builder.author;
        this.publisher = builder.publisher;
        this.language = builder.language;
        this.genre = builder.genre;
        this.edition = builder.edition;
        this.publicationDate = builder.publicationDate;
        this.imageUrl = builder.imageUrl;
    }

    public static class MagazineBuilder {
        private String title;
        private String barcode;
        private Author author;
        private Publisher publisher;
        private Language language;
        private Genre genre;
        private int edition;
        private Date publicationDate;
        private String imageUrl;

        public MagazineBuilder(String title) {
            this.title = title;
        }

        public MagazineBuilder setBarcode(String barcode) {
            this.barcode = barcode;
            return this;
        }

        public MagazineBuilder setAuthor(Author author) {
            this.author = author;
            return this;
        }

        public MagazineBuilder setPublisher(Publisher publisher) {
            this.publisher = publisher;
            return this;
        }

        public MagazineBuilder setLanguage(Language language) {
            this.language = language;
            return this;
        }

        public MagazineBuilder setGenre(Genre genre) {
            this.genre = genre;
            return this;
        }

        public MagazineBuilder setEdition(int edition) {
            this.edition = edition;
            return this;
        }

        public MagazineBuilder setPublicationDate(Date publicationDate) {
            this.publicationDate = publicationDate;
            return this;
        }

        public MagazineBuilder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Magazine build() {
            return new Magazine(this);
        }
    }

    // getters

    public String getTitle() {
        return title;
    }

    public String getBarcode() {
        return barcode;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Language getLanguage() {
        return language;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getEdition() {
        return edition;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
