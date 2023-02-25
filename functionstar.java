public class star{
public static void main(String[]arg){
int i=1;
int j=1;
int x;

star s=new star();
x=s.p1();
}
int p1()
{
for (int  i= 1; i <= 5; i++)
{
  for(int  j=1;j<=i;j++)
{
System.out.print("*");
 }
  System.out.println("");
}
return 0;
}
}