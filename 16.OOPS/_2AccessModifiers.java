
public class _2AccessModifiers {
    public static void main(String[] args){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Amit Birajdar";
        System.out.println(myAcc.username);

        // Not accessable 
        // myAcc.password = "abcdefghi";
        // System.out.println(myAcc.password);

        myAcc.setPassword("abcdefg");
        // System.out.println(myAcc.password);



    }    
}

class BankAccount{
    public String username;
   private String password;
   void setPassword(String pwd){
    password = pwd;
   }



}
