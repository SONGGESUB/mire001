package java_git;

import java.util.Date;

public class StudentVO implements Comparable<StudentVO>{
	
	private String stuNum;
	private String name;
	private String phone;
	private String pwd;
	private int stuLevel;
	private String state;
	private String entDate;
	private String register;
	private Date regdate;
	
	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getStuLevel() {
		return stuLevel;
	}

	public void setStuLevel(int stuLevel) {
		this.stuLevel = stuLevel;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEntDate() {
		return entDate;
	}

	public void setEntDate(String entDate) {
		this.entDate = entDate;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public int compareTo(StudentVO other) {
		return this.name.compareTo(other.getName());
	}

	@Override
	public int hashCode() {
		return this.stuNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof StudentVO) {
			StudentVO other = (StudentVO)obj;
			result = this.stuNum.equals(other.getStuNum());
		}
		return result;
	}

	@Override
	public String toString() {
		return this.stuNum + "," + this.name + "," + this.phone;
	}
	
	
}
