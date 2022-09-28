package EmpWage;

public class EmployeeWage {

    static final int WAGE_PER_HOUR=20;
    static final int FULL_TIME_HOUR=8;

    public static void main(String[] args) {

        int employeeAttendence=(int)Math.floor(Math.random()*10)%2;
        System.out.println(employeeAttendence);
        int dailyWage=0;
        if(employeeAttendence==1){
            System.out.println("Employee is present");
            dailyWage=WAGE_PER_HOUR*FULL_TIME_HOUR;
        }
        else{
            System.out.println("Employee is absent");
        }
        System.out.println("Daily Wage of employee is => "+dailyWage);
    }
}
