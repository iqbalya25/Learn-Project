
public class Diameter {
    public static void main(String[] args) {
        //Diameter
        double phi = Math.PI;
        int radius = 5;
        int diameter = 2 * radius;
        double circumference = 2 * phi * radius;
        double area = phi * radius * radius;

        String format_circumference = String.format("%.5f", circumference);
        String format_area = String.format("%.5f", area);

        System.out.println(diameter);
        System.out.println(format_circumference);
        System.out.println(format_area);

    }
}
