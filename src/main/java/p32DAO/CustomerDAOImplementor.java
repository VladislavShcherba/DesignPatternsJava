package p32DAO;

import java.util.HashMap;
import java.util.Map;

public class CustomerDAOImplementor implements CustomerDAO {

    private Map<Integer, Customer> customers = new HashMap<Integer, Customer>(){
        {
            put(1, new Customer(1,"Vlad"));
            put(2, new Customer(2,"Anna"));
            put(3, new Customer(3,"Sasha"));
        }
    };

    @Override
    public Customer getCustomer(int id) {
        return customers.get(id);
    }


    @Override
    public void updateCustomer(Customer customer) {
        customers.get(customer.getId()).setName(customer.getName());

    }

    @Override
    public void deleteCustomer(Customer customer) {
        customers.remove(customer.getId());
    }
}
