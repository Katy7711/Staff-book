
public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 1, 35000);
        employee[1] = new Employee("Петров Сергей Александрович", 2, 45600);
        employee[2] = new Employee("Соколова Наталья Владимировна", 3, 30200);
        employee[3] = new Employee("Быков Андрей Павлович", 1, 34500);
        employee[4] = new Employee("Карпов Александр Васильевич", 2, 38400);
        employee[5] = new Employee("Смирнова Ольга Алексеевна", 3, 30400);
        employee[6] = new Employee("Камаров Александр Владимирович", 1, 48100);
        employee[7] = new Employee("Котов Георгий Сергеевич", 2, 42500);
        employee[8] = new Employee("Волкова Алена Николаевна", 3, 32800);
        employee[9] = new Employee("Петухов Юрий Александрович", 1, 37000);
        for (Employee employee1 : employee) {
            System.out.println(employee1);
        }

        printList(employee);
        calculateSum(employee);
        calculateMaxSalary(employee);
        calculateMinSalary(employee);
        calculateMeanSalary(employee);
        indexingSalary(employee, 5);
        calculateSalaryOneDepartment(employee, 1);
        calculateMaxSalaryDepartment(employee, 2);
        calculateMinSalaryDepartment(employee, 3);
        calculateMeanSalaryDepartment(employee, 1);
        printListOneDepartment(employee, 2);
        employeesSalaryMoreThanNumber (employee, 45000);
        employeesSalaryLessThanNumber (employee, 45000);


    }

    public static void printList(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());

        }
    }

    public static void calculateSum(Employee[] Employee) {
        int sum = 0;
        for (Employee employee : Employee) {
            if (employee.getSalary() != 0)
            {
                sum += employee.getSalary();
            }
        }
        System.out.println("сумма затрат на зарплаты в месяц: " + sum + " рублей");
    }

    public static void calculateMaxSalary(Employee[] employees) {
        int max = employees[0].getSalary();
        String fullName = "сотрудник не найден";
        for (Employee employee : employees) {
            if (employee.getSalary() != 0)
            {
                if (employee.getSalary() > max) {
                    max = employee.getSalary();
                    fullName = employee.getFullName();
                }
            }
        }
        System.out.println("сотрудник с максимальной зарплатой: " + fullName);
    }

    public static void calculateMinSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        String fullName = "сотрудник не найден";
        for (Employee employee : employees) {
            if (employee.getSalary() != 0)
            {
                if (employee.getSalary() < min) {
                    min = employee.getSalary();
                    fullName = employee.getFullName();
                }
            }
        }
        System.out.println("сотрудник с минимальной зарплатой: " + fullName);

    }

    public static void calculateMeanSalary(Employee[] employees) {
        int sum = 0;
        int meanSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() != 0)
            {
                sum += employee.getSalary();
                meanSalary = sum / employees.length;
            }
        }
        System.out.println("среднее значение зарплат -  " + meanSalary + " рублей");
    }

    public static void indexingSalary(Employee[] employees, int percent) {
        int salary;
        for (Employee employee : employees) {
            if (employee.getSalary() != 0)
            {
                salary = employee.getSalary() / 100 * percent + employee.getSalary();
                employee.setSalary(salary);
                System.out.println("новая заработная плата - " + employee.getFullName() + ": " + salary);
            }
        }
    }


    public static void calculateSalaryOneDepartment(Employee[] employees, int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() != 0 && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        System.out.println("сумма затрат на зарплаты по отделу в месяц: " + sum + " рублей");
    }

    public static void calculateMaxSalaryDepartment(Employee[] employees, int department) {
        int max = 0;
        String fullName = "сотрудник не найден";
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() != 0) {
                if (employee.getSalary() > max) {
                    max = employee.getSalary();
                    fullName = employee.getFullName();
                }
            }
        }
        System.out.println("сотрудник с максимальной зарплатой: " + fullName);
    }

    public static void calculateMinSalaryDepartment(Employee[] employees, int department) {
        int min = Integer.MAX_VALUE;
        String fullName = "сотрудник не найден";
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() != 0) {
                if (employee.getSalary() < min) {
                    min = employee.getSalary();
                    fullName = employee.getFullName();
                }
            }
        }
        System.out.println("сотрудник с минимальной зарплатой: " + fullName);
    }

    public static void calculateMeanSalaryDepartment(Employee[] employees, int department) {
        int sum = 0;
        int person = 0;
        int meanSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() != 0 && employee.getDepartment() == department) {
                sum += employee.getSalary();
                person += employee.getDepartment();
                meanSalary = sum / person;
            }
        }
        System.out.println("среднее значение зарплат -  " + meanSalary + " рублей");
    }

    public static void printListOneDepartment(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department)
                System.out.println(employee.print());

        }
    }

    public static void employeesSalaryMoreThanNumber(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() != 0 && employee.getSalary() >= number)
                System.out.println(employee.print());
        }
    }

    public static void employeesSalaryLessThanNumber (Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() != 0 && employee.getSalary() < number)
                System.out.println(employee.print());

        }
    }
}










