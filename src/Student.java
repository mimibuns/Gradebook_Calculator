import java.util.ArrayList;
import java.util.Scanner;

//made student class that can inherit from the person class by using extends
    public class Student extends Main{
        String firstName;
        String userName;
        int userScore;

        //parameterised constructor
        Student(String userName, int userScore){
            this.userName = userName;
            this.userScore = userScore;
        }

        public static void printGrade(int gradeNum){
            Scanner scan = new Scanner(System.in);

            for(int i = 1; i <= gradeNum; i++){
                System.out.print("Enter grade " + i + ": ");
                scan.nextInt();
            }
        }

        //gets average
        public static int calcAverage(ArrayList<Integer> numbers){
            int sum = 0;

            for (int number : numbers){
                sum += number;
            }
            return sum / numbers.size();
        }

        // sees what grade they get
        public static void calcGrade(String name, int score) {
            if (score >= 90 && score <=100){
                System.out.println(name + " A");
            } else if (score >= 80 && score <=89) {
                System.out.println(name + " B");
            } else if (score >= 70 && score <=79) {
                System.out.println(name + " C");
            } else if (score >= 60 && score <=69) {
                System.out.println(name + " D");
            } else {
                System.out.println(name + " F");
            }
        }
    }