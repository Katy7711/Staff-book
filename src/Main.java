import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        for (int i = 0; i < employee.length; i++) {
            employee[0] = new Employee("Иванов Иван Иванович", 1, 35000);
            employee[1] = new Employee("Петров Сергей Александрович", 2, 45600);
            employee[2] = new Employee("Соколова Наталья Владимировна", 3, 30200);
            employee[3] = new Employee("Быков Андрей Павлович", 1, 34500);
            employee[4] = new Employee("Карпов Александр Васильевич", 2, 38400);
            employee[5] = new Employee("Смирнова Ольга Алексеевна", 3, 30400);
            employee[6] = new Employee("Камаров Александр Владисирович", 1, 48100);
            employee[7] = new Employee("Котов Георгий Сергеевич", 2, 42500);
            employee[8] = new Employee("Волкова Алена Николаевна", 3, 32800);
            employee[9] = new Employee("Петухов Юрий Александрович", 1, 37000);
            employee[i].setSalary(employee[i].getSalary());
            System.out.println(employee[i]);
        }
        printList(employee);
        calculateSum(employee);
        calculateMaxSalary(employee);
        calculateMinSalary(employee);
        calculateMeanSalary(employee);
        calculateSalaryOneDepartment(employee);


    }

    public static void printList(Employee[] Employee) {
        for (Employee employee : Employee) {
            System.out.println(employee.getFullName());

        }
    }


    public static void calculateSum(Employee[] Employee) {
        int sum = 0;
        for (Employee employee : Employee) {
            sum += employee.getSalary();
            System.out.println("сумма затрат на зарплаты в месяц: " + sum + " рублей");
        }
    }

    public static void calculateMaxSalary(Employee[] Employee) {
        int max = Integer.MIN_VALUE;
        for (Employee employee : Employee) {
            if (employee.getSalary() > max)
                max = employee.getSalary();


            System.out.println("сотрудник с максимальной зарплатой: " + employee.getFullName());

        }
    }


    public static void calculateMinSalary(Employee[] Employee) {
        int min = Integer.MAX_VALUE;
        for (Employee employee : Employee) {
            if (employee.getSalary() < min)
                min = employee.getSalary();


            System.out.println("сотрудник с максимальной зарплатой: " + employee.getFullName());

        }
    }

    public static void calculateMeanSalary (Employee[] Employee) {
        int sum = 0;
        int meanSalary = 0;
        for (Employee employee : Employee) {
            sum += employee.getSalary();
            meanSalary = sum / employee.getSalary();
            System.out.println("среднее значение зарплат -  " + meanSalary + " рублей");
        }

    }

    public static void calculateSalaryOneDepartment(Employee[] Employee) {
        for (Employee employee : Employee) {
            if (employee.getDepartment() == 1) ;


        }
    }

}







