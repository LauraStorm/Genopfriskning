package opgave5ProperCase;

import java.util.Locale;

public class ProperCase {
    //Metode
    public String properCase (String aString){
        //Her skal den nye string sammensættes
        String newString = "";
        //Vi deler stringen op i array, for at arbejde med hver enkelt ord
        String [] stringToArray = aString.split("\\s");

        for (int i = 0; i < stringToArray.length; i++) {

            if (stringToArray[i] == stringToArray[i].toUpperCase(Locale.ROOT)){
                //Hvis ord er skrevet med UPPERCASE skal det ikke ændres

            } else if (stringToArray[i].length() <= 3){
                //Hvis ordet er mindre end 3 i længde --> skal det stå med LOWERCASE
                stringToArray[i] = stringToArray[i].toLowerCase(Locale.ROOT);

            } else{
                //Starter med at gøre ordet på i småt
                stringToArray[i] = stringToArray[i].toLowerCase(Locale.ROOT);
                //Nu er ordet med småt, og vi skal nu ændre index 0 i ordet til UPPERCASE.
                stringToArray[i] = stringToArray[i].substring(0,1).toUpperCase(Locale.ROOT) + stringToArray[i].substring(1);    //inspiration: https://www.codegrepper.com/code-examples/java/how+to+make+first+certain+index+uppercase+in+java

            }
            newString = newString + stringToArray[i] + " ";

        }
        return newString;
    }

    public static void main(String[] args) {
        ProperCase main = new ProperCase();

        String test = "HEJ dU fister medister PØLSE";

        String toProperCase = main.properCase(test);
        System.out.println(toProperCase);

    }


}
