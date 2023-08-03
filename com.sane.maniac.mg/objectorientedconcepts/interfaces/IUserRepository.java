package com.sane.maniac.mg.objectorientedconcepts.interfaces;

import com.sane.maniac.mg.objectorientedconcepts.models.children.Customer;
import com.sane.maniac.mg.objectorientedconcepts.models.children.Employee;
import com.sane.maniac.mg.objectorientedconcepts.models.parents.User;

import java.util.List;

public interface IUserRepository {
    <T extends User> T addUser(T user);
    Object getUser(int id);
    List<Employee> getAllEmployees();
    List<Customer> getAllCustomers();
    Object updateUser(Object user);
    Employee deleteEmployee(int id);
    Customer deleteCustomer(int id);
}
