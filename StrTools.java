public class StrTools{
    public static String changeFirstChar(String str){
        //String remainedStr = str.substring(1);
        //String firstChar = str.substring(0, 1);
        //return firstChar.toUpperCase() + remainedStr;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    public static String addPeriod(String str){
        return str + ".";
    }
    //replace a target word with a given word
    public static String replace(String str, String target, String repl){
    int firstIndex = str.indexOf(target);
    int secondIndex = firstIndex + target.length();
    String firstPart = str.substring(0, firstIndex);
    String secondPart = str.substring(secondIndex);
    return firstPart + repl + secondPart;
    }
    // print single character of a string 
    //"abcd" return "a, b, c, d."
    public static String printSingleChar(String str){
        int index = 0;
        String tmp = "";
        while (index < str.length()-1){
            tmp += str.substring(0, 1);
            tmp += ",";
            tmp += " ";
        }
    }
        return tmp + str.substring(str.length()-1) + ".";
    public static void main(String[] args) {
        String str = "the dog is so cute"; //change the first charactor to upper case
        String tmp = replace(str,"dog","cat"); //tmp "The"
        System.out.println(tmp);
    }
   
}
