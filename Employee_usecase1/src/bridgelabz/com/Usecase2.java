package bridgelabz.com;

public class Usecase2 {
    public static void main(String[] args) {
        // write your code here
        //constant
        int IS_FULL_TIME=1;
        int EMP_RATE_PER_HR=20;
        // variables
        int empHrs=0;
        int empWages=0;
        // computation
        double empCheck=Math.floor(Math.random()*10)%2;
        if ( empCheck==IS_FULL_TIME)
            empHrs=8;
        else
            empHrs=0;
        empWages=empHrs*EMP_RATE_PER_HR;
        System.out.println("Employee Wages ="+ empWages);

    }
}
