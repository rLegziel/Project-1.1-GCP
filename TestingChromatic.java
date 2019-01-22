import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import Jama.*;

public class TestingChromatic   {
    public static int[][] aMatrix;
    public static int chromatic;
    public static int upperB;



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input the filename : ");
        String inputFile = scan.next();

        int[][] adjMat = ChromaticSolver.readCreateMatrix(inputFile);
        aMatrix = adjMat;
        int vertex = adjMat.length;
        int chromaticNum = ChromaticMethods.fromScartchChromatic(adjMat, vertex);
        chromatic = chromaticNum;

        System.out.println("The chromatic number is : " + chromatic);


    }
}
