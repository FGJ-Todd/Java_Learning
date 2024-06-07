package FinalExercises.Client;

import java.util.ArrayList;

public class CustomerBiz extends Customer{
    private ArrayList<Customer> customers;

    public CustomerBiz(String name, int age, boolean VIP) {
        super(name, age, VIP);
    }

    public void addCustomer(Customer cust)
    {
        customers.add(cust);
    }

    public void showCustomers()
    {
        for (Customer cust : customers){
            System.out.println("客户信息：");
            System.out.println(cust.getName() + "\t" + cust.getAge() + "\t" + cust.isVIP());
        }
    }
}
