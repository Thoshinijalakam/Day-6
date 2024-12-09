 import java.util.*;
 public class Natural {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] numbers=new int[n];    
        System.out.println("enter a number n");
    for(int i=0;i<n;i++){
        numbers[i]=i+1;
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=numbers[i];
    }
    System.out.println("the sum of the first"+n+"natural numbers is:"+sum);
}
}/* 5
enter a number n
the sum of the first5natural numbers is:15 */
