    import java.io.*;
    import java.util.*;
    import java.lang.*;
    
    class Sol {
    
    public static void main(String[] args)throws IOException {
          Scanner sc=new Scanner(System.in);
          
          int t=sc.nextInt();
          for(;t>0;t--)
             {int n=sc.nextInt();
              String s=sc.next();
              int cp=0,ca=0;
              if(s.charAt(0)=='P')
                cp++;
              if(n>1 && s.charAt(1)=='P')
                cp++;
              if(n>2 && s.charAt(n-1)=='P')
                cp++;
              if(n>3 && s.charAt(n-2)=='P')
                cp++;
              
              for(int i =2;i<n-2;i++){
                char c=s.charAt(i);
                if(c=='P')
                    cp++;
                else if((s.charAt(i-1)=='P' || s.charAt(i-2)=='P') &&( s.charAt(i+1)=='P' || s.charAt(i+2)=='P'))
                    ca++;
                    
                }
              //System.out.println(cp+"LOL"+ca);
              double need=0.75*n;
              need=Math.ceil(need);
              if(need-cp>ca)
                System.out.println("-1");
              else if(need -cp <=0)
                System.out.println("0");
              else
                System.out.println((int)(need-cp));
            }
    }
}
 
