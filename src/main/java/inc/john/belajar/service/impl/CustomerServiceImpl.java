package inc.john.belajar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import inc.john.belajar.bean.Customer;
import inc.john.belajar.dao.CustomerDao;
import inc.john.belajar.service.CustomerService;

@Transactional
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Customer save(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public Customer delete(Customer customer) {
		return customerDao.delete(customer);
	}

	@Override
	public Customer findById(Long id) {
		return customerDao.findById(id);
	}

	@Override
	public List<Customer> findAllData(String search, int start, int size) {
		return customerDao.findAllData(search, start, size);
	}

}
