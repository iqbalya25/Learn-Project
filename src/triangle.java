import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        //Triangle
        int angle_1, angle_2;

        Scanner InputData= new Scanner(System.in);

        System.out.print("angle_1: ");
        angle_1 = InputData.nextInt();

        System.out.print("angle_2: ");
        angle_2 = InputData.nextInt();

        int angle_3 = 180 - angle_1 - angle_2;
        System.out.println(angle_3);
    }
}
