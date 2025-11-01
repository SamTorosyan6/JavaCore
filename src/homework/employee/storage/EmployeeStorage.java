package homework.employee.storage;

import homework.employee.Commands;
import homework.employee.EmployeeNotFoundException;
import homework.employee.model.Employee;

public class EmployeeStorage implements Commands {

    private int size;
    private Employee[] employees = new Employee[10];

    public void add(Employee employee) {

        boolean employeeFound = false;

        if (size == employees.length) {
            extend();
        }

        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employee.getEmployeeID())) {
                employeeFound = true;
                System.err.println("There is already a employee registered with id: " + employees[i].getEmployeeID());
                System.err.println(employees[i].toString());
            }
        }

        if (!employeeFound) {
            employees[size++] = employee;

        }
    }

    private void extend() {
        Employee[] tmp = new Employee[size + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i].toString());
            }
        } else System.out.println("There are no employees yet!");
    }

    public void searchEmployeeByCompany(String company) throws EmployeeNotFoundException {

        boolean employeeFound = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equalsIgnoreCase(company)) {
                System.out.println(employees[i]);
                employeeFound = true;
            }
        }

        if (!employeeFound) {
            throw new EmployeeNotFoundException("No employees were found for the company name you specified!!!");

        }

    }

    public void searchEmployeeByEmplID(String emplID) throws EmployeeNotFoundException {

        boolean employeeFound = false;

        for (int i = 0; i < size; i++) {
            if (emplID.equals(employees[i].getEmployeeID())) {
                System.out.println(employees[i].toString());
                employeeFound = true;
                break;
            }
        }

        if (!employeeFound) {
            throw new EmployeeNotFoundException("Employee with this '" + emplID + "' id not found, please try again!!!");
        }

    }
}
