import java.util.*;

public class ShortestPath {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the directions: ");
        String direction = sc.nextLine();
        System.out.println("Shortest Path: " + ShortestPath(direction) + " unit.");
    }
    public static float ShortestPath(String direction){
        int y = 0;
        int x = 0;
        for(int i=0; i<direction.length(); i++){
            if(direction.charAt(i) == 'N'){
                y++;
            }
            else if(direction.charAt(i) == 'S'){
                y--;
            }
            else if(direction.charAt(i) == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        return (float)Math.sqrt(x*x + y*y);
    }
}
