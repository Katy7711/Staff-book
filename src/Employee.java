public class Employee {


    static Employee employee1 = new Employee("Иванов Иван Иванович", 1, 35000);
    static Employee employee2 = new Employee("Петров Сергей Александрович", 1, 45600);
    static Employee employee3 = new Employee("Соколова Наталья Владимировна", 1, 30200);
    static Employee employee4 = new Employee("Быков Андрей Павлович", 1, 34500);
    static Employee employee5 = new Employee("Волков Александр Борисович", 1, 47800);



    private final String fullName;
    private int department;
    private int salary;
    private final int id;

    private static int counter = 0;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


