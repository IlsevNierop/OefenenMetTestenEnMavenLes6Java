package nl.novi;

public class StringMagic {

    public static String reverse(String input){
        String output = "";
        for (char c : input.toCharArray()){
            output = c + output;
        }
        return output;

    }
}
