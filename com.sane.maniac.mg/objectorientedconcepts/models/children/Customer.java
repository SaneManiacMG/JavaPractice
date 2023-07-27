package com.sane.maniac.mg.objectorientedconcepts.models.children;

import com.sane.maniac.mg.objectorientedconcepts.models.parents.User;

public class Customer extends User {

    public Customer(int id, String name, String email, String password, String phoneNumber, int customerId, String address) {
        super(id, name, email, password, phoneNumber);
        this.customerId = customerId;
        this.address = address;
    }

    private int customerId;

    private String address;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }

    @Override
    public void updateUser(User userDetails) {
        super.updateUser(userDetails);

        if (userDetails instanceof Customer) {
            Customer customerDetails = (Customer)userDetails;
            this.setAddress(customerDetails.getAddress());
            this.setCustomerId(customerDetails.getCustomerId());
        }
    }
}
