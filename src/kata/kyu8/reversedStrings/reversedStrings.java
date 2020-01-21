package kata.kyu8.reversedStrings;

public class reversedStrings {
    public static String Reverse (String str){
        if(!(str == null)){
        StringBuffer buffer = new StringBuffer(str);
        return String.valueOf(buffer.reverse());}
        else {
            return null;
        }
    }
}
