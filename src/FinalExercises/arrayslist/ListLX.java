package FinalExercises.arrayslist;

import java.util.ArrayList;

public class ListLX {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");


        for(int i = 0; i < list.size(); i++){
            if (list.get(i).equals("二丫")){
                list.set(i, "王小丫");
            }
        }
        System.out.println(list);
    }
}
