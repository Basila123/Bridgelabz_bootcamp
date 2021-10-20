package bridgelabz.com;

public class Usecase6 {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HR=20;
    public static final int NUM_OF_WRKNG_DAYS=2;
    public static void main(String[] args){
        int empHr=0, empWage=0,totalWage=0;
        for (int day =0; day<NUM_OF_WRKNG_DAYS;day++){
            int empCheck=(int)Math.floor(Math.random()*10)%3;
            switch(empCheck){
                case IS_PART_TIME:
                    empHr=4;
                    break;
                case IS_FULL_TIME:
                    empHr=8;
                    break;
                default:
                    empHr=0;

            }
            empWage=empHr*EMP_RATE_PER_HR;
            totalWage+=empWage;
            System.out.println("Employee Wage"+ empWage);
            totalWage+=empWage;
            System.out.println("Emp Wage:"+ empWage);

        }
        System.out.println("Total Emp Wage:"+ totalWage);
    }

}
