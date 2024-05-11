package classroom.KeepAPet;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Master master = new Master();
		Scanner in = new Scanner(System.in);
		System.out.print("你想领养的宠物(1.小狗 2.企鹅 3.小猫):");
		int type = in.nextInt();
		Pet pet = master.adopt(type);
//		master.feed(pet);
		master.play(pet);

//		Pet dog = new Dog("欧欧", 60, 60, "金毛");
//		Pet pgn = new Penguin("楠楠", 60, 60, "公");
//		Pet cat = new Cat("咪咪", 100, 60, "橘猫");
//		master.feed(dog);
//		master.feed(pgn);
//		master.feed(cat);
	}
}
