package inc.john.belajar.dao;

import inc.john.belajar.bean.Customer;

import java.util.List;

public interface CustomerDao {
	Customer save(Customer customer);
	Customer delete(Customer customer);
	Customer findById(Long id);
	List<Customer> findAllData(String search, int start, int size);
}
