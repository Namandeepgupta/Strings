import java.util.*;

public class StringPalindrom {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Word to check palindrom: ");
        String name = sc.nextLine();
        System.out.println("Result: " + palindrom(name));
    }
    public static boolean palindrom(String name){
        int n = name.length();
        for(int i=0; i<n/2; i++){
            char p = name.charAt(i);
            char q = name.charAt(n-1-i);
            if(p != q){
                return false;
            }
        }
        return true;
    }
}
