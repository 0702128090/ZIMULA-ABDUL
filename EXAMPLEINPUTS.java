import java.util.Scanner;

public class EXAMPLEINPUTS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("How old are you?");
        int age = sc.nextInt();

        System.out.println("What is your favorite movie");
        String movie = sc.nextLine();

        System.out.println("Your name is " + name + " You are " + age);
        System.out.println("Your favorite movie is" + movie);
        sc.close();

    }
}