package FinalExercises.Client;

import java.util.ArrayList;

public class CustomerBiz{
    private ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer cust)
    {
        this.customers.add(cust);
    }

    public void showCustomers()
    {
        for (Customer cust : customers){
            System.out.println("客户信息：");
            System.out.println(cust.getName() + "\t" + cust.getAge() + "\t" + cust.isVIP());
        }
    }
}
