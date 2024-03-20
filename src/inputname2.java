import java.util.Scanner;
public class inputname2 {
    public static void main(String[] args) {
        String firstname, lastname;

        Scanner InputData= new Scanner(System.in);

        System.out.print("Firstname: ");
        firstname = InputData.nextLine();

        System.out.print("lastname: ");
        lastname = InputData.nextLine();

        System.out.println(firstname + " " + lastname);

        System.out.print(firstname.charAt(0));
        System.out.print(lastname.charAt(0));
    }
}
