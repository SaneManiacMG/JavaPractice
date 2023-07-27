package com.sane.maniac.mg.objectorientedconcepts.interfaces;

public interface IUserService {
    void addEmployee();
    void addCustomer();
    void updateUser();
    void deleteUser(int id);
    void getUser(int id);
    void getAllUsers();
}
