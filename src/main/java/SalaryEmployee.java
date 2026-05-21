public class SalaryEmployee extends Employee {

    private double weeklySalary;

    public SalaryEmployee() {
    }



    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >=0)
        this.weeklySalary = weeklySalary;
    }
    @Override
    public double calculatePay() {
        return weeklySalary;
    }
}

//    @Override
//    public String toString() {
//        return SalaryEmployee;
//        "Name " + getName()
//                + "Jobtitle " + getJobtitle()
//                + "WeeklySalary " + weeklySalary;
//    }







