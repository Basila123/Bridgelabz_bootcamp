package bridgelabz.com;

public class Usecase1 {

    public static void main(String[] args) {
        // write your code here
        //constant
        int IS_FULL_TIME=1;
        // computation
        double empCheck=Math.floor(Math.random()*10)%2;
        if ( empCheck==IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Emmployee is absent");
    }
}
