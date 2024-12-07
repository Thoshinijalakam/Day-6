/*    6
1
[1, 0, 0, 0, 0, 0]
2
[1, 2, 0, 0, 0, 0]
3
[1, 2, 3, 0, 0, 0]
4
[1, 2, 3, 4, 0, 0]
5
[1, 2, 3, 4, 5, 0]  */
import java.util.*;
public class Arraydyn {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            System.out.println(Arrays.toString(arr));       
        }
    }
    
}
