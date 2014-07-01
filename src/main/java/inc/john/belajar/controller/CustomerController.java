package inc.john.belajar.controller;

import inc.john.belajar.service.CustomerService;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerController implements Serializable {

	private static final long serialVersionUID = -8496534031668219091L;
	
	@Autowired
	CustomerService customerService;
	
	
	
	
}
