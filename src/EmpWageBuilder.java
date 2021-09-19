
public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS = 30;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static void employeeWage() {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            double empCheck = (Math.floor(Math.random() * 10) % 3);
            if (empCheck == IS_FULL_TIME)
                empHrs = 8;
            else if (empCheck == IS_PART_TIME)
                empHrs = 4;
            else
                empHrs = 0;

            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + "Emp Hr:" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
        System.out.println("Total Emp Wage is " + totalEmpWage);
    }

    public static void main(String[] args) {
        employeeWage();
    }
}