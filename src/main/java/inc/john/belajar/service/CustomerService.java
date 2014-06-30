package inc.john.belajar.service;

import java.util.List;

import inc.john.belajar.bean.Customer;

public interface CustomerService {
	Customer save(Customer customer);
	Customer delete(Customer customer);
	Customer findById(Long id);
	List<Customer> findAllData(String search, int start, int size);
}
