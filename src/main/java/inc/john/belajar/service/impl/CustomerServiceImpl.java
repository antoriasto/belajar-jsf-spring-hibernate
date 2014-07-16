package inc.john.belajar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import inc.john.belajar.bean.Customer;
import inc.john.belajar.dao.CustomerDao;
import inc.john.belajar.service.CustomerService;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	@Transactional(readOnly=false)
	public Customer save(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	@Transactional(readOnly=false)
	public Customer delete(Customer customer) {
		return customerDao.delete(customer);
	}

	@Override
	@Transactional(readOnly=true)
	public Customer findById(Long id) {
		return customerDao.findById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Customer> findAllData(String search, int start, int size) {
		return customerDao.findAllData(search, start, size);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Customer> findAllData(String search, 
			String orderBy, int start, int size) {
		return customerDao.findAllData(search, orderBy, start, size);
	}

}
