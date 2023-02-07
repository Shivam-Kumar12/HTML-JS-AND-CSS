import java.util.*;
public class fibb
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int  a[],num=0,n;
a=new int[5];
for(int i=0;i<5;i++)
{
System.out.println("enter the number of elements a["+i+"]:");
a[i]=sc.nextInt();
} 
System.out.println("enter the search value:");
num=sc.nextInt();
for(int i=0;i<5;i++)
{
if(a[i]==num)
{
System.out.println("the element is found:"+a[i]);
}
else
System.out.println("the no is not found:"); 
}
}
}