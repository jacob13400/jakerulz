import java.io.*;
import java.util.*;

class xcode

{public static void main(String args[])throws IOException

{Scanner sc=new Scanner(System.in);
short t=sc.nextShort();
for(int j=1;j<=2;)
{
  int n=sc.nextInt();
  int ar[]=new int[n];j++;t--;
  
  for(int i=1;i<=n;i++)
    {System.out.println("1 "+i+" "+i+" "+i);
    ar[i-1]=sc.nextInt();
    }
    
  System.out.print("2 ");
  for(int i=0;i<n;i++)
    {System.out.print(ar[i]+" ");}
    System.out.println();
    int r=sc.nextInt();
    }

  for(;t>0;t--)
{
    int n=sc.nextInt();
    int ar[]=new int[n];

    System.out.println("1 "+2+" "+3+" "+4);
    int x=sc.nextInt();
    if(x%2==0)
    ar[0]=x;
    else
    {ar[3]=x;ar[2]=x-1;ar[1]=x-2;ar[0]=x-3;}
    for(int i=1;i<n;i++)
      {ar[i]=ar[i-1]+1;
      }

  System.out.print("2");
  for(int i=0;i<n;i++)
    {System.out.print(" "+ar[i]);}
    System.out.println();
    int r=sc.nextInt();
    }   
  }    
}

