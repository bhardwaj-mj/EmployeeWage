package EmpWage;

public class EmployeeWage {

    static final int WAGE_PER_HOUR=20;
    static final int FULL_TIME_HOUR=8;
    static final int PART_TIME_HOUR=4;
    static final int IS_FULL_TIME=2;
    static final int IS_PART_TIME=1;
    public static void main(String[] args) {

        int employeeAttendence=(int)Math.floor(Math.random()*10)%3;
        System.out.println(employeeAttendence);
        int dailyWage=0;
        switch(employeeAttendence) {
            case IS_FULL_TIME:
                System.out.println("Employee is Full Time");
                dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Part Time");
                dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                break;
            default:
                System.out.println("Employee is absent");
        }
//        if(employeeAttendence==2){
//            System.out.println("Employee is full time");
//            dailyWage=WAGE_PER_HOUR*FULL_TIME_HOUR;
//        }
//        else if(employeeAttendence==1){
//            System.out.println("Employee is part time");
//            dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
//        }
//        else{
//              System.out.println("Employee is absent");
//        }
        System.out.println("Daily Wage of employee is => "+dailyWage);
    }
}
