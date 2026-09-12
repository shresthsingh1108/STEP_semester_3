package arrays.class_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Candidate implements Comparable<Candidate> {
    String name;
    double cgpa;
    int codingScore;
    double compositeScore;

    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
        this.compositeScore = (cgpa * 10.0) + (codingScore / 2.0);
    }

    public static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    public static boolean isEligible(double cgpa, int codingScore) {
        return isEligible(cgpa) || (cgpa >= 6.5 && codingScore >= 60);
    }

    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.compositeScore, this.compositeScore);
    }

    public static String shortlistAndRank(Candidate[] candidates) {
        List<Candidate> eligibleList = new ArrayList<>();
        for (Candidate c : candidates) {
            if (isEligible(c.cgpa, c.codingScore)) {
                eligibleList.add(c);
            }
        }

        Candidate[] draftable = eligibleList.toArray(new Candidate[0]);
        Arrays.sort(draftable);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < draftable.length; i++) {
            sb.append(String.format("%d. %s (%.1f)", (i + 1), draftable[i].name, draftable[i].compositeScore));
            if (i < draftable.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Candidate[] list = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(list));
    }
}