package bean;

public class AddBean {
	private int id;
	private String name;
	private int age;
	private String major;
	private String year;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "AddBean [id=" + id + ", name=" + name + ", age=" + age + ", major=" + major + ", year=" + year + "]";
	}
	public AddBean(int id, String name, int age, String major, String year) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.major = major;
		this.year = year;
	}
	public AddBean() {
		super();
	}
 
}
