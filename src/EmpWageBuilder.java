public class EmpWageBuilder {

    public void employeeWage() {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HR = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = (Math.floor(Math.random() * 10) % 3);
        switch ((int) empCheck) {
            case 1:
                empHrs = 8;
                break;
            case 2:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HR;
        System.out.println("Emp Wage is " + empWage);
    }

    public static void main(String[] args) {
        EmpWageBuilder emp = new EmpWageBuilder();
        emp.employeeWage();
    }
}