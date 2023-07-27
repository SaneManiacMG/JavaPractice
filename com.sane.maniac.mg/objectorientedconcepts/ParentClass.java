package com.sane.maniac.mg.objectorientedconcepts;

import com.sane.maniac.mg.objectorientedconcepts.interfaces.IUserService;
import com.sane.maniac.mg.objectorientedconcepts.repositories.UserRepository;
import com.sane.maniac.mg.objectorientedconcepts.services.UserService;

import java.util.Scanner;

public class ParentClass {
    IUserService userService;

    public ParentClass(IUserService userService) {
        this.userService = userService;
    }

    public static void startProcess() {
        ParentClass parentClass = new ParentClass(new UserService(new UserRepository())) {
        };
        while (true) {
            parentClass.selectOptions();
            System.out.println("\n\n");
        }
    }

    public void selectOptions() {
        int option = showOptions();
        if (option == 1) {
            System.out.println("1. Add Employee");
            System.out.println("2. Add Customer");
            System.out.print("Enter option:\t");
            int option2 = new Scanner(System.in).nextInt();
            if (option2 == 1) {
                userService.addEmployee();
            } else if (option2 == 2) {
                userService.addCustomer();
            } else {
                System.out.println("Invalid option");
            }
        } else if (option == 2) {
            userService.updateUser();
        } else if (option == 3) {
            System.out.print("Enter id:\t");
            int id = new Scanner(System.in).nextInt();
            userService.deleteUser(id);
        } else if (option == 4) {
            System.out.print("Enter id:\t");
            int id = new Scanner(System.in).nextInt();
            userService.getUser(id);
        } else if (option == 5) {
            userService.getAllUsers();
        } else if (option == 6) {
            System.exit(0);
        } else {
            System.out.println("Invalid option");
        }
    }

    public static int showOptions() {
        System.out.println("Select an option:");
        System.out.println("1. Add User");
        System.out.println("2. Update User");
        System.out.println("3. Delete User");
        System.out.println("4. Get User");
        System.out.println("5. Get All Users");
        System.out.println("6. Exit");
        System.out.print("Enter option:\t");
        return new Scanner(System.in).nextInt();
    }
}
