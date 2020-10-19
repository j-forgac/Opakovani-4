import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
        Scanner mySc = new Scanner(System.in);
        String input = mySc.nextLine();
        String output = "";
        for(int x = input.length() - 1; x > -1; x--){
            output += input.charAt(x);
        }
        System.out.println(output);
    }
}
