package homework.employee;

import homework.employee.model.Employee;
import homework.employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean isRun = true;
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    static void main() {

        while (isRun) {

            Commands.printCommands();
            String command = scanner.nextLine();

            switch (command) {

                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmploye();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_EMPLOYEE_ID:
                    System.out.println("Please input employee's ID");
                    String emplID = scanner.nextLine();
                    employeeStorage.searchEmployeeByEmplID(emplID);
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    System.out.println("Please input Company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompany(companyName);
                    break;
                default:
                    System.err.println("Please input correct command!");

            }
        }

    }

    private static void addEmploye() {

        System.out.println("Please input employee's name");
        String name = scanner.nextLine();
        System.out.println("Please input employee's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input employee's ID");
        String ID = scanner.nextLine();
        System.out.println("Please input employee's salary");
        int salary = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please input employee's Company");
        String company = scanner.nextLine();
        System.out.println("Please input employee's position");
        String position = scanner.nextLine();
        Employee employee = new Employee(name, surname, ID, salary, company, position);
        employeeStorage.add(employee);
        System.out.println("Employee added successfully!");

    }

}
