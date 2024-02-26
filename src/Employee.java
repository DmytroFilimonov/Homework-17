/**
 * AIT-TR, cohort 42.1, java Basic, Homework 17
 *
 * @version 22-Feb-24
 *
 * @author Dmytrij Filimonov
 */


public class Employee {
    // Поля класса
    final private String fullName;
    final private String position;
    final private String email;
    final private String phone;
    final private double salary;
    final private int age;

    // Конструктор класса
    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Метод для получения возраста сотрудника
    public int getAge() {
        return age;
    }

    // Метод для вывода информации о сотруднике
    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        // Создание массива из 5 сотрудников
        Employee[] employees = {
                new Employee("Иванов Петр Иванович", "Менеджер", "ivanov@example.com", "123-456-7890", 50000, 45),
                new Employee("Петров Николай Петрович", "Разработчик", "petrov@example.com", "987-654-3210", 60000, 35),
                new Employee("Сидоров Вадим Васильевич", "Дизайнер", "sidorov@example.com", "111-222-3333", 55000, 42),
                new Employee("Новоселов Александр Игоревич", "Тестировщик", "kozlov@example.com", "444-555-6666", 52000, 50),
                new Employee("Новиков Анатолий Александрович", "Аналитик", "novikov@example.com", "777-888-9999", 58000, 38)
        };

        // Вывод информации о сотрудниках старше 40 лет
        System.out.println("Сотрудники старше 40 лет:");
        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.printInfo();
            }
        }
    }
}











