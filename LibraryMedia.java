public class LibraryMedia {
    protected  String title;
    protected  int publicationYear;
    protected  boolean available;

    public LibraryMedia(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
        this.available = true;

    }

    public void borrow(){
        if(!available){
            System.out.println("The media is already borrowed");
        }else {
            available = false;
            System.out.println("It has been borrowed");
        }
    }

    public void returnMedia(){
        if(!available){
            available = true;
            System.out.println("the media borrowed");
        }else{
            System.out.println("the media wasn't borrowed");
        }
    }

    public void displayInformation(){
        System.out.println("Title: " + title + " Publication year: " + publicationYear + " Availability: "+ (available?"Available":"Borrowed"));
    }


}
