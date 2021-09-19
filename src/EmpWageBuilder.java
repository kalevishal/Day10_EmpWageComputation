public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private static CompanyInfo[] companyInfoArray = new CompanyInfo[3];
    private int numOfCompany = 0;

    public static int computeEmpWage(CompanyInfo companyInfo) {
        int empHrs = 0;
        int totalWage = 0;
        int totalHrs = 0;

        int day = 1;
        while (day <= companyInfo.getNoOfWorkingDays() && totalHrs < companyInfo.getMaxHrsPerMonth()) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            int empWage = empHrs * companyInfo.getEmpRatePerHr();

            totalHrs += empHrs;
            totalWage += empWage;
            day++;
        }
        return totalWage;
    }

    public static void main(String[] args) {
        EmpWageBuilder employeeWageBuilder = new EmpWageBuilder();
        employeeWageBuilder.addCompanyEmpWage("Dmart", 20, 6, 10);
        employeeWageBuilder.addCompanyEmpWage("JIO", 27, 16, 10);
        employeeWageBuilder.addCompanyEmpWage("Airtel", 27, 16, 10);

        for (int i = 0; i < companyInfoArray.length; i++) {
            System.out.println(companyInfoArray[i]);
        }

    }

    private void addCompanyEmpWage(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth) {
        CompanyInfo companyInfo = new CompanyInfo(companyName, empRatePerHr, noOfWorkingDays, maxHrsPerMonth);
        companyInfoArray[numOfCompany] = companyInfo;
        numOfCompany++;
    }

}