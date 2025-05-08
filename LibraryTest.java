
public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("The Witcher", 1990, "Andrzej Sapkowski",
                320);
        Book book2 = new Book("Drreams of Cthulhu", 1920, "Govard Lavcraft",
                598);
        Movie movie1 = new Movie("The Green Mile", 1999, "Frank Darabont",
                189);
        Movie movie2 = new Movie("American Pie", 1999, "Honestly, nie eby",
                189);

        LibraryMedia [] lib = {book1,  book2, movie1, movie2};
        for( LibraryMedia l : lib){
            l.displayInformation();
            System.out.println("---------------------");
        }
        System.out.println("---BOROWING---");
        book1.borrow();
        book1.borrow();
        book1.returnMedia();

        System.out.println(" ---TYPE-SPECIFIC METHODS---");
        book1.checkNumberOfPages();
        movie1.checkDuration();

        System.out.println("---TYPE CASTING---");
        for (LibraryMedia media : lib) {
            if (media instanceof Book) {
                Book b = (Book) media;
                b.checkNumberOfPages();
            } else if (media instanceof Movie) {
                ((Movie) media).checkDuration();
            }
        }
    }
}