import Jama.EigenvalueDecomposition;
import Jama.Matrix;

import java.util.ArrayList;

public class Main {

    public static int[][] aMatrix;
    public static int chromatic;
    public static int upperB;
    public static int chooser;

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Error! No filename specified.");
            System.exit(0);
        }

        String inputfile = args[0];
        boolean seen[] = null;
        int[][] adjMat = Reader.readCreateMatrix(inputfile);
        aMatrix = adjMat;
        int vertex = adjMat.length;
        int edges = Reader.getEdges();

        long start = System.currentTimeMillis();
        if(vertex<150 && edges<1200){
            long midway = start + 40*1000;
            long end = start + 80 * 1000;   // 2 mins
            while (System.currentTimeMillis() < midway) {
                if (ChromaticMethods.ifWheel(adjMat) == true) {
                    chromatic = 3;
                    upperB = 3;
                    CliqueFinder.highestClique = 3;
                }
                int chromaticNum = ChromaticMethods.fromScartchChromatic(adjMat, vertex, 50000);
                chromatic = chromaticNum;
                    int randomPass = PASS.randomPASS(adjMat, adjMat.length - 1);

            }
            while(System.currentTimeMillis()<end-3){
                double[][] matr = Reader.doubleMat(aMatrix);
                Matrix aMat = new Matrix(matr);
                EigenvalueDecomposition eigen = aMat.eig();
                double[] eigens = eigen.getRealEigenvalues();
                int maybeClique = CliqueFinder.computeFromEigens(eigens);
                CliqueFinder.highestClique = maybeClique;
                int[] normalArray = new int[aMatrix.length];
                for (int i = 0; i < aMatrix.length; i++) {
                    normalArray[i] = i;
                    normalArray[i] = ChromaticMethods.checkDegrees(aMatrix, i);
                }
                int[][] pruned = Pruner.prune(aMatrix, maybeClique, normalArray);
                ArrayList<Integer> clique3 = CliqueFinder.cliqueSearch3(pruned);
                ArrayList<Integer> maxClique = CliqueFinder.cliqueSearchNext(clique3,3,pruned);

            }
            System.out.println("NEW BEST UPPER BOUND = " + upperB);
            System.out.println("NEW BEST LOWER BOUND = " + CliqueFinder.highestClique);
            System.out.println("CHROMATIC NUMBER = " + chromatic);




    }else if(vertex<400 && edges <3500) {
            long midway = start + 50 * 1000;
            long end = start + 60 * 1000;   // 2 mins
            while (System.currentTimeMillis() < midway) {
                if (ChromaticMethods.ifWheel(adjMat) == true) {
                    chromatic = 3;
                    upperB = 3;
                    CliqueFinder.highestClique = 3;
                }
                int chromaticNum = ChromaticMethods.fromScartchChromatic(adjMat, vertex, 20000);
                chromatic = chromaticNum;
                if (vertex < 50) {
                    int randomPass = PASS.randomPASS(adjMat, adjMat.length - 1);
                } else {
                    int randomPass = PASS.randomPASS(adjMat, (adjMat.length) / 2);
                }
                while (System.currentTimeMillis() < end - 3) {
                    double[][] matr = Reader.doubleMat(aMatrix);
                    Matrix aMat = new Matrix(matr);
                    EigenvalueDecomposition eigen = aMat.eig();
                    double[] eigens = eigen.getRealEigenvalues();
                    int maybeClique = CliqueFinder.computeFromEigens(eigens);
                    CliqueFinder.highestClique = maybeClique;
                    int[] normalArray = new int[aMatrix.length];
                    for (int i = 0; i < aMatrix.length; i++) {
                        normalArray[i] = i;
                        normalArray[i] = ChromaticMethods.checkDegrees(aMatrix, i);
                    }
                    int[][] pruned = Pruner.prune(aMatrix, maybeClique, normalArray);
                    ArrayList<Integer> clique3 = CliqueFinder.cliqueSearch3(pruned);
                    ArrayList<Integer> maxClique = CliqueFinder.cliqueSearchNext(clique3, 3, pruned);

                }
                System.out.println("NEW BEST UPPER BOUND = " + upperB);
                System.out.println("NEW BEST LOWER BOUND = " + CliqueFinder.highestClique);
                System.out.println("CHROMATIC NUMBER = " + chromatic);
            }
        }else if(edges > 10000){
                long halfway = start + 50*1000;
                long finish = start + 70 * 1000;   // 2 mins
                while (System.currentTimeMillis() < halfway) {
                    if (ChromaticMethods.ifWheel(adjMat) == true) {
                        chromatic = 3;
                        upperB = 3;
                        CliqueFinder.highestClique = 3;
                    }
                    int chromaticNum = ChromaticMethods.fromScartchChromatic(adjMat, vertex, 10000);
                    chromatic = chromaticNum;
                    int randomPass = PASS.randomPASS(adjMat, adjMat.length - 1);

                }
                while(System.currentTimeMillis()<finish-3){
                    double[][] matr = Reader.doubleMat(aMatrix);
                    Matrix aMat = new Matrix(matr);
                    EigenvalueDecomposition eigen = aMat.eig();
                    double[] eigens = eigen.getRealEigenvalues();
                    int maybeClique = CliqueFinder.computeFromEigens(eigens);
                    CliqueFinder.highestClique = maybeClique;
                    int[] normalArray = new int[aMatrix.length];
                    for (int i = 0; i < aMatrix.length; i++) {
                        normalArray[i] = i;
                        normalArray[i] = ChromaticMethods.checkDegrees(aMatrix, i);
                    }
                    int[][] pruned = Pruner.prune(aMatrix, maybeClique, normalArray);
                    ArrayList<Integer> clique3 = CliqueFinder.cliqueSearch3(pruned);
                    ArrayList<Integer> maxClique = CliqueFinder.cliqueSearchNext(clique3,3,pruned);

                }
                System.out.println("NEW BEST UPPER BOUND = " + upperB);
                System.out.println("NEW BEST LOWER BOUND = " + CliqueFinder.highestClique);
                System.out.println("CHROMATIC NUMBER = " + chromatic);


            }


            }

    }

