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
            index++; 
        }
        return tmp + str.substring(str.length()-1) + ".";
    }
        
    public static void main(String []args){
        //change the first charactor to another charactor
        String str = "the dog is so cute"; 
        String tmp = replace(str,"dog","cat"); //tmp "The"
        System.out.println(tmp);
    }
    // abc-->cba reverse 翻转字符串
    public static String reverseStr(String str){
        int index = str.length()-1;
        String tmp = "";
        while(index < 0){ 
            tmp += str.substring(index,index + 1);
            index --;
        }
        return tmp; 
    }
    //翻转整个字符串
    public static String parliWord(String str){
    return str + reverseStr(str);// 整个单词产生回文 this-siht --thissiht
}
    //翻转半个字符串 this-thht , their-theeht
    public static String parliHalf(String str){
        int index = str.length()-1;
        String tmp = "";
        if (str.length() % 2 == 0){
        return str + parliHalf(str);
        }
        else {
            tmp = str.substring(0, str.length()/2 + 1);
            return tmp + reverseStr(tmp);                                                                    
        }
    }
    //判断是否是回文 method 1--> 正反读都一样就是回文
    public static boolean isPali(String str){ 
        //public 用来说明方法访问范围的关键字，public的方法可以在client program里访问
        //static: 静态方法关键字，此方法可以直接用className.methodName()调用
        //boolean返回值类型return type
        //String str: Paraneter type
        String half = str.substring(0, str.length()/2);
        String SecondHalf = "";

        if (str.length() % 2 == 0){
            SecondHalf = str.substring(str.length()/2, str.length());
        }
        else { 
            SecondHalf = str.substring(str.length()/2 + 1); //如果从某个下标到最后-->,后面的部分可以省略
        }
        return reverseStr(SecondHalf).equals(half); //true or false
    }
    //判断是否是回文 method 2 --> 创建回文后判断与原有的回文是否一样
    //判断是否是回文 method 3 --> return(是否奇偶&&回||是否奇偶&&回)
}
