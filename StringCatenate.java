import java.util.*;

public class StringCatenate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstname = sc.next();
        System.out.print("Enter the last name: ");
        String lastname = sc.next();
        String fulname = firstname +" "+ lastname;
        System.out.println(fulname + " is bad.");
    }
}
