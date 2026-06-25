public class Library {
    public static void main(String[] args) {
        Describable[] shelf = { new Book("Java", 300), new Book("Git", 120), new Book("Wit is altijd schoon", 124) };
        for (Describable book : shelf) {
            System.out.println(book.describe());
        }
    }
}

interface Describable {
    String describe();
}

class Book implements Describable {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        validatePages(pages);
        // validate pages: if (pages < 1) throw new IllegalArgumentException(...);
        // then this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public void validatePages(int pages) {
        if (pages < 1) {
            throw new IllegalArgumentException("pages must be more than 0");
        }
        this.pages = pages;
    }

    @Override
    public String describe() {
        return title + " (" + pages + " pages)";
    }
}
