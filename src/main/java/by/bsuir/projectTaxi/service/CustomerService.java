package by.bsuir.projectTaxi.service;

import by.bsuir.projectTaxi.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomers();

    public void saveCustomer(Customer customer);

}
