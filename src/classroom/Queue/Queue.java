package classroom.Queue;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Object> list1;

    {
        list1 = new LinkedList<>();
    }

    public LinkedList<Object> getList1() {
        return list1;
    }

    public void setList1(LinkedList<Object> list1) {
        this.list1 = list1;
    }

    public void add(Object obj){
        list1.addFirst(obj);
    }

    public Object get(){
        return list1.removeLast();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        System.out.println(queue.getList1());
        System.out.println(queue.get());
        System.out.println(queue.getList1());
    }
}
