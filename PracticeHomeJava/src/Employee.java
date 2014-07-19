
public class Employee implements Comparable<Employee>{

	int id;
	String fname;
	String lname;
	int age;
	int salary;
	String title;
	
	public Employee()
	{}
	public Employee(int i,String f,String l,int a,int s,String t)
	{
		id=i;
		fname=f;
		lname=l;
		age=a;
		salary=s;
		title=t;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + fname + " " + lname + " " + age + " " + salary + " " + title;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (id < o.id)?-1:(id > o.id)?1:0;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
