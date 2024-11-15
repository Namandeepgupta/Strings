public class CharAtMethod{
    public static void main(String args[]){
        String name = new String("Namandeep Gupta");
        System.out.println(name.charAt(5));
        printallLetters(name);
    }
    public static void printallLetters(String name){
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println(" ");
    }
}