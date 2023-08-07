import java.util.Scanner;

public class Demo1 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String name = " Hello Java     ";
        System.out.println(name.strip());
        System.out.println(name.stripLeading());
        System.out.println(name.stripTrailing());

        System.out.println("---------------------");

        System.out.println(name.startsWith(" "));
        System.out.println(name.endsWith("L"));

        System.out.println(name.strip().toUpperCase());
        System.out.println(name.stripTrailing().toUpperCase());

        String str = name.substring(1, 6);
        System.out.println(str);

        System.out.print("Enter your name:");
        String name2 = scanner.nextLine();
        String name3 = name2.substring(3);
        System.out.println(name3);
        int myBool = Integer.valueOf(name3);
        System.out.println(myBool);


    }
}