import java.util.Scanner;

public class Demo2 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        myLabel:{
            System.out.print("Enter your name:");
            String name = scanner.nextLine();
            if(name.startsWith(" ") || name.strip().length() == 0) {
                System.out.println("\033[31mInvalid Name!");
                break myLabel;
            };
            
            System.out.print("Enter your Age:");
            int age = scanner.nextInt();
            if(!(10<=age && age<=18)) {
                System.out.println("\033[31mAge should be between 10-18");
                break myLabel;
            }
            scanner.nextLine();

            System.out.print("Enter your Subject-1:");
            String subject1 = scanner.nextLine();
            if(!subject1.startsWith("SE-")) {
                System.out.println("\033[31mInvalid Subject name!");
                break myLabel;
            } 
            
            int subjectNumber1 = Integer.valueOf(subject1.substring(3));          
            System.out.print("Enter your Marks-1:");
            double marks1 = scanner.nextDouble();
            if(!(0<=marks1 && marks1<=100)) {
                System.out.println("\033[31mMark should be between 0-100");
                break myLabel;
            }
            scanner.nextLine();


            System.out.print("Enter your Subject-2:");
            String subject2 = scanner.nextLine();
            if(!subject1.startsWith("SE-")) {
                System.out.println("\033[31mInvalid Subject name!");
                break myLabel;
            };
            int subjectNumber2 = Integer.valueOf(subject2.substring(3));
            if(subjectNumber2==subjectNumber1){
                System.out.println("\033[31mSubject names cannot be same");
                break myLabel;
            }
            System.out.print("Enter your Marks-2:");
            double marks2 = scanner.nextDouble();
            if(!(0<=marks2 && marks2<=100)) {
                System.out.println("\033[31mMark should be between 0-100");
                break myLabel;
            }
            scanner.nextLine();

            System.out.print("Enter your Subject-3:");
            String subject3 = scanner.nextLine();
            if(!subject1.startsWith("SE-")) {
                System.out.println("\033[31mInvalid Subject name!");
                break myLabel;
            };
            int subjectNumber3 = Integer.valueOf(subject3.substring(3));
            if(subjectNumber3==subjectNumber1 || subjectNumber3==subjectNumber2){
                System.out.println("\033[31mSubject names cannot be same");
                break myLabel;
            }
            System.out.print("Enter your Marks-3:");
            double marks3 = scanner.nextDouble();
            if(!(0<=marks3 && marks3<=100)) {
                System.out.println("\033[31mMark should be between 0-100");
                break myLabel;
            }
            scanner.nextLine();

            double total = marks1 + marks2 + marks3;    // total marks
            double average = total / 3; // average of total marks
            String status;  // to check status of total marks
            if(average>=75){
                status = "\033[34;1mDP\033[31;0m";
            }else if(average>=65){
                status = "\033[32;1mCP\033[31;0m";
            }else if(average>=55){
                status = "\033[33;1mP\033[31;0m";
            }else {
                status = "\033[31;1mF\033[31;0m";
            }

            String status1; // to check status of subject-1
            if(marks1>=75){
                status1 = "\033[34;1mDP\033[31;0m";
            }else if(marks1>=65){
                status1 = "\033[32;1mCP\033[31;0m";
            }else if(marks1>=55){
                status1 = "\033[33;1mP\033[31;0m";
            }else {
                status1 = "\033[31;1mF\033[31;0m";
            }

            String status2; // to check status of subject-2
            if(marks2>=75){
                status2 = "\033[34;1mDP\033[31;0m";
            }else if(marks2>=65){
                status2 = "\033[32;1mCP\033[31;0m";
            }else if(marks2>=55){
                status2 = "\033[33;1mP\033[31;0m";
            }else {
                status2 = "\033[31;1mF\033[31;0m";
            }

            String status3; // to check status of subject-3
            if(marks3>=75){
                status3 = "\033[34;1mDP\033[31;0m";
            }else if(marks3>=65){
                status3 = "\033[32;1mCP\033[31;0m";
            }else if(marks3>=55){
                status3 = "\033[33;1mP\033[31;0m";
            }else {
                status3 = "\033[31;1mF\033[31;0m";
            }

            String nameString = "| Name  : \033[34;1m%-24s\033[32;0m|\n";
            String ageString = "| Age   : \033[34;1m%d years old%12s\033[32;0m|\n";
            String statusString = "| Status: %-38s|\n";
            String totalString = "| Total : \033[33;1m%-8s\033[32;0m Avg: \033[33;1m%.2f %%\033[32;0m%3s|\n";
            String topicsString = "| %-10s| %-10s| %-8s|\n";
            String contentString = "| SE-%03d%4s| %-10.2f| %-22s|\n";
            String tabelString = "+---------------------------------+";


            System.out.println(tabelString);
            System.out.printf(nameString,name);
            System.out.printf(ageString,age, "");
            System.out.printf(statusString,status);
            System.out.printf(totalString,total,average, "");
            System.out.println(tabelString);
            System.out.printf(topicsString, "Subject", "Marks", "Status");
            System.out.println(tabelString);
            System.out.printf(contentString, subjectNumber1,"", marks1, status1);
            System.out.printf(contentString, subjectNumber2,"", marks2, status2);
            System.out.printf(contentString, subjectNumber3,"", marks3, status3);
            System.out.println(tabelString);


        }
    }
}
