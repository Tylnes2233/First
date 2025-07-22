public class QuadraticEquationSolver {

    public double[] solve(int a, int b, int c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return new double[0];
        } else if (discriminant == 0) {
            double x = -b / (2.0 * a);
            return new double[]{x};
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double x1 = (-b + sqrtD) / (2.0 * a);
            double x2 = (-b - sqrtD) / (2.0 * a);
            return x1 > x2 ? new double[]{x1, x2} : new double[]{x2, x1};
        }
    }

    public static void main(String[] args) {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();

        printArray(solver.solve(1, -2, -3));   // [3.0, -1.0]
        printArray(solver.solve(1, 12, 36));   // [-6.0]
        printArray(solver.solve(5, 3, 7));     // []
    }

    private static void printArray(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
