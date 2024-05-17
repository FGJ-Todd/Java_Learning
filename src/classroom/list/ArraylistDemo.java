package classroom.list;

import classroom.KeepAPet.Dog;
import classroom.KeepAPet.Penguin;
import classroom.KeepAPet.Pet;

import java.util.*;

public class ArraylistDemo {
    public static void main(String[] args) {
        Pet dongdong = new Dog("dongdong", 100, 100, "拉布拉多");
        Pet jinmao = new Dog("jinmao", 100, 100, "金毛");
        Pet jinmao1 = new Dog("jinmao1", 100, 100, "金毛");
        Pet dongdong1 = new Dog("dongdong1", 100, 100, "拉布拉多");
        List<Pet> dog = new ArrayList<>();
        dog.add(dongdong);
        dog.add(dongdong1);
        dog.add(jinmao);
        dog.add(jinmao1);
        dog.remove(1);
        if (dog.contains(dongdong)) {
            System.out.println("找到了dongdong");
        } else {
            System.out.println("没找到dongdong");
        }

        for (int i = 0; i < dog.size(); i++) {
            Dog d = (Dog) dog.get(i);
            System.out.println(d.getName());
        }

        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.remove();
        System.out.println(list);

        Map<String, String> list1 = new HashMap<>();
        list1.put("1", "第一");
        list1.put("2", "第二");
        list1.put("3", "第三");
        list1.get("1");
        list1.remove("1");
        System.out.println(list1.size() + " ---- " + list1.get("2"));
        System.out.println(list1.keySet());
        System.out.println(list1.values());
        list1.clear();
        System.out.println(list1);

        Map<String, Dog> dogs = new HashMap<>();
        Dog dog1 = new Dog("旺财", "田园犬");
        Dog dog2 = new Dog("小黄", "田园犬");
        Dog dog3 = new Dog("鸡毛", "金毛");
        dogs.put(dog1.getName(), dog1);
        dogs.put(dog2.getName(), dog2);
        dogs.put(dog3.getName(), dog3);

        for (Dog d : dogs.values()){
            System.out.println(d.getName()+"的品种是："+d.getStrain());
        }

        System.out.println();

        Penguin qq = new Penguin(1, "qq", "公");
        Penguin xq = new Penguin(2, "小球", "母");
        Map<String, Penguin> penguins = new HashMap<>();
        penguins.put(qq.getName(), qq);
        penguins.put(xq.getName(), xq);
        Set<String> keys = penguins.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            Penguin p = penguins.get(key);
            System.out.println(p.getName()+"的性别是："+p.getSex());
        }

        Integer num = new Integer(12);

        System.out.println(num);
//        Scanner in = new Scanner(System.in);
//        System.out.print("请输入要查询的宠物名字：");
//        String name = in.next();
//        Dog d = dogs.get(name);
//        System.out.println(d);


    }

}
