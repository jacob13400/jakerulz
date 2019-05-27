import java.util.*;
import java.lang.*;
 
class Sequence
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        int n1, n2;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        short[] arr1 = new short[n1];
        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextShort();
        }
        n2 = input.nextInt();
        short[] arr2 = new short[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextShort();
        }
        boolean ada=false;
        for (int x = 0; x < arr1.length; x++) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[x] == arr2[i]) {
                    ada = true;
                    break;
                } else {
                    ada = false;
                }
            }
            if (ada == false) {
                System.out.print(arr1[x] + " ");
            }
        }
        input.close();
    
	}
}  
