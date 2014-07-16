package inc.john.belajar.controller;

import inc.john.belajar.bean.Customer;
import inc.john.belajar.service.CustomerService;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
//@Scope("view")
public class CustomerController implements Serializable {

	private static final long serialVersionUID = -8496534031668219091L;
	
	@Autowired
	CustomerService customerService;
	
	private Customer customer = new Customer(1L, "John");
	
	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void save(Customer customer) {
		customerService.save(customer);
	}
	
	
}
