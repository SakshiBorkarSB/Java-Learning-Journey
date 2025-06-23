// Access Modifiers

public class Java151 {
    public static void main(String args[]){
        BankAcc myAcc = new BankAcc();
        myAcc.Username = "Sakshi"; /// If we try to do a similar thing for password, it is not possible because password is private
        /// Instead try this 
        myAcc.setPassword("Sakshi@123");
        // we can't access password using myAcc.Password. We will only be able to chnage it not see it cause password is private and cannot be accessed here
    }
}

class BankAcc{
    public String Username;
    private String Password;

    public void setPassword(String pwd){
        Password = pwd;   /// This is possible cause password is private and can be accessed within the class
    }
}
