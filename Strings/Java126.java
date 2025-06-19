// Shortest Path - Given a route containing 4 directions (E, W, N, S), find the shortest path to reach the destination


public class Java126 {
    public static float ShortestPath(String path){
        int x = 0;
        int y = 0;

        for(int i = 0; i < path.length(); i++){
            char direction = path.charAt(i);

            // South
            if(direction == 'S'){
                y--;
            }

            // North
            else if(direction == 'N'){
                y++;
            }

            // West
            else if(direction == 'W'){
                x--;
            }

            // East
            else{
                x++;
            }
        }
        
        // X2 = (x2 - x1) ^ 2 where X2 is X^2      
        int X2 = x * x;
        int Y2 = y * y;
        // Math returns double jise hum float me type cast kr rahe hai
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";

        System.out.println(ShortestPath(path));
    }
}
