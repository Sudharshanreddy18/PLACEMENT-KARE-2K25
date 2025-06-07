public class revbuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Kanna");
        sb.append(" ");
        sb.append("Chinnu");

        System.out.println(sb.reverse());
    }
}
//reverse buffer 2

// public class rev {
//     public static void main(String[] args) {
//         String str = "Kanna Chinnu";
//         string reversed = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed += str.charAt(i);
//         }
//         System.out.println(reversed);
//     }
// }

// method 3 
//public class reversestring { //
    public static void main(String[] args) {
        String str = "Chinmay";
        String reversed = "";        
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }        
        System.out.println("Reversed String : " + reversed);
    }
}
// }

