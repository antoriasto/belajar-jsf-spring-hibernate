package inc.john.belajar.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import inc.john.belajar.bean.Customer;
import inc.john.belajar.dao.CustomerDao;

@Repository("customerDao")
public class CustomerDaoImpl extends BaseDaoHibernate<Customer> implements CustomerDao {

	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer delete(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAllData(String search, int start, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
