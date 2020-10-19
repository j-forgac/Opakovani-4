import java.util.Scanner;

public class Jepali {

    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        String input = mySc.nextLine();
        String secondInput = mySc.nextLine();
        String palindrom = "";
        for (int x = input.length() - 1; x > -1; x--) {
            palindrom += input.charAt(x);
        }

        System.out.println(secondInput.equals(palindrom));
    }

}
