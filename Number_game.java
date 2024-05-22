import java.lang.Math;
import java .util.Scanner;
public class Number_game {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);

            int rand=0+(int)(Math.random()* ((100-0)+1));
            System.out.println("Random number is generated  ");
            System.out.println(rand);
            System.out.println("Enter the number of rounds user can guess");
            int rounds=sc.nextInt();
            System.out.println("Enter number of chances user gets in each round");
            int chances =sc.nextInt();
            int score =0;
            int c=1;
            int n;
            while(rounds>0  ){

                 n=chances;
                 System.out.println("Round:"+c);
                 int ch=1;
                 while(n >0){
                     System.out.println("Chance:"+ch);
                     System.out.println("Guess the number");

                    int guess=sc.nextInt();
                    if (guess>100) System.out.println("Invalid guess");
                    else if (guess==rand){ System.out.println("Correct guess"); score ++;}
                    else if ((guess+10)<=rand)System.out.println("Guess is too low");
                    else if ((guess-10)>=rand)System.out.println("guess is too high");
                    else System.out.println("You are close");
                    n--;ch++;



                }
                rounds--;
                c++;
            }
        System.out.println("Total score "+score);


    }
}

