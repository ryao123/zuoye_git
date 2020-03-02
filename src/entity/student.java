package entity;

public class student {
	
	private int id;//±àºÅ
	private String name;//ĞÕÃû
	private int age;//ÄêÁä
	private int grade;//°à¼¶
	private String address; //µØÖ·
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public student(int id, String name, int age, int grade, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}
	public student() {
		super();
	}
	
	
	
}
