package com.sane.maniac.mg.objectorientedconcepts.repositories;

import com.sane.maniac.mg.objectorientedconcepts.interfaces.IUserRepository;
import com.sane.maniac.mg.objectorientedconcepts.models.children.Customer;
import com.sane.maniac.mg.objectorientedconcepts.models.children.Employee;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    List<Employee> employees = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();

    @Override
    public Employee addUser(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully");
        System.out.println(employees);
        return employee;
    }

    @Override
    public Customer addUser(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added successfully");
        return customer;
    }

    @Override
    public Object getUser(int id) {
        System.out.printf("Searching for user with id %d\n", id);

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.printf("Employee found: %s\n", employee);
                return employee;
            }
        }

        for (Customer customer : customers) {
            if (customer.getId() == id) {
                System.out.printf("Customer found: %s\n", customer);
                return customer;
            }
        }
        System.out.println("User not found");
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @Override
    public Object updateUser(Object user) {
        if (user instanceof Employee) {
            return updateEmployee((Employee) user);
        } else if (user instanceof Customer) {
            return updateCustomer((Customer) user);
        } else {
            System.out.println("User not found");
            return null;
        }
    }

    public Customer updateCustomer(Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            Customer updatedCustomer = customers.get(i);
            if (updatedCustomer.getId() == customer.getId()) {
                customers.set(i, customer);
                System.out.println("Customer updated successfully");
                return customer;
            }
        }
        System.out.println("Customer not found");
        return null;
    }

    public Employee updateEmployee(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            Employee updatedEmployee = employees.get(i);
            if (updatedEmployee.getId() == employee.getId()) {
                employees.set(i, employee);
                System.out.println("Employee updated successfully");
                return employee;
            }
        }
        System.out.println("Employee not found");
        return null;
    }

    @Override
    public Employee deleteEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("Employee deleted successfully");
                return employee;
            }
        }
        System.out.println("Employee not found");
        return null;
    }

    @Override
    public Customer deleteCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                customers.remove(customer);
                System.out.println("Customer deleted successfully");
                return customer;
            }
        }
        System.out.println("Customer not found");
        return null;
    }

    public UserRepository() {
        Employee employee1 = new Employee(1, "John", "john@email.com",
                "password", "1234567890", 1, "Manager");
        employees.add(employee1);
        Employee employee2 = new Employee(2, "Jane", "jane@email.com",
                "password", "1234567890", 2, "Cashier");
        employees.add(employee2);
        Employee employee3 = new Employee(3, "Jack", "jack@email.com",
                "password", "1234567890", 3, "Cleaner");
        employees.add(employee3);

        Customer customer1 = new Customer(4, "John", "john@email.com",
                "password", "1234567890", 1, "123, Main Street");
        customers.add(customer1);
        Customer customer2 = new Customer(5, "Jane", "jane@email.com",
                "password", "1234567890", 2, "456, Main Street");
        customers.add(customer2);
        Customer customer3 = new Customer(6, "Jack", "jack@email.com",
                "password", "1234567890", 3, "789, Main Street");
        customers.add(customer3);
    }

}
