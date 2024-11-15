import java.util.*;

public class Question4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = sc.next();
        System.out.print("Enter second String: ");
        String str2 = sc.next();
        System.out.println("Strings are Anagram: " + stringAnagram(str1,str2));
    }
    public static boolean stringAnagram(String str1, String str2){
        
        str1.toLowerCase();
        str2.toLowerCase();

        if(str1.length() == str2.length()){
            char str1array[] = str1.toCharArray();
            Arrays.sort(str1array);
            char str2array[] = str2.toCharArray();
            Arrays.sort(str2array);

            if(Arrays.equals(str1array,str2array)){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
