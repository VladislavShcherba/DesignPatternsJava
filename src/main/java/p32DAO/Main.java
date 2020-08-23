package p32DAO;

public class Main {
    public static void main(String[] args) {
        CustomerDAO dao = new CustomerDAOImplementor();
        Customer customer = dao.getCustomer(1);
        System.out.println(customer);
        customer.setName("Alla");
        dao.updateCustomer(customer);
        customer = dao.getCustomer(1);
        System.out.println(customer);
    }
}
