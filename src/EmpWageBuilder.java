public class EmpWageBuilder {
    int IS_FULL_TIME = 1;
    int IS_PART_TIME = 2;
    int EMP_RATE_PER_HR = 20;
    int NUM_OF_WORKING_DAYS = 30;

    public void employeeWage() {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        for (int days = 1; days <= NUM_OF_WORKING_DAYS; days++) {
            double empCheck = (Math.floor(Math.random() * 10) % 3);
            if (empCheck == IS_FULL_TIME)
                empHrs = 8;
            else if (empCheck == IS_PART_TIME)
                empHrs = 4;
            else
                empHrs = 0;

            empWage = empHrs * EMP_RATE_PER_HR;
            totalEmpWage += empWage;
            System.out.println("Emp Wage is " + empWage);
        }
        System.out.println("Total Emp Wage is " + totalEmpWage);
    }

    public static void main(String[] args) {
        EmpWageBuilder emp = new EmpWageBuilder();
        emp.employeeWage();
    }
}