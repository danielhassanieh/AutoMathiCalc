package automathicalc;

public class Algebra {
    public static double[] quadraticFormula(double a, double b, double c)
    {
        double negAns = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double posAns = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return new double[]{negAns, posAns};
    }
}
