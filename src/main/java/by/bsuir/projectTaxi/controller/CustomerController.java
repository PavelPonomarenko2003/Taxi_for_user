package by.bsuir.projectTaxi.controller;

import by.bsuir.projectTaxi.entity.Customer;
import by.bsuir.projectTaxi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/first_view")
    public String showFirstView(){
        return "first_view";
    }

    @RequestMapping("/registration")
    public String registration(Model model){

        model.addAttribute("userAttribute", new Customer());

        return "registration";
    }

    @RequestMapping("/registration_result")
    public String registrationResult(@ModelAttribute("userAttribute") Customer customer){

        return "registration_result";
    }

    @RequestMapping("/all_users")
    public String showAllCustomers(Model model){

        List<Customer> allCustomers = customerService.getAllCustomers();
        model.addAttribute( "allUsersAttribute", allCustomers);

        return "all_users";
    }

    @RequestMapping("/add_new_user")
    public String addNewUser(Model model){

        Customer customer = new Customer();
        model.addAttribute("userAttribute", customer);

        return "registration";
    }

    @RequestMapping("/save_user")
    public String saveUser(@ModelAttribute("userAttribute") Customer customer){

        customerService.saveCustomer(customer);

        return "redirect:/all_users";
    }


}
