import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // array is made to hold students scores
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String userName;
        int userScore;
        int studentNum;
        int gradeNum;

        System.out.print("Enter the number of students: ");
        studentNum = scan.nextInt();
        scan.nextLine();

        for(int i = 1; i <= studentNum; i++){
            System.out.print("Enter the name of student " + i + ": ");
            userName = scan.nextLine();

            System.out.print("Enter the number of grades for " + userName + ": ");
            gradeNum = scan.nextInt();
            scan.nextLine();
            Student.printGrade(gradeNum);
        }

        // loop to allow the teacher to enter multiple assignment scores
        while (true) {
            System.out.println("Please enter name or press enter to stop:");
            Scanner scnr = new Scanner(System.in);
            userName = scnr.nextLine();

            // ends code
            if (userName.isEmpty()) {
                break;
            }

            System.out.println("Please enter their score:");

            // code will stop if no int was put in
            if (scnr.hasNextInt()){
                userScore = scnr.nextInt();
            } else {
                System.out.println("Invalid input");
                break;
            }

            // inputs gets stored into array
            numbers.add(userScore);

            // created an instance of the class student
            //using the input, sees what grade they get
            Student StuOne = new Student(userName, userScore);
            StuOne.calcGrade(userName, userScore);
        }
        //gets average and displays it
        int average = Student.calcAverage(numbers);
        Student.calcGrade("Average is " + average, average);
    }
}