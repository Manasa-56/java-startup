import java.util.Scanner;
public class DemoSwitch{
public static void main(String args[])
{
int a=20,b=10;
int choice;
System.out.println("1.add\t2.sub\t3.mul\t4.div\t");
Scanner s=new Scanner(System.in);
choice=s.nextInt();
switch(choice)
{
case 1:System.out.println("Addition is:"+(a+b));
         break;
case 2:System.out.println("Subtraction is:"+(a-b));
         break;
case 3:System.out.println("Multiplication is:"+(a*b));
         break;
case 4:System.out.println("Division is:"+(a/b));
         break;
default:System.out.println("invalid choice");
        break;
        }
        }
        }
