public class HourlyEmployee extends Employee{

    private double payRate;
    private int hoursWorked;

    public HourlyEmployee(){}


    public HourlyEmployee(String name, String jobtitle, double payRate, int hoursWorked) {
        super(name, jobtitle);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        if (payRate > 0)
        this.payRate = payRate;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked > 0)
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString()
                + "PayRate: " + payRate
                + "HoursWorked: " + hoursWorked;
    }
    @Override
    public double calculateSalary() {
        double pay = (payRate * hoursWorked);
        return pay;

    }
}
