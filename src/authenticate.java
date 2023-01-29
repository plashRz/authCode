import java.util.Scanner;

public class authenticate {

    //////DATA PART
    final String[] users = {"user1@user.com","user2@user.com","user3@user.com",
            "user4@user.com","user5@user.com"};
    final String[] pass = {"pass1","pass2","pass3",
            "pass4","pass5"};
    //////

    public static void main(String[] args) {

        //Declare and initializations
        authenticate auth = new authenticate();
        Scanner scan = new Scanner(System.in);
        String uName,pWord;


        //Input from user
        System.out.println("=========================");
        System.out.println("Enter username:");
        uName= scan.nextLine();
        System.out.println("Enter password:");
        pWord= scan.nextLine();

        //Comparison
        int flag = auth.authenticateCreds(uName,pWord);

        //flag comparison for print instead of printing multiple times
        if(flag==1) {
            System.out.println("Welcome " + uName.substring(0,5) + " to the jungle");
        } else {
            System.out.println("invalid username or password");
        }

    }

    //Comparison Method
    public int authenticateCreds(String user, String pass){
        int x=0,flag=0;
        while (x<this.users.length){
            // if input username is equal to username or password we have stored.
            if(this.users[x].equals(user) && this.pass[x].equals(pass)){
                flag=1;
                break;
            }
            //increasing count so that we are not stuck in infinite loop.
            x++;
        }
        return flag;
    }
}
