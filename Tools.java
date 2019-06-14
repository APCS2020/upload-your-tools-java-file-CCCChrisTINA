import java.util.Scanner;

public class Tools{
    /**print a line on the screen
     * @param num how many times print charactor str
     * @param str the charactoe for print
     */
    //method 1
    public static void printLine(int num, String str){
        for (int i = 0; i < num; i++){
            System.out.print(str);//str->a, a1, string...
    }
    System.out.println();
}
    //method 2
public static void printSquare(int num, String str){
    for(int i = 0; i <num; i++){
        printLine(num, str);
    }
}
    //method 3
public static void printRectangle(int width, int length, String str){
    for (int r = 0; r < width; r++)
    printLine(length, str);
    }
    //get a int form user input
    public static int getInt(String str){
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
    public static int getInt(){
        System.out.println("Enter an Integer: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
    //get a string
    public static String getStr(String str){
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
    public static String getStr(){
        System.out.println("Enter a String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
    public static int add(int a, int b){
        return a + b;
    }
    /**change a = 10 to 5
     * but this method don't work as intended 
     * because java pass parameter by value
     */
    public static void modify(int chris){ // local variable 局部变量
        chris = 5;
    }
    public static int change(int chris){ //return a now value
        return chris - 5;
    }
    //week day 7-->Sunday
    public static String weekday(int t){
        if (t == 1){
            return "Monday";
        }
        else if (t == 2){
            return "Tuesday";
        }
        else if (t == 3){
            return "Wednesday";
        }
        else if (t == 4){
            return "Thursday";
        }
        else if (t == 5){
            return "Friday";
        }
        else if (t == 6){
            return "Saturday";
        }
        else if (t == 7){
            return "Sunday";
        }
        else{
            return "404";
        }
    }
    /** display the pattern
     * 1
     * 12
     * 123
     */
    public String numTran(int n){
        String tmp = "";
        for(int i = 0; i < 3; i++){
            for(int j = i; j < 3; j++){
            tmp += 1;
            }
            tmp += "\n";
        }
        return tmp;
    }
}