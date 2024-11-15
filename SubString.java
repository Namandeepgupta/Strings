public class SubString {
    public static void main(String args[]){
        String name = new String ("namandeep");
        System.out.println(SubString(name));
        System.out.println(InbultSubString(name));
    }
    public static String SubString(String name){
        int si = 1;
        int ei = 5;
        String substring = "";
        for(int i=si; i<ei; i++){
            substring += name.charAt(i);
        }
        return substring;
    }
    public static String InbultSubString(String name){
        int si = 5;
        int ei = 9;
        String subString = name.substring(si, ei);
        return subString;
    }
}