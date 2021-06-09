import java.util.*;
abstract class publisher
{
    static int pid;
    static String name;
    Scanner sc=new Scanner(System.in);
   publisher()
   {
           System.out.println("Enter publisher details");
           System.out.println("Publiser name:");
           name=sc.next();
       System.out.println("Publiser Id:");
           pid=sc.nextInt();

   }
}
class book extends publisher
{
    String bname;
    int bid;
    Scanner sc=new Scanner(System.in);
    book()
    {
       System.out.println("Book details:");
        System.out.println("Book name");
        bname=sc.next();
        System.out.println("Book Id");
        bid=sc.nextInt();
    }
}
class liter extends book
{
    String chap;
    int chapno;
    Scanner sc=new Scanner(System.in);
    liter()
    {
        System.out.println("Chapter Name:");
        chap=sc.next();
        System.out.println("Chapter number:");
        chapno=sc.nextInt();
    }
}
class fiction extends liter
{
    String topic;
    Scanner sc=new Scanner(System.in);
    fiction()
    {
        System.out.println("Topic");
        topic=sc.next();
    }
    void displ()
    {
        System.out.println("Details are:");
        System.out.println("Publisher Name:"+name);
        System.out.println("Pblisher Id:"+pid);
        System.out.println("Book name:"+bname);
        System.out.println("Book Id:"+bid);
        System.out.println("Chapter:"+chap);
        System.out.println("Chapter Number"+chapno);
        System.out.println("Topic:"+topic);

    }
}
public class hirerchy {
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        fiction tr[]=new fiction[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new fiction();
            tr[i].displ();
        }
    }
}



       OUTPUT
**************************

Enter the limit:
3
Enter publisher details
Publiser name:
manu
Publiser Id:
101
Book details:
Book name
computer
Book Id
111
Chapter Name:
os
Chapter number:
1
Topic
virtualaisation
Details are:
Publisher Name:manu
Pblisher Id:101
Book name:computer
Book Id:111
Chapter:os
Chapter Number1
Topic:virtualaisation
Enter publisher details
Publiser name:
appu
Publiser Id:
102
Book details:
Book name
maths
Book Id
222
Chapter Name:
matices
Chapter number:
2
Topic
scalar matrix
Details are:
Publisher Name:appu
Pblisher Id:102
Book name:maths
Book Id:222
Chapter:matices
Chapter Number2
Topic:scalar
Enter publisher details
Publiser name:
ammu
Publiser Id:
103
Book details:
Book name
chemistry
Book Id
333
Chapter Name:
atom
Chapter number:
3
Topic
atomicity
Details are:
Publisher Name:ammu
Pblisher Id:103
Book name:chemistry
Book Id:333
Chapter:atom
Chapter Number3
Topic:atomicity


