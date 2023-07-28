package com.sane.maniac.mg.objectorientedconcepts.services;

import com.sane.maniac.mg.objectorientedconcepts.interfaces.IUserRepository;
import com.sane.maniac.mg.objectorientedconcepts.interfaces.IUserService;
import com.sane.maniac.mg.objectorientedconcepts.models.children.Customer;
import com.sane.maniac.mg.objectorientedconcepts.models.children.Employee;
import com.sane.maniac.mg.objectorientedconcepts.models.parents.User;
import com.sane.maniac.mg.objectorientedconcepts.repositories.UserRepository;

import java.util.Scanner;

public class UserService implements IUserService {
    IUserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addEmployee() {
        User user = getUserInfo();

        System.out.print("Enter employee number:\t");
        int employeeNumber = scanner.nextInt();

        System.out.print("Enter designation:\t");
        String designation = scanner.next();

        System.out.println("\n");

        Employee emp = new Employee(user.getId(), user.getName(), user.getEmail(), user.getPassword(), user.getPhoneNumber(),
                employeeNumber, designation);

        userRepository.addUser(emp);
    }

    @Override
    public void addCustomer() {
        User user = getUserInfo();

        System.out.print("Enter customer id:\t");
        int customerId = scanner.nextInt();

        System.out.print("Enter address:\t");
        String address = scanner.next();

        Customer cus = new Customer(user.getId(), user.getName(), user.getEmail(), user.getPassword(), user.getPhoneNumber(),
                customerId, address);

        System.out.println("\n");

        userRepository.addUser(cus);
    }

    public User getUserInfo() {
        User user = new User();
        System.out.print("\nEnter id number:\t");
        try {
            user.setId(scanner.nextInt());
        } catch (Exception e) {
            System.out.println("Invalid id, please enter int value");
            System.out.println("\n");
            return null;
        }

        System.out.print("Enter name:\t");
        user.setName(scanner.next());

        System.out.print("Enter email:\t");
        user.setEmail(scanner.next());

        System.out.print("Enter password:\t");
        user.setPassword(scanner.next());

        System.out.print("Enter phone number:\t");
        user.setPhoneNumber(scanner.next());

        return user;
    }

    @Override
    public void updateUser() {
        System.out.println("\n");

        User user = getUserInfo();

        Object foundUser = userRepository.getUser(user.getId());

        if (foundUser == null) {
            System.out.println("User not found");
            System.out.println("\n");
        }

        if (foundUser instanceof Employee) {
            System.out.print("Enter employee number:\t");
            ((Employee) foundUser).setEmployeeId(scanner.nextInt());

            System.out.print("Enter designation:\t");
            ((Employee) foundUser).setDesignation(scanner.next());

            System.out.println("\n");

            ((Employee) foundUser).updateUser(user);
        } else if (foundUser instanceof Customer) {
            System.out.print("Enter customer id:\t");
            ((Customer) foundUser).setCustomerId(scanner.nextInt());

            System.out.print("Enter address:\t");
            ((Customer) foundUser).setAddress(scanner.next());

            System.out.println("\n");
            ((Customer) foundUser).updateUser(user);
        }
        userRepository.updateUser(foundUser);
    }

    @Override
    public void deleteUser(int id) {
        System.out.println("Do you want to delete a customer or employee?");
        System.out.println("1. Customer");
        System.out.println("2. Employee");
        System.out.print("Enter your choice:\t");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                userRepository.deleteCustomer(id);
                break;
            case 2:
                userRepository.deleteEmployee(id);
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("\n");
    }

    @Override
    public void getUser(int id) {
        System.out.printf("\nUser with id %d:\t\n", id);
        System.out.println(userRepository.getUser(id));

        System.out.println("\n");
    }

    @Override
    public void getAllUsers() {
        System.out.println("\nEmployees:");
        System.out.println(userRepository.getAllEmployees());

        System.out.println("\nCustomers:");
        System.out.println(userRepository.getAllCustomers());;
    }
}
