package opgave1ArrayList;

import java.util.ArrayList;
import java.util.Locale;

public class MainArrayList {
    //Metode
    public boolean doesArraylistContainString (ArrayList<String> aList, String aString ){
        //Iterere gennem listen
        for (String string : aList ) {
            if (aString.toLowerCase(Locale.ROOT) == string.toLowerCase(Locale.ROOT)){
                //Hvis input String er det samme som stringen i listen
                System.out.println("The String has been found");
               return true;
            }
        }
        //Hvis ikke ordet er i listen
        aList.add(aString);
        return false;
    }

    public static void main(String[] args) {
        MainArrayList x = new MainArrayList();

        ArrayList <String> names = new ArrayList<String>();
        names.add("Laura");
        names.add("Elisa");

        System.out.println(x.doesArraylistContainString(names, "jj")); //False
        System.out.println(x.doesArraylistContainString(names, "Laura")); //True


    }
}
