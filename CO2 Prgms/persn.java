
import java.util.Scanner;
class person{
    Scanner sc=new Scanner(System.in);
    String gend,addres,name;
    int age;
    person()
    {
        System.out.println("Person Details:");
        System.out.println("Name:");
        name=sc.next();
        System.out.println("Address:");
        addres=sc.next();
        System.out.println("Gender:");
        gend=sc.next();
        System.out.println("Age:");
        age= sc.nextInt();
    }
}

class emplye extends person{
    int emplid,salry;
    String cmpny_name,qualification;
    Scanner sc=new Scanner(System.in);
    emplye()
    {
        System.out.println("Empolyee Details");
        System.out.println("Company Name:");
        cmpny_name=sc.next();
        System.out.println("Employee ID:");
        emplid=sc.nextInt();
        System.out.println("Qualification:");
        qualification=sc.next();
        System.out.println("Salary:");
        salry=sc.nextInt();
    }
}
class Teacher extends emplye{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    int techrID;
    tcher(){
        System.out.println("Teacher Details:");
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
        System.out.println("Teahcer ID:");
        techrID= sc.nextInt();
    }
    void disp()
    {
        System.out.println("Details are:");
        System.out.println("name:"+name);
        System.out.println("gend:"+gend);
        System.out.println("age:"+age);
        System.out.println("cmpny_name:"+cmpny_name);
        System.out.println("emplid:"+emplid);
        System.out.println("qualification:"+qualification);
        System.out.println("techrID:"+techrID);
        System.out.println("addres:"+addres);
        System.out.println("subj:"+subj);
        System.out.println("dept:"+dept);
        System.out.println("salry:"+salry);
    }
}
public class persn {
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        tcher tr[]=new tcher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new tcher();
            tr[i].disp();
        }
    }
}





       OUTPUT
***************************

Enter the limit:
3
Person Details:
Name:
anu
Address:
pathari
Gender:
female
Age:
22
Empolyee Details
Company Name:
tcs
Employee ID:
101
Qualification:
MCA
Salary:
15000
Teacher Details:
Department name:
MCA
Subject:
networking
Teahcer ID:
111
Details are:
name:anu
gend:female
age:22
cmpny_name:tcs
emplid:101
qualification:MCA
techrID:111
addres:pathari
subj:networking
dept:MCA
salry:15000
Person Details:
Name:
manu
Address:
pacheri
Gender:
male
Age:
25
Empolyee Details
Company Name:
infosis
Employee ID:
102
Qualification:
BCA
Salary:
18000
Teacher Details:
Department name:
BCA
Subject:
python
Teahcer ID:
222
Details are:
name:manu
gend:male
age:25
cmpny_name:infosis
emplid:102
qualification:BCA
techrID:222
addres:pacheri
subj:python
dept:BCA
salry:18000
Person Details:
Name:
dinu
Address:
kolangara
Gender:
female
Age:
23
Empolyee Details
Company Name:
oracle
Employee ID:
103
Qualification:
MBA
Salary:
20000
Teacher Details:
Department name:
MBA
Subject:
management
Teahcer ID:
333
Details are:
name:dinu
gend:female
age:23
cmpny_name:oracle
emplid:103
qualification:MBA
techrID:333
addres:kolangara
subj:management
dept:MBA
salry:20000












