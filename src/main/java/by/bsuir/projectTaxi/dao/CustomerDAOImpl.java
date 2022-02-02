package by.bsuir.projectTaxi.dao;

import by.bsuir.projectTaxi.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getAllCustomers() {

        Session session = sessionFactory.getCurrentSession();
        List<Customer> allCustomers = session.createQuery("from Customer ", Customer.class).getResultList();

        return allCustomers;
    }

    @Override
    public void saveUser(Customer customer) {

        Session session = sessionFactory.getCurrentSession();
        session.save(customer);

    }


}