public class MainEmployee {
    public static void main(String[] args) {
        printStrReverse("performance");

//        HourlyEmployee he =new HourlyEmployee("Adrey Orlov" , "QA Automate", 35, 40); // нет конструктора
//        System.out.println("Hourly Salary");
//        System.out.println("Name: "+he.getName());
    }

    public static void printStrReverse(String s) {


        for (int i = s.length() - 1; i >= 0; i--){
            System.out.println(s.charAt(i));
        }

        System.out.println();
    }

}

/*
--i
01234   length = 5
"hello"
 */