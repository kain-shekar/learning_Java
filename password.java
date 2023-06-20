import java.util.*;
import java.lang.*;

class CreatePassword {
    int choice = 1;
    Scanner sc = new Scanner(System.in);
    String perPassword = new String("shekarkain");
    String tempPassword = new String();
    String newPassword1 = new String();
    String newPassword2 = new String();
    String id = new String();

    public void getPasswordmail() {
        while (choice == 1 && choice == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nENTER YOUR EMAIL ID :");
            id = sc.nextLine();
            getPassword();
            if (perPassword.equals(tempPassword)) {
                System.out.println("\nACCESS GRANTED");
                System.out.println("YOUR EMAIL ID :" + id);
                System.out.println("YOUR PASSWORD :" + perPassword);
                System.out.println(" NAME : K.SHEKAR\n HALL TICKET NO.: 21UE1A0547\n COURSE : C.S.E");
                choice = 0;
                break;
            } else {
                System.out.println("\nACCESS DENIED");
                System.out.println("\nENTER 1-CONTINUE and 0-FORGOT PASSWORD");
                choice = sc.nextInt();
                if (choice == 0)
                    changePassword();
            }
        }
    }

    public void getPassword() {

        System.out.println("\nENTER YOUR PASSWORD :");
        tempPassword = sc.nextLine();

    }

    public void changePassword() {
        System.out.println("\nENTER NEW PASSWORD");
        newPassword1 = sc.nextLine();

        System.out.println("\nENTER  PASSWORD AGAIN");
        newPassword2 = sc.nextLine();
        if (newPassword1.equals(newPassword2)) {
            perPassword = newPassword1;
            System.out.println("\nNEW PASSWORD GENERATED SUCCESSFULLY");
            choice = 1;
            getPasswordmail();
        } else {
            System.out.println("\nPASSWORD DID NOT MATCH");
            System.out.println("\n TRY AGAIN");
            changePassword();
        }

    }
}

class password {
    public static void main(String argue[]) {
        CreatePassword p1 = new CreatePassword();
        p1.getPasswordmail();

    }

}
