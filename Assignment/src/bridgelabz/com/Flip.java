package bridgelabz.com;
import java.util.Random;
public class Flip {
        public static void main(String[] args) {
            int head=0;
            int tail=0;
            for (int i = 0;  i <= 10; i++) {
                if (Math.random() < 0.5) {
                    head+=1;
                    System.out.println("Heads"    );




                } else {
                    tail+=1;
                    System.out.println("Tails");
                }
            }
            System.out.println(head);
            System.out.println(tail);
        }
    }