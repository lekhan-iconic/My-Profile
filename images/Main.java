import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=(a+b)*2;
  int d=a*b;
  System.out.println("Required length is " +c+ "m");
  System.out.println("Required quantity of carpet is "+d+ "sqm");
}
}