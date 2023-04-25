import java.util.Scanner;

public class Main2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        String old = scanner.nextLine();
        System.out.println("What is your favorite car?");
        String car = scanner.nextLine();
        System.out.println("Whats is your UserName?");
        String userName = scanner.nextLine();
        System.out.println("Whats is your UserName?");
        String password = scanner.nextLine();
        System.out.println("Hi " + name + "!");
        System.out.println("You are " + old + " years old.");
        System.out.println("Your favorite car is " + car + ".");
        System.out.println("Your User Name is: " + userName);
        System.out.println("You Password is: " + password);


    }
}
