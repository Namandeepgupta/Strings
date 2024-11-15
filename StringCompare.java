public class StringCompare {
    public static void main(String args[]){
        String s1 = "naman";
        String s2 = "naman";
        String s3 = new String("naman");

        if(s1 == s2){
            System.out.println("Equal.");
        }
        else{
            System.out.println("Not Equal.");
        }
        if(s1 == s3){
            System.out.println("Equal.");
        }
        else{
            System.out.println("Not Equal.");
        }if(s1.equals(s3)){
            System.out.println("Equal.");
        }
        else{
            System.out.println("Not Equal.");
        }
    }
}
