
public class Program02 
{
	public static void acceptDetailsAndSubmit(String studentName, long rollNo, String schoolRegNo, String schoolName,char gender, String citizenship, String board) {
		Program02 obj=new Program02();
		int math=0;
		int science=0;
		int english=0;
		int ss=0;
		int phyEdu=0;
		if(schoolRegNo.equals("CBCE01-100")&& citizenship.equals("india") && board.equals("CBSE")) {
			math=90;
			science=85;
			english=50;
			ss=90;
			phyEdu=100;
			char grade=obj.calculateGrade(math,science,english,ss,phyEdu);
			 obj.displayDetails(studentName, rollNo, schoolRegNo, schoolName,gender, citizenship, board,math, science, english, ss, phyEdu, grade);
			
		} else{
			System.err.println("Not available");
		}
	}
	public char calculateGrade(int math, int science, int english,int ss, int phyEdu) {
		
		int result=(math+science+english+ss+phyEdu)/5;
		char grade;
		if(result>80&&result<=100) grade='A';
		else if(result>60&&result<=80) grade='B';
		else if(result>40 && result<=60) grade='C';
		else grade='F';
		
		return grade;
	}
	public void displayDetails(String studentName, long rollNo, String schoolRegNo, String schoolName,char gender, String citizenship, String board,int math, int science, int english, int ss, int phyEdu, char grade) {
		System.out.println("Name of the Student:"+studentName);
		System.out.println("Roll No of the Sudent:"+rollNo);
		System.out.println("School Name:"+schoolName);
		System.out.println("Board"+board);
		System.out.println("===========================================================");
		System.out.println("============Subject marks===========");
		System.out.println("math:"+math);
		System.out.println("Science:"+science);
		System.out.println("English:"+english);
		System.out.println("Social Science:"+ss);
		System.out.println("Physical Education:"+phyEdu);
		System.out.println("============================");
		System.out.println("Grade"+grade);
		
		
	}
	public static void main(String[] args) 
	{
		String studentName="Param";
		long rollNo=48675487;
		String schoolRegNo = "CBCE01-100";
		String schoolName="MGM";
		char gender='m';
		String citizenship="india";
		String board="CBSE";
		acceptDetailsAndSubmit( studentName,rollNo,schoolRegNo,schoolName, gender, citizenship, board);
		
		
	}
}
