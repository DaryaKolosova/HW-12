public class Main {
    public static class Author {
        private String firstName;
        private String lastName;

        public Author(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }
    }
    public static class Book {
        private String title;
        private Author author;
        private int publicationYear;

        public Book(String title, Author author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }

        public String getTitle() {
            return this.title;
        }

        public Author getAuthor() {
            return this.author;
        }

        public int getPublicationYear() {
            return this.publicationYear;
        }

        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Author author1 = new Author("Люк", "Бессон");
        Author author2 = new Author("Зигмунд", "Фрейд");
        Book book1 = new Book("Артур и минипуты", author1, 2002);
        Book book2 = new Book("Толкование сновидений", author2, 1913);

        System.out.println("Название книги: " + book1.getTitle() + "\nАвтор книги: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + "\nГод публикации: " + book1.getPublicationYear());
        System.out.println();
        System.out.println("Название книги: " + book2.getTitle() + "\nАвтор книги: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + "\nГод публикации: " + book2.getPublicationYear());

    }
}