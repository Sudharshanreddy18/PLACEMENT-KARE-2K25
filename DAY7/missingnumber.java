import java.util.*;
public class missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number of element :");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the  element :");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
        if(a[i+1]==a[i]+1) { 
            continue;
        } else {
            System.out.println("missing number is : " + (a[i]+1));
            break;
        }
}


    }

    
}