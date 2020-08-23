package p29MVC;

public class CustomerController {
    private CustomerModel model;
    private CustomerView view;

    public CustomerController(CustomerModel model, CustomerView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name) {
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        model.setName(name);
    }

    public void show() {
        view.showCustomer(model);
    }
}
