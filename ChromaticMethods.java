import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ChromaticMethods {


    /**
     * this method computes the chromatic number based on the highest color value the algorithm used.
     *
     * @param array is doneArray
     * @return
     */
    public static int findChromatic(int[] array) {
        int finalReturn = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k] > finalReturn) {
                finalReturn = array[k];
            }
        }
        return finalReturn;
    }

    /*
               upperBound is a method to find the upper bound for the chromatic number, it takes in an integer matrix as @param.
               the method is based on the brooks theorem. which says the upper bound for the chromatic number can be at most the highest degree
               of edges to one vertex + 1
              **/
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

    /*
               makeColorsArray is a method that creates an array of numbers from 1 until the upper bound.
               it is used later to assign numbers(colors) to each vertex.
              **/

    public static int[] makeColorsArray(int upperBound) {
        int[] colors = new int[upperBound];
        for (int i = 1; i < colors.length + 1; i++) {
            colors[i - 1] = i;
        }
        return colors;
    }

    /*
               the coloring method takes in 4 @params:
               colors = the integer array that represents all possible colors we can assign to a vertex.
               matrix = the adjacency matrix
               done = the array that contains the sequence of coloring
               index = the vertex we want to color

               firstly we create a copy of the colors array, then backtrack and see whether our point was connected to any other
               previously checked points. if it does, we find its color in the doneArray then find the same number in the colorsArray
               and equaling it to zero so it used.
              **/

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

    /*
                   findSmallest takes in one integer array as @param and returns the the first number that is not a zero in the array.
                   we created this method to check the colors array and find the correct and appropriate coloring.
                  **/
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

           /*
           randomizedTest method takes in 4 @params
           matrix = the adjacency matrix
           vertices = number of vertices in the graph
           color = an array of possible colors, its length is based on the upperbound


           we create an ArrayList which has a length of the number of vertices,
           we randomize its order using Collections.shuffle,
           the we input our values into the method that actually assigns colors to each vertex
           and finally we return the chromatic number using the findChromatic method
          **/

    public static int randomizedTest(int[][] matrix, int vertices, int upperBound, int[] color) {
        color[0] = 1;
        ArrayList<Integer> randomOrder = new ArrayList<Integer>(vertices + 1);
        for (int i = 0; i < vertices; i++) { // try and change to 0
            randomOrder.add(i);
        }
        Collections.shuffle(randomOrder);
        System.out.println(Arrays.toString(randomOrder.toArray()));

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

    /*
               minimumDegree is a method to find a basic lower bound to the chromatic number.
               the method takes in two @params- the adjacency matrix and upper bound.
               it iterates through the matrix and finds the vertex which has the least edges connected to it
               this number can be used as a simple lower bound to the chromatic number, but not in all cases


              **/
    public static int minimumDegree(int[][] matrix, int upperBound) {
        int min = upperBound;
        int lowerbound = upperBound;
        int degrees = 0;

        for (int i = 0; i < matrix[0].length; i++) { // based on Brooks Theorem, the upperbound can be at most the highest degree of edges +1
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    degrees++;
                }
            }
            if (lowerbound > degrees && degrees < min && degrees > 1) {
                min = degrees;
            }
            degrees = 0;
        }
        return min;
    }
