// import java.util.Scanner;

// public class panagram {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine().toLowerCase();
//         for (char ch = 'a'; ch <= 'z'; ch++) {
//             if (s.indexOf(ch) == -1) {
//                 System.out.println("Not a pangram");
//                 return;
//             }
//         }
//         System.out.println("Pangram");
//     }
// }

import java.util.Scanner;

public class panagram{
    @SuppressWarnings("UnnecessaryContinue")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char namearr[] = name.toUpperCase().toCharArray();
        boolean flag = false;
        int arr[] = new int[26];
        for (int i = 0; i < namearr.length; i++)
        {
            if(namearr[i]>='A'&&namearr[i]<='Z')
            arr[namearr[i]-'A']++;
            else continue;
        }
        int i = 0;
        while (true&&i<26) {
            if(arr[i]==0){
                flag = false;
                break;
            }
            else
            flag = true;
            i++;
        }
        if(flag){
            System.err.println("Panagram");
        }
        else{
            System.err.println("Not a Panagram");
        }
    }
}