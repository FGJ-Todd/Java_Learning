package FinalExercises.Client;

public class Text {
    public static void main(String[] args) {
        Customer customer1 = new Customer("张三", 20, true);
        Customer customer2 = new Customer("张三", 20, true);
        CustomerBiz list = new CustomerBiz();
        list.addCustomer(customer1);
        list.addCustomer(customer2);
        list.showCustomers();
    }
}
