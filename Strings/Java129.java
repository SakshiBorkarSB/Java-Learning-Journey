// Print largest string

public class Java129 {
    public static void main(String args[]){
        String favs[] = {"Gojo", "Levi", "Dazai"};

        String largest = favs[0];
        for(int i = 0; i < favs.length; i++){
            if(largest.compareTo(favs[i]) < 0){
                largest = favs[i];
            }
        }

        System.out.println(largest);
    }
}
