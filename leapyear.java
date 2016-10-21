import java.io.*;
import java.util.*;
class leapyear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int year;
System.out.println("Enter year:");
year=sc.nextInt();
if(year>=0&&year%4==0)
System.out.println(year+" is Leap year");
else if(year<0)
System.out.println("Invalid data");
else
System.out.println(year+" is not leap year");
}
}
