package bridgelabz.com;

import java.util.Random;

public class Usecase5 {

        public static void main(String[] args){

            int p = 0;
            final int NO_PLAY=1;
            final int LADDER=2;
            final int SNAKE=3;
            int d_Rolls = 0;

            Random rand = new Random();

            while(p<100) {
                int dice = rand.nextInt(1,7) ;
                d_Rolls += 1;
                int options = rand.nextInt(1,3) ;

                switch (options) {
                    case NO_PLAY: break;
                    case LADDER:
                        if (p + dice <= 100) {
                            p += dice;
                        }
                        break;
                    case SNAKE:
                        if (p - dice >= 0) {
                            p -= dice;
                        } else
                            p = 0;
                        break;
                }
                System.out.println("Current position is: "+p);
            }
            System.out.println("Number of times die has rolled: "+d_Rolls);
            System.out.println("Reached 100");
        }
    }


