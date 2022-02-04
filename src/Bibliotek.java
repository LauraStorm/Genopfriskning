import java.util.ArrayList;

public class Bibliotek {
    private static ArrayList<Bog> bøger = new ArrayList<Bog>();

    public boolean doesBookHaveSameISBNNumber (Bog aBokISBNNumber ){
        for (Bog abook : bøger) {
            if (abook.getIsbnNumber() == aBokISBNNumber.getIsbnNumber()){
                //hvis listen indeholderet Bog objekt med samme ISBN
                return true;
            }
        }
        //Hvis ikke listen indeholder bogen med samme ISBN
        return false;
    }

    public static void main(String[] args) {
        Bibliotek amagerBiblo = new Bibliotek();

        Bog bog1 = new Bog(123,"bog1", 1111);
        Bog bog2 = new Bog(231,"bog2", 2222);
        Bog bog3 = new Bog(312,"bog3", 3333);

        //Indsæt tre forskellige bøgeri Biblioteket
        amagerBiblo.bøger.add(bog1);
        amagerBiblo.bøger.add(bog2);
        amagerBiblo.bøger.add(bog3);

        //Test metoden
        Bog test = new Bog(123, "bogtest", 4444);
        Bog test2 = new Bog(999, "bogtest", 4444);

        System.out.println(amagerBiblo.doesBookHaveSameISBNNumber(test));   //false
        System.out.println(amagerBiblo.doesBookHaveSameISBNNumber(test2));   //true

    }
}
