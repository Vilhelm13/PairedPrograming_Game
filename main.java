import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

 class Question{


}






public class main {

// to not allow repeated questions we will give them a true or false status and once they are called we will set their status to false.
// No way to lose just add up total points.
// point system will be based off of code we did with the weighted system with the gpa grader.
// put questions in an array for the for loop. that way we can run it for the length of that array
//
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<String> questions = new ArrayList<String>();
        questions.add("Hows life?");
        questions.add("is it good?");
        questions.add("is it bad?");
        System.out.println(questions);
        System.out.println(questions.get(0));






        System.out.println("Welcome to the Trivia game of Trivia!!");
        System.out.println("The way to play is very simple.");
        System.out.println("there will be a question, you will give an answer, if it's correct you get points. Wrong? no points");
        System.out.println("Do you wish to play? Y/N");
        String x = scan.nextLine();
        if(x.equalsIgnoreCase("y")){
            for(int i = 0; i < 30; i++){


            }
        }


    }
}
// Will M 11:30 am 12/6/21
