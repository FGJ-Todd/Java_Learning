package classroom.KeepAPet;
/**
 * 企鹅类，宠物的子类。
 */
public class Penguin extends Pet {
	private int id;
	private String sex;// 性别
	/**
	 * 有参构造方法。
     */
	Penguin(){}

	public Penguin(int id, String name, String sex){
		super(name);
		this.sex = sex;
		this.id = id;
	}

	public Penguin(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
	
	public void print(){
		super.print();
		System.out.println("我的性别是"+this.getSex()+"。");
	}

	public void swimming(){
		System.out.println("企鹅"+this.getName()+"正在接飞盘");
		this.setHealth(this.getHealth()-10);
		this.setLove(this.getLove()+5);
	}

	@Override
	public void eat() {
		if (this.getHealth() >= 100) {
			System.out.println("企鹅 "+this.getName()+",吃饱了，不用投喂了");
		}else {
			this.setHealth(this.getHealth()+5);
			System.out.println("企鹅 "+this.getName()+",健康值+5");
		}
	}

	@Override
	public String toString() {
		return "Penguin{" +
				"id=" + id +
				", name=" + super.getName() +
				", sex='" + sex + '\'' +
				'}';
	}
}
