/* methodAssignment.java
CSCI 111-900
Last edited by Pat Doyle 11/13/19
 */

import java.util.Scanner;

public class methodAssignment {
    public static void outputInfo(double outputAvg, double outputMax, double outputMin) throws Exception {

        java.io.File testScoresInfo = new java.io.File("testScoresInfo.txt");
        java.io.PrintWriter output = new java.io.PrintWriter(testScoresInfo);


        output.println("Average: " + outputAvg);
        output.println("Highest Score: " + outputMax);
        output.println("Lowest Score: " + outputMin);
        output.close();

        //method prints data to text file
    }
    public static double min(double[] minScores) {

        int i = 0;
        double min = minScores[i];

        for (i = 1; i < minScores.length; i++) {

            if (minScores[i] < min){
                min = minScores[i];}
        }

        return(min);

        //calculates minimum value of array
    }

    public static double max(double[] maxScores) {

        int i = 0;
        double max = maxScores[i];

        for (i = 1; i < maxScores.length; i++) {

            if (maxScores[i] > max) {
                max = maxScores[i];}
        }
        return(max);

        //finds maximum value of array

    }

    public static double average(double[] scores) {

        double sum = 0;
        int i;

        for (i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        double avg = sum / scores.length;
        return(avg);

        //finds average of array values
    }

    public static void readInput(double[] scores) throws Exception {

        java.io.File input = new java.io.File("testScores.txt");
        Scanner scnr = new Scanner(input);
        int i;

        for (i = 0; i < scores.length; i++) {
            scores[i] = scnr.nextDouble();
        }

        //method defines variables, reads data from file, and prints it
    }

    public static void main(String[]lines) throws Exception {

        double[] inputScores = new double[5];
        readInput(inputScores);

        System.out.println("Average: " + average(inputScores));

        System.out.println("High score: " + max(inputScores));

        System.out.println("Low Score: " + min(inputScores));

        outputInfo(average(inputScores), max(inputScores), min(inputScores));

        //calls on different methods. prints values for average, high score, and low score
        //then prints those values to text file


    }
}
