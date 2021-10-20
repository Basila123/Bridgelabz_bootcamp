package bridgelabz.com;

import java.util.Random;
public class Usecase2 {

        public static void main(String[] args)
        {
            int d_Rolls=0;
            int P=0;
            Random rand1 = new Random();

            while(P < 100) {
                int dice = rand1.nextInt(1,7);
                d_Rolls+= 1;
                P += dice;
                System.out.println("Die number is: "+dice);
            }

        }
    }

