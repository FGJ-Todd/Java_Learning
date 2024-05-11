package classroom.KeepAPet;

/**
 * 宠物类，狗狗和企鹅的父类。
 */
public abstract class Pet {
	private String name = "无名氏";// 昵称
	private int health = 100;// 健康值
	private int love = 0;// 亲密度
	/**
	 * 无参构造方法。
	 */
	public Pet() {
		this.health = 95;
		System.out.println("执行宠物的无参构造方法。");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setLove(int love) {
		this.love = love;
	}

	/**
	 * 有参构造方法。
	 * @param name  昵称
	 */
	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
	}


	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLove() {
		return love;
	}
	/**
	 * 输出宠物信息。
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + 
				this.name + "，我的健康值是" + this.health 
				+ "，我和主人的亲密程度是" + this.love + "。");
	}
	public abstract void eat();
}
