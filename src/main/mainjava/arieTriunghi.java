package mainjava;

public class arieTriunghi {
    public static double calculArie(double a, double b, double c) {
        // Validare input
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Laturile trebuie să fie pozitive");
        }

        // Validare condiție triunghi
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Laturile nu formează un triunghi valid");
        }

        // Calcul arie cu formula lui Heron
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}