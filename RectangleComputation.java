public class RectangleComputation {
    public static void main(String[] args) {
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);

        double area = height * width;
        double perimeter = 2 * (height + width);

        boolean isSquare = Math.abs(height - width)/width < 0.001;
        String shape = isSquare ? "square" : "rectangle";

        System.out.println("shape: " + shape);
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
    }
}
