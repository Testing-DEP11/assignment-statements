import java.util.Scanner;

public class Demo2 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        name:{
            System.out.print("Enter your name:");
            String name = scanner.nextLine();
            if(name.startsWith(" ") || name.strip().length() == 0) {
                System.out.println("\033[31mInvalid Name!");
                break name;
            };
            
            System.out.print("Enter your Age:");
            int age = scanner.nextInt();
            if(!(10<=age && age<=18)) {
                System.out.println("\033[31mAge should be between 10-18");
                break name;
            }
            scanner.nextLine();

            System.out.print("Enter your Subject-1:");
            String subject1 = scanner.nextLine();
            if(!subject1.startsWith("SE-")) {
                System.out.println("\033[31mInvalid Subject name!");
                break name;
            } 
            int subjectNumber1 = Integer.valueOf(subject1.substring(3));
            System.out.print("Enter your Marks-1:");
            double marks1 = scanner.nextDouble();
            scanner.nextLine();


            // System.out.print("Enter your Subject-2:");
            // String subject2 = scanner.nextLine();
            // if(!subject1.startsWith("SE-")) {
            //     System.out.println("\033[31mInvalid Subject name!");
            //     break name;
            // };
            // int subjectNumber2 = Integer.valueOf(subject1.substring(3));
            // System.out.print("Enter your Marks-2:");
            // double marks2 = scanner.nextDouble();
            // scanner.nextLine();

            // System.out.print("Enter your Subject-3:");
            // String subject3 = scanner.nextLine();
            // if(!subject1.startsWith("SE-")) {
            //     System.out.println("\033[31mInvalid Subject name!");
            //     break name;
            // };
            // int subjectNumber3 = Integer.valueOf(subject1.substring(3));
            // System.out.print("Enter your Marks-3:");
            // double marks3 = scanner.nextDouble();
            // scanner.nextLine();

            double total = marks1; //+ marks2 + marks3;
            double average = total / 3;
            String status;
            if(average>=75){
                status = "DP";
            }else if(average>=65){
                status = "CP";
            }else if(average>=55){
                status = "P";
            }else {
                status = "F";
            }
            System.out.println(status);

            String nameString = "| Name  : \033[34;1m%-30s\033[32;0m|\n";
            String ageString = "| Age   : \033[34;1m%d years old%18s\033[32;0m|\n";
            String statusString = "| Status: \033[33;1m%-30s\033[32;0m|\n";
            String totalString = "| Total : \033[33;1m%-10s\033[32;0mAvg: \033[33;1m%.2f %%\033[32;0m%8s|\n";


            System.out.println("+---------------------------------------+");
            System.out.printf(nameString,name);
            System.out.printf(ageString,age,"");
            System.out.printf(statusString,status);
            System.out.printf(totalString,total,average,"");
            System.out.println("+---------------------------------------+");
            System.out.printf("| %-12s| %-11s| %-11s|\n", "Subject", "Marks", "Status");
            System.out.println("+---------------------------------------+");
            System.out.printf("| SE-%03d%3s| %-11s| %-11s|\n", subjectNumber1,"", "Marks", "Status");

        }
    }
}
