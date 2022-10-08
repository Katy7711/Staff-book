public class Main {
    public static void main(String[] args) {


        Employee[] employee = new Employee[10];
        employee[0] = Employee.employee1;
        employee[1] = Employee.employee2;
        employee[2] = Employee.employee3;
        employee[3] = Employee.employee4;
        employee[4] = Employee.employee5;

//зависла на этом:  Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
        // мможно ли вот так из класса employee вставить данные в массив? Если да,
        // то как это вывести в консоль? Или надо было в классе main создавать новых сотрудников?

    }
}