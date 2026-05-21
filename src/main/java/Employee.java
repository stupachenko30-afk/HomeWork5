public abstract class Employee {



        private String name;
        private String jobtitle;

        public Employee(){}

    public Employee(String name, String jobtitle) {
        this.name = name;
        this.jobtitle = jobtitle;
    }

    public void setName(String name) {
            if (name != null)
                this.name = name;
        }

        public void setJobtitle(String jobtitle) {
            if (jobtitle != null)
                this.jobtitle = jobtitle;
        }

    public String getName() {
        return name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public abstract double calculatePay();
}


