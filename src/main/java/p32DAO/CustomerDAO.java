package p32DAO;

import java.util.List;

public interface CustomerDAO {
    Customer getCustomer(int id);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
}
