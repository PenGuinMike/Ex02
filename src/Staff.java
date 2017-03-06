
public class Staff1 {
	String name, jobcontent,dept;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public Staff(String name1,String jobcontent1,String dept1){
		name=name1;
		jobcontent=jobcontent1;
		dept=dept1;
	}
	public void setName(String name2){
		name=name2;		
	}
	public String getName(){return name;
	}	
	public void setjobcontent(String jobcontent2){
		jobcontent=jobcontent2;
	}
	public String getjobcontent(){return jobcontent;
	}	
	public void setDept(String dept2){
		dept=dept2;
	}
	public String getDept(){return dept;
	}
	public void showall(){
		System.out.println("name:         "+this.getName());
		System.out.println("jobcontent:   "+this.getjobcontent());
		System.out.println("department:   "+this.getDept());
		System.out.println("**----------------------------------------**");
	}
}
