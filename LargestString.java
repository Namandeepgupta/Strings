public class LargestString {
    public static void main(String args[]){
        String fruits[] = { "apple","Apple","banana","MANGO"};
        System.out.println(LargestString1(fruits));
        System.out.println(LargestString2(fruits));
    }
    public static String LargestString1(String fruits[]){
        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        return largest;
    }
    public static String LargestString2(String fruits[]){
        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        return largest;
    }
}
