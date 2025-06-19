/* 
   Print the number of 7’s that are in the 2d array.
   Example :
   Input - int[][] array = { {4,7,8},{8,8,7} };
   Output - 2
*/ 

public class Java121 {
    public static int countseven(int arr[][]){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 7){
                    count ++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[][] = { {4, 7, 8},{8, 8, 7} };

        System.out.println(countseven(arr));
    }
}
