import java.util.*;

interface student {
    Scanner sc = new Scanner(System.in);
    int roll = 21, mark = 90;
    String name = "	Dilsha", classname = "MCA";

}
class sports{
    Scanner sc = new Scanner(System.in);
    int marks;
    void get()
    {
        System.out.println("Enter marks out of 20:");
        marks=sc.nextInt();
    }
}

class result extends sports implements student
{
    void displ()
    {
        System.out.println("Details of students are:");
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+roll);
        System.out.println("Class Name:"+classname);
        System.out.println("Academic Mark:"+mark);
        System.out.println("Sports Mark:"+marks);
    }
}
public class studentdet {
    public static void main(String ...a)
    {
        result res = new result();
        res.get();
        res.displ();
    }
}

       
	   OUTPUT
**********************************

Enter marks out of 20:
10
Details of students are:
Name:   Dilsha
Roll number:21
Class Name:MCA
Academic Mark:90
Sports Mark:10 
	   