import java.util.Arrays;
import java.util.Scanner;

public class TestingChromatic {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please input the filename : ");
    String inputFile = scan.next();

    int[][] adjMat = ChromaticSolver.readCreateMatrix(inputFile);
    int vertex = adjMat.length;

    int chromaticNum = ChromaticMethods.fromScartchChromatic(adjMat,vertex);

    int clSize = findClicque.findClique(adjMat);

    int chromaticSatu = ChromaticMethods.chromaticSaturation(adjMat);

    int randomSaturation = ChromaticMethods.randomSaturationChromatic(adjMat);

    int passSatu = PASS.PASSchromaticSaturation(adjMat);
    int randomPass = PASS.randomPASS(adjMat);
    int[] vertexOrdering = findClicque.vertexOrdering(adjMat);
    int[] degreesOrdering = findClicque.degreesOrdering(adjMat,vertexOrdering);


    System.out.println("The chromatic number is : " + chromaticNum);
//    System.out.println("The Clique size is  : " + clSize);
    System.out.println("The chromatic (using saturation) number is : " + chromaticSatu);
    System.out.println("The chromatic (using random saturation) number is : " + randomSaturation);
    System.out.println("The chromatic (using PASS) number is : " + passSatu);
    System.out.println("The chromatic (using random PASS) number is : " + randomPass);
    System.out.println(Arrays.toString(degreesOrdering));
    System.out.println(Arrays.toString(vertexOrdering));

	}
}
