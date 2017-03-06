public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher data []= new Teacher[3];
		data[0]=new Teacher("penguin","1234");
		data[1]=new Teacher("mike","2345");
		data[2]=new Teacher("jack","3456");
		data[0].setGender("man");
		data[1].setGender("man");
		data[2].setGender("man");
		data[0].setResearch("programe");
		data[1].setResearch("programe");
		data[2].setResearch("programe");
		for(int i=0;i<3;i++){
			data[i].showInfo();
		}
		//-------------------------------------\\
		Student data1[]=new Student[3];
		data1[0]=new Student("penguin","1234");
		data1[1]=new Student("mike","2345");
		data1[2]=new Student("jack","3456");
		data1[0].setGender("women");
		data1[1].setGender("women");
		data1[2].setGender("women");
		for(int i=0;i<3;i++){
			data1[i].showInfo();
		}
		//-------------------------------------\\
		Staff data2[]=new Staff[3];
		data2[0]=new Staff("penguin","programmer","teacher");
		data2[1]=new Staff("mike","programmer","teacher");
		data2[2]=new Staff("jack","programmer","teacher");
		for(int i=0;i<3;i++){
			data2[i].showall();;
		}
	}

}
class Teacher{
	private String name,id,gender,research;
	public Teacher(String name1,String id1){
		name = name1; id = id1;
	}
	public void setName(String name2){
		name = name2;
	}
	public void setId(String id2){
		id = id2;
	}
	public void setGender(String gender2){
		gender=gender2;
	}
	public void setResearch(String research2){
		research=research2;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public String getGender(){
		return gender;
	}
	public String getResearch(){
		return research;
	}
	public void showInfo(){
		System.out.println("name  : "+this.getName());
		System.out.println("id    : "+this.getId());
		System.out.println("gender: "+this.getGender());
		System.out.println("research: "+this.getResearch());
		System.out.println("--------------------------------");
	}
	
}
//--------------------------------------------------------------------
class Student{
	private String name , id , gender;
	public Student(String name1 , String id1){
		name = name1 ; id = id1 ;
	}
	public void setName(String name2){
		name = name2;
	}
	public void setId(String id2){
		id = id2;
	}
	public void setGender(String gender2){
		gender = gender2;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public String getGender(){
		return gender;
	}
	public void showInfo(){
		System.out.println("name  : "+this.getName());
		System.out.println("id    : "+this.getId());
		System.out.println("gender: "+this.getGender());
		System.out.println("||--------------------------------||");
	}
	
}
//-----------------------------------------------------------------------
class Staff{
	private String name, jobcontent,dept;
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