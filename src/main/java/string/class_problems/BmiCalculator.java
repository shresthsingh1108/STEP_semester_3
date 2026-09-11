package string.class_problems;

public class BmiCalculator {

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        int n = Math.min(heights.length, weights.length);
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-10s | %-12s | %-12s | %-8s | %-12s%n",
                "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            double h = heights[i];
            double w = weights[i];
            double bmi = w / (h * h);
            String status = getBmiStatus(bmi);

            System.out.printf("Person %-3d | %-12.2f | %-12.2f | %-8.2f | %s%n",
                    (i + 1), h, w, bmi, status);
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        double[] sampleHeights = {1.75, 1.60, 1.80, 1.65, 1.70, 1.55, 1.85, 1.68, 1.72, 1.78};
        double[] sampleWeights = {70.0, 90.0, 62.0, 78.0, 68.0, 45.0, 105.0, 58.0, 74.0, 82.0};

        printWellnessReport(sampleHeights, sampleWeights);
    }
}