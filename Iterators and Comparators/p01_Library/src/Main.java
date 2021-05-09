public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        Book bookThree = new Book("The Documents in the Case", 2002);

        Library library = new Library(bookThree, bookTwo, bookOne);
        library.sort();

        print(library);
    }

    private static void print(Library library) {
        for (Book book : library) {
            System.out.println(book.toString());
        }
    }
}