// Will M 11:30 - 12 pm
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class main {

    // to not allow repeated questions we will give them a true or false status and once they are called we will set their status to false.
// No way to lose just add up total points.
// point system will be based off of code we did with the weighted system with the gpa grader.
// put questions in an array for the for loop. that way we can run it for the length of that array
// Will M's code
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();




        System.out.println("Welcome to the Trivia game of Trivia!!");
        System.out.println("The way to play is very simple.");
        System.out.println("there will be a question, you will give an answer, if it's correct you get points. Wrong? no points");
        System.out.println("Do you wish to play? Y/N");
        int counter = 0;
        String z = scan.nextLine();
        while (z.equalsIgnoreCase("y")) {
            String x = scan.nextLine();


            ArrayList<String> movies = new ArrayList<String>();
            movies.add("Star wars?");
            movies.add("Ant-Man?");
            movies.add("titanic?");
            movies.add("wall-e?");
            movies.add("Toy story?");
            int moviesUpper = 5;
            int random = rand.nextInt(moviesUpper);
            //System.out.println(movies.get(random));


            ArrayList<String> questions = new ArrayList<String>();
            questions.add("Who is the director");
            questions.add("Who is the main actor");
            questions.add("What is the genre");
           // System.out.println(questions);
         //   System.out.println(questions.get(0));
            int questionUpper = 3;
            int int_rand = rand.nextInt(questionUpper);
            //System.out.println(int_rand);


            System.out.println(questions.get(int_rand) + " of " + movies.get(random));

            if (questions.get(int_rand).equalsIgnoreCase("Who is the director") && movies.get(random).equalsIgnoreCase("Star wars?")) {
                String answer = "George Lucas";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("Who is the director") && movies.get(random).equalsIgnoreCase("Ant-Man?")) {
                String answer = "Peyton Reed";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("Who is the director") && movies.get(random).equalsIgnoreCase("titanic?")) {
                String answer = "James Cameron";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("Who is the director") && movies.get(random).equalsIgnoreCase("wall-e?")) {
                String answer = "Andrew Stanton";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("Who is the director") && movies.get(random).equalsIgnoreCase("Toy story?")) {
                String answer = "John Lasseter";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("Who is the main actor") && movies.get(random).equalsIgnoreCase("Toy story?")) {
                String answer = "Tom Hanks";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("Who is the main actor") && movies.get(random).equalsIgnoreCase("wall-e?")) {
                String answer = "Ben Burtt";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("Who is the main actor") && movies.get(random).equalsIgnoreCase("titanic?")) {
                String answer = "leonardo dicaprio";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("Who is the main actor") && movies.get(random).equalsIgnoreCase("Ant-Man?")) {
                String answer = "Paul Rudd";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("Who is the main actor") && movies.get(random).equalsIgnoreCase("Star wars?")) {
                String answer = "Mark Hamill";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("What is the genre") && movies.get(random).equalsIgnoreCase("Star wars?")) {
                String answer = "sci-fi";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("What is the genre") && movies.get(random).equalsIgnoreCase("Ant-Man?")) {
                String answer = "sci-fi";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("What is the genre") && movies.get(random).equalsIgnoreCase("titanic?")) {
                String answer = "romance";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("What is the genre") && movies.get(random).equalsIgnoreCase("wall-e?")) {
                String answer = "cartoon";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (questions.get(int_rand).equalsIgnoreCase("What is the genre") && movies.get(random).equalsIgnoreCase("Toy story?")) {
                String answer = "cartoon";
                x= scan.nextLine();
                if (x.equalsIgnoreCase(answer)) {
                    System.out.println("that's right");
                    counter++;
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Score: " + counter);
                    System.out.println("keep playing? Y/N");
                    z=scan.nextLine();
                    if(z.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }


































            //Julian 12am -1:26am
        /*     String b = "George Lucas";
            String a = scan.nextLine();


            if( a.equalsIgnoreCase(b) ) {

                System.out.println("that's right");
                counter++;
                System.out.println("Score: " + counter);
            }


            System.out.println("Your move is " + movies.get(random));
            for(int i = 0; i < 6; i++){
                //System.out.println(movies.get(5));
               // movies.remove(random);
               // System.out.println("Your movie is " + movies.get(random));
                //movies.remove(random);



            }
        }
*/


        }
    }
}

// Will M 11:30 am 12/6/21
