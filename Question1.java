import java.util.*;

public class Question1 {
    public static void main(String asgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String str = sc.next();
        System.out.println("Vowels occurred: " + lowerCaseVowel(str));
    }
    public static int lowerCaseVowel(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
}