/*
               this method is almost the same as the normal coloring method, it just adds another @param which is randomOrder,
               an ArrayList that contains the order of the vertex to check.
              **/

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

    /*
               This method checks if the graph is a complete graph or not.
               it takes 2 @params- the number of vertices and the number of edges.
               if this method finds the graph is complete based on our logic, it will return true.
              **/
    public static boolean isComplete(int vertices, int edges) {
        if ((vertices * (vertices - 1)) == edges) {
            return true;
        }
        return false;
    }

    /**
     * This method is used to calculate the chromatic number based on the adjacency matrix and the number of vertices
     * in the graph
     *
     * @param adjMat the adjacency matrix
     * @param vertex the number of vertices
     * @return an integer which is the chromatic number.
     */
    public static int fromScartchChromatic(int[][] adjMat, int vertex) {
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
        System.out.println("this is the greedy chromatic : " + chromatic);
        int minimumChromatic = upperBound;
        for (int i = 0; i < 1000; i++) {
            int chromaticRandomized = randomizedTest(adjMat, vertex, upperBound, color);
            if (chromaticRandomized < minimumChromatic) {
                minimumChromatic = chromaticRandomized;
            }
        }
        System.out.println("The chromatic number(randomized) is: " + minimumChromatic);
        return minimumChromatic;
    }

    public static int chromaticSaturation(int[][] adjMat) {
        int[] color = makeColorsArray(adjMat.length);
        int[] doneArray = new int[adjMat.length];
//        int highestDeg = highestDegreeVertex(adjMat);
        ArrayList<Integer> usedArray = new ArrayList<>();
        int counter = 0;
        while (counter != adjMat.length ) {
            if (counter == 0) {
                doneArray[counter] = 1;
            }
            if (counter == 1) {
//                System.out.println("first round!   " + counter);
                usedArray.add(counter);
                doneArray[counter] = coloringSaturation(color, adjMat, doneArray, counter, usedArray);
            } else {
                int satuIndex = highestSaturation(adjMat, doneArray);
//                System.out.println("highest saturation index is  " + satuIndex);
                usedArray.add(satuIndex);
                doneArray[satuIndex] = coloringSaturation(color, adjMat, doneArray, satuIndex, usedArray);
            }
            counter++;
//            System.out.println("the counter is " + counter);
        }
        return findChromatic(doneArray);
    }

    public static int randomSaturationChromatic(int[][] adjMat) {
        int[] color = makeColorsArray(adjMat.length);
        int[] doneArray = new int[adjMat.length];
        ArrayList<Integer> usedArray = new ArrayList<>();
        int vertex = adjMat.length;
        int minimumChromatic = vertex;
        int counter = 0;
        for (int c = 0; c < 100; c++) {
            Arrays.fill(doneArray, 0);
            counter = 0;
            usedArray.clear();
//            System.out.println("this is the " + c + " time");
            while (counter != adjMat.length ) {
                if (counter == 0) {
                    doneArray[counter] = 1;
                    usedArray.add(0);
                }
                else if (counter == 1) {
                    Random rand = new Random();
                    int startingNum = rand.nextInt(vertex - 1) + 1;
//                    System.out.println("first round!   " + startingNum);
                    usedArray.add(startingNum);
//                    System.out.println("starting number is " + startingNum);
//                    doneArray[startingNum] = coloringSaturation(color, adjMat, doneArray, startingNum, usedArray);
                    doneArray[startingNum] = 1;
                } else {
                    int satuIndex = highestSaturation(adjMat, doneArray);
//                    System.out.println("highest saturation index is  " + satuIndex);
                    usedArray.add(satuIndex);
                    doneArray[satuIndex] = coloringSaturation(color, adjMat, doneArray, satuIndex, usedArray);
                }
                counter++;
//                System.out.println(" random highest saturation  times is  " + counter);
            }
            int chromaticRandomized = findChromatic(doneArray);
//            System.out.println("current chromatic is  " + chromaticRandomized);
            if (chromaticRandomized < minimumChromatic) {
                minimumChromatic = chromaticRandomized;
            }
        }
        return minimumChromatic;
    }

    public static int coloringSaturation(int[] colors, int[][] matrix, int[] done, int index, ArrayList<Integer> usedArray) {
        int[] array = Arrays.copyOf(colors, colors.length);
        if (usedArray.size() > 0) {
            for (int i = 0; i < usedArray.size(); i++) {
                if (matrix[index][usedArray.get(i)] == 1 && done[usedArray.get(i)] != 0) {
                    int colorToRemove = done[usedArray.get(i)];
                    for (int j = 0; j < array.length; j++) {
                        if (array[j] == colorToRemove) {
                            array[j] = 0;
                        }
                    }
                }
            }
        }
        int lowestColor = findSmallest(array);
        return lowestColor;
    }

    public static int highestDegreeVertex(int[][] adjMat,int[] notThis) {
        int max = 0;
        int upperIndex = 0;
        int upperBound = 0;
        for (int i = 0; i < adjMat[0].length; i++) {
            if (notThis[i] != 0) {
                upperBound = highestDegreeNumber(adjMat, i);
            }

            if (max < upperBound) {
                max = upperBound;
                upperIndex = i;
            }
            upperBound = 0;
        }
        return upperIndex;
            }




    public static int highestSaturation(int[][] adjMat, int[] doneArray) {
        int highestIndex = 0;
        int currentHigh = 0;
        int connectionCounter = 0;

        for (int i = 0; i < adjMat[0].length; i++) {
            for (int j = 0; j < adjMat.length; j++) {
                if (adjMat[i][j] == 1) {
                    if (doneArray[j] != 0) {
                        connectionCounter++;
                    }
                }

            }

            if (connectionCounter > currentHigh && doneArray[i] == 0 && i != 0) {
                currentHigh = connectionCounter;
                highestIndex = i;
            }
            connectionCounter = 0;
        }
        if (highestIndex == 0) {
            for (int y = 0; y < doneArray.length; y++) {
                if (doneArray[y] == 0) {
                    highestIndex = y;
                    return highestIndex;
                }
            }
        }

        return highestIndex;
    }

    public static int highestDegreeNumber(int[][] adjMat,int index) {
        int counter = 0;
        for(int i=0;i<adjMat.length;i++){
            if(adjMat[index][i] == 1){
                counter++;
            }
        }
        return counter;
    }
}

