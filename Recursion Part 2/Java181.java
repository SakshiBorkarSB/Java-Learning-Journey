// Friends Pairing Problem

public class Java181 {
    public static int FriendsPairing(int n){
        // Base Case
        if(n == 1 || n == 2){
            return n;
        }

        // choice - single
        int fnm1 = FriendsPairing(n - 1);

        // choice - pair
        int fnm2 = FriendsPairing(n - 2);
        int ways = (n - 1) * fnm2;

        // total ways
        int totalways = fnm1 + ways;

        return totalways;

        // return FriendsPairing(n - 1) + (n - 1) * FriendsPairing(n - 2);
    }
    public static void main(String args[]){
        System.out.println(FriendsPairing(3));
    }
}
