public class HourlyEmployee extends Employee {

    private double payRate;
    private int hoursWorked;

    public HourlyEmployee() {
    }



    public void setPayRate(double payRate) {
        if (payRate > 0)
            this.payRate = payRate;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked >= 0)
            this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    @Override
    public double calculatePay() {
        return payRate * hoursWorked;
    }



}

