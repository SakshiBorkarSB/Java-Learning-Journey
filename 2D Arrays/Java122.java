/*
    Print out the sum of the numbers in the second row of the nums array.
    Example :
    Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    Output - 18
*/

public class Java122 {
    // public static int secondRowSum(int nums[][]){
    //     int sum = 0;
        
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = 0; j < nums[0].length; j++){
    //             if(i == 1){
    //                 sum += nums[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }

    public static int RowSum(int nums[][]){
        int sum = 0;

        for(int j = 0; j < nums[0].length; j++){
            sum += nums[1][j];
        }
        return sum;
    }

    public static void main(String args[]){
        int nums[][] = { {1, 4, 9},{11, 4, 3},{2, 2, 3} };

        System.out.println(RowSum(nums));
    }
}
