public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static void employeeWage(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < noOfWorkingDays) {
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
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Emp Wage for company " + companyName + " is " + totalEmpWage);
    }

    public static void main(String[] args) {
        employeeWage("Dmart", 20, 6, 10);
        employeeWage("JIO", 27, 16, 20);
    }
}