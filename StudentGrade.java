import java.util.Scanner;
public class StudentGrade{
    void grade(){
        String name;
        long roll;
        byte python,java,c;
        float percentage;
        short total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        name=sc.nextLine();
        System.out.println("Enter your roll :");
        roll=sc.nextLong();
        System.out.println("Enter  python :");
        python=sc.nextByte();
        System.out.println("Enter  java :");
        java=sc.nextByte();
        System.out.println("Enter C :");
        c=sc.nextByte();
        total=(short)(python+java+c);
        System.out.println("total num :"+total);
        percentage=(total*100)/300;
        if(percentage>90)
        {
            System.out.println("Grade A");
            
        }
        else if(percentage>75)
        {
            System.out.println("Greade B");
        }
       else if(percentage>65)
        {
            System.out.println("Greade C");
        }
        else if(percentage>50)
        {
            System.out.println("Greade D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
        public static void main(String[] args){
            StudentGrade obj = new StudentGrade();
            obj.grade();
        }
        
    
    
}