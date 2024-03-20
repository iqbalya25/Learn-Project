import java.util.Scanner;
import java.lang.StringBuilder;

public class Inputname {
    public static void main(String[] args) {
        String fullname;

        Scanner InputData = new Scanner(System.in);

        System.out.print("Name: ");
        fullname = InputData.nextLine();

        String[] naming = fullname.split(" ");

        StringBuilder singkatan = new StringBuilder();
        for (String search : naming) {
            if (!search.isEmpty()) {
                singkatan.append(search.charAt(0));
            }
        }

        System.out.println(singkatan);

        }
    }
//
//
//
//
//
//    //char firstchar_infirstname = fullname.charAt(0);
//
//    //System.out.print(firstchar_infirstname);
//    //System.out.println(firstchar_lastname);
//
//
//
//    }
//}
