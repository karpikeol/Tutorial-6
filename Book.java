public class Book extends LibraryMedia{
    private String author;
    private int numberOfPages;

    public Book(String title,int publicationYear ,  String author, int numberOfPages){
        super(title, publicationYear);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Author: " + author + " Number of pages: " + numberOfPages);
    }

    public void checkNumberOfPages(){
        if(numberOfPages>500){
            System.out.println("The book is long, it has " + numberOfPages);
        }else{
            System.out.println("The book is standart, it has " + numberOfPages);
        }
    }

}
