public class SalaryEmployee extends Employee {

    private double weeklySalary;

    public SalaryEmployee() {
    }

    @Override
    public String calculateSalary() {
        return super.toString()
                + "WeeklySalary " + weeklySalary;
    }

    public SalaryEmployee(String name, String jobtitle, double weeklySalary) {
        super(name, jobtitle);
        this.weeklySalary = weeklySalary;
    }


    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >= 0)
            this.weeklySalary = weeklySalary;
    }


    }

//    @Override
//    public String toString() {
//        return SalaryEmployee;
//        "Name " + getName()
//                + "Jobtitle " + getJobtitle()
//                + "WeeklySalary " + weeklySalary;
//    }







