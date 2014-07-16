package inc.john.belajar.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import inc.john.belajar.bean.Customer;
import inc.john.belajar.dao.CustomerDao;

@Repository("customerDao")
public class CustomerDaoImpl extends BaseDaoHibernate<Customer> implements CustomerDao {

	@Override
	public Customer save(Customer customer) {
		return saveBase(customer);
	}

	@Override
	public Customer delete(Customer customer) {
		return deleteBase(customer);
	}

	@Override
	public Customer findById(Long id) {
		return findByIdBase(id);
	}

	@Override
	public List<Customer> findAllData(String search, int start, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findAllData(String search, String orderBy,
			int start, int size) {
		StringBuilder stringBuilderCustomer = new StringBuilder(
                "from Customer c where c.name like :search");

        if (!search.equals("%")) {
            search = "%" + search + "%";
        }

        if (orderBy != null) {
            stringBuilderCustomer.append(" order by name ").append(orderBy);
        }

        return (List<Customer>) sessionFactory.getCurrentSession()
                .createQuery(stringBuilderCustomer.toString())
                .setString("search", search)
                .setFirstResult(start)
                .setMaxResults(size)
                .list();
	}

}
