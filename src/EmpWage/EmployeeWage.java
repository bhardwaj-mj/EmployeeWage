package EmpWage;

public class EmployeeWage {

    public static void main(String[] args) {

        int employeeAttendence=(int)Math.floor(Math.random()*10)%2;
        System.out.println(employeeAttendence);
        if(employeeAttendence==1){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}
