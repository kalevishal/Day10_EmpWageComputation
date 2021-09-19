public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private final String companyName;
    private final int empRatePerHr;
    private final int noOfWorkingDays;
    private final int maxHrsPerMonth;
    private int totalEmpWage;

    public EmpWageBuilder(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth) {
        this.companyName = companyName;
        this.empRatePerHr = empRatePerHr;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public  void employeeWage() {
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
         totalEmpWage = totalEmpHrs * empRatePerHr;
    }
        public String toString() {
        return "Total Emp Wage for company " + companyName + " is " + totalEmpWage;
     }


    public static void main(String[] args) {
        EmpWageBuilder dMart=new EmpWageBuilder("Dmart", 20, 6, 10);
        EmpWageBuilder jio=new EmpWageBuilder("JIO", 27, 16, 20);
        dMart.employeeWage();
        System.out.println(dMart);
        jio.employeeWage();
        System.out.println(jio);
    }
}