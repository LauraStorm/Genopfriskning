public class Bog {
    private int isbnNumber;
    private String title;
    private int publishYear;

    //Constructor;
    public Bog (int isbnNumber, String title, int publishYear){
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.publishYear = publishYear;
    }

    //Getters
    public int getIsbnNumber (){
        return this.isbnNumber;
    }

    public String getTitle (){
        return this.title;
    }

    public int getPublishYear (){
        return this.publishYear;
    }

    //Setters
    public void setIsbnNumber (int isbnNumber){
        this.isbnNumber = isbnNumber;
    }

    public void setTitle (String title){
        this.title = title;
    }

    public void setPublishYear(int publishYear){
        this.publishYear = publishYear;
    }

    @Override
    public String toString (){
        return "Bog: " + "ISBN nr: " +this.isbnNumber + " Title: " + this.title +  " Publish year: " + this.publishYear;
    }

}
