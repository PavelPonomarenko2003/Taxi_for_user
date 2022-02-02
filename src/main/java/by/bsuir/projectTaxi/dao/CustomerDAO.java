package by.bsuir.projectTaxi.dao;

import by.bsuir.projectTaxi.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getAllCustomers();

    public void saveUser(Customer customer);

}
