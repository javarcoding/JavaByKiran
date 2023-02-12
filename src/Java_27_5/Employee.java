package Java_27_5;

public class Employee {

	int empID;
	String name;
	String dpName;
	int age;
	String loc;
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", dpName=" + dpName + ", age=" + age + ", loc=" + loc
				+ "]";
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDpName() {
		return dpName;
	}

	public void setDpName(String dpName) {
		this.dpName = dpName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
