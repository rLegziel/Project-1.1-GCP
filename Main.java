import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChromaticMethods {

    public static int upperBound(int[][] matrix) {
        int max = 0;
        int upperBound = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    upperBound++;
                }
            }
            if (max < upperBound)
                max = upperBound;
            upperBound = 0;
        }
        return max + 1;
    }

    public static int findChromatic(int[] array) {
        int finalReturn = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k] > finalReturn) {
                finalReturn = array[k];
            }
        }
        return finalReturn;
    }

    public static int[] makeColorsArray(int upperBound) {
        int[] colors = new int[upperBound];
        for (int i = 1; i < colors.length + 1; i++) {
            colors[i - 1] = i;
        }
        return colors;
    }

    public static int coloring(int[] colors, int[][] matrix, int[] done, int index) {
        int[] array = Arrays.copyOf(colors, colors.length);
        for (int j = index - 1; j > 0 - 1; j--) {
            if (matrix[index][j] == 1) {
                int colorToRemove = done[j];
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == colorToRemove) {
                        array[i] = 0;
                    }
                }
            }
        }
        int lowestColor = findSmallest(array);
        return lowestColor;
    }

    public static int findSmallest(int[] copyArray) {
        int smallestColor = 0;
        for (int i = 0; i < copyArray.length; i++) {
            if (copyArray[i] != 0) {
                smallestColor = copyArray[i];
                break;
            }
        }
        if (smallestColor == 0) {
            return 1;
        }
        return smallestColor;
    }
    public static int randomizedTest(int[][] matrix, int vertices, int upperBound, int[] color) {
        color[0] = 1;
        ArrayList<Integer> randomOrder = new ArrayList<Integer>(vertices + 1);
        for (int i = 0; i < vertices; i++) { // try and change to 0
            randomOrder.add(i);
        }
        Collections.shuffle(randomOrder);
//        System.out.println(Arrays.toString(randomOrder.toArray()));

        int[] doneArray = new int[vertices];
        for (int j = 0; j < randomOrder.size(); j++) {
            int randomChoosing = randomOrder.get(j);
//System.out.println("this is the " + j +  " time the loop is going, the size of the array is " +randomOrder.size() );
//            if (j == 0) {
//                doneArray[j] = 1;
//            } else {

            doneArray[j] = coloringRandom(color, matrix, doneArray, randomChoosing, randomOrder);
        }
        //}
        int chromaticNumber = findChromatic(doneArray);
        return chromaticNumber;

    }

    public static int coloringRandom(int[] colors, int[][] matrix, int[] done, int number, ArrayList<Integer> randomOrder) {
        int[] array = Arrays.copyOf(colors, colors.length);
        int index = randomOrder.indexOf(number);
        for (int j = index - 1; j > -1; j--) { // removed index -1
//          System.out.println("checking backwards from "+number +":   "+randomOrder.get(j));
            if (matrix[number][randomOrder.get(j)] == 1) {
                int colorToRemove = done[j];
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == colorToRemove) {
                        array[i] = 0;
                    }
                }
            }
        }
        int lowestColor = findSmallest(array);
        return lowestColor;
    }


    public static int fromScartchChromatic(int[][] adjMat, int vertex,int amountOfTimes) {
        int upperBound = upperBound(adjMat);
        int[] color = makeColorsArray(upperBound);
        int[] doneArray = new int[vertex];
        for (int j = 0; j < vertex; j++) {
            if (j == 0 || j == 1) {
                doneArray[j] = 1;
            }
            doneArray[j] = coloring(color, adjMat, doneArray, j);
        }
        int chromatic = findChromatic(doneArray);
//        System.out.println("this is the greedy chromatic : " + chromatic);
        int minimumChromatic = upperBound;
        Main.upperB = upperBound;
        for (int i = 0; i < amountOfTimes; i++) {
            int chromaticRandomized = randomizedTest(adjMat, vertex, upperBound, color);
            if(chromaticRandomized==2){
                minimumChromatic =chromaticRandomized;
                Main.upperB = 2;
                CliqueFinder.highestClique = 2;
                System.out.println("NEW BEST UPPER BOUND = " + Main.upperB );
                break;
            }
            if (chromaticRandomized < minimumChromatic) {
                minimumChromatic = chromaticRandomized;
                Main.chromatic = chromaticRandomized;
            }else if(chromaticRandomized<Main.upperB && chromaticRandomized > minimumChromatic){
                Main.upperB = chromaticRandomized;
                System.out.println("NEW BEST UPPER BOUND = " + Main.upperB );
            }
        }
        return minimumChromatic;
    }

    public static int checkDegrees(int[][] adjMat,int index) {
        int counter = 0;
        for(int i=0;i<adjMat.length;i++){
            if(adjMat[index][i] == 1){
                counter++;
            }
        }
        return counter;
    }

    public static boolean ifWheel(int[][] adjMat){
        int counterEdges =0;
        int counterMiddle =0;
        for(int i =1;i<adjMat.length;i++){
            int deg = checkDegrees(adjMat,i);
            if(deg == 3){
                counterEdges++;
            }else if(deg== adjMat.length-2 ){
                counterMiddle++;
            } else{
                break;
            }
        }
        if(counterEdges+counterMiddle == adjMat.length-1){
            Main.chromatic = 3;
//            System.out.println("really?");
            return true;
        }
        return false;
    }
}
