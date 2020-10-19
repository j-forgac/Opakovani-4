import java.util.Scanner;

public class Zacina {
    public static void main(String[] args){
        Scanner mySc = new Scanner(System.in);
        String firstText = mySc.nextLine();
        String secondText = mySc.nextLine();
        if(secondText.charAt(0) == firstText.charAt(0)){
            System.out.println(firstText.contains(secondText));
        } else {
            System.out.println("flase");
        }

    }
}
