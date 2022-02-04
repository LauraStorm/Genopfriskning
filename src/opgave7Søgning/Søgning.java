package opgave7Søgning;

import java.util.Locale;

public class Søgning {
    //Metode
    public int searchForAString (String [] array, String aString){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(aString)) {
                int index = i;          //'i' viser index nummer for ordene i arrayet
                return  index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Søgning søgning = new Søgning();

        String [] names = {"Laura", "Elisa", "Carlo", "Benji"};
        String name = "elisa";

        int x = søgning.searchForAString(names,name);
        System.out.println(x);



    }
}
