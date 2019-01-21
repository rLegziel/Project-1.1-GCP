import java.util.ArrayList;

public class CliqueFinder {

    public static ArrayList cliqueSearch3(int[][] adjMatrix) {
        ArrayList<Integer> temp1 = new ArrayList<>();
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix.length; j++) {
                if (adjMatrix[i][j] == 1) {
                    for (int k = 0; k < adjMatrix.length; k++) {
                        if (adjMatrix[j][k] == 1 && k != i) {
                            if (adjMatrix[k][i] == 1) {
                                boolean found = false;
                                for (int l = 0; l < temp1.size() && found != true; l++) {
                                    if (temp1.get(l) == -1) {
                                        int[] tempArray = {temp1.get(l + 1), temp1.get(l + 2), temp1.get(l + 3)};
                                        if ((i == tempArray[0] || i == tempArray[1] || i == tempArray[2])
                                                && (j == tempArray[0] || j == tempArray[1] || j == tempArray[2]) &&
                                                (k == tempArray[0] || k == tempArray[1] || k == tempArray[2])) {
                                            found = true;
                                        }
                                    }
                                }
                                if (found == false) {
                                    temp1.add(-1); //Seperator
                                    temp1.add((Integer) i);
                                    temp1.add((Integer) j);
                                    temp1.add((Integer) k);

                                    //System.out.print(temp1.toString());
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(temp1.toString());
        return temp1;
    }


    public static ArrayList cliqueSearchNext(ArrayList<Integer> cliques, int cSize, int[][] adjMatrix) {
        int currentCSize = cSize;
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        ArrayList<Integer> temp3 = new ArrayList<>();
        ArrayList<Integer> remember = new ArrayList<>();
        int numberOfCliques = 0;

        for (int l = 0; l < cliques.size(); l++) {
            if (cliques.get(l) == -1) {
                int[] tempArray1 = new int[currentCSize]; //Making an array for a clique
                for (int m = 0; m < currentCSize; m++) {
                    tempArray1[m] = cliques.get(l + 1 + m);
                }

                for (int n = 0; n < cliques.size(); n++) {
                    if (cliques.get(n) == -1 && n > l) { //Finding next clique that wasn't checked yet
                        int[] tempArray2 = new int[currentCSize]; //Making an array for a 2nd clique
                        for (int p = 0; p < currentCSize; p++) {
                            tempArray2[p] = cliques.get(n + 1 + p);
                        }
                        int counter = 0; //Counting amount of shared vertices
                        temp1.clear();
                        temp2.clear();
                        remember.clear();
                       for(int q=0;q<tempArray1.length;q++){
                           temp1.add(tempArray1[q]);
                           temp1.add(tempArray2[q]);
                           temp2.add(tempArray1[q]);
                           temp2.add(tempArray2[q]);
                       }
                       boolean stop = false;
                       for(int r=0;r<tempArray1.length&&stop!=true;r++){
                           for(int s=0;s<tempArray2.length;s++){
                               if(tempArray1[r]==tempArray2[s]){
                                   remember.add(tempArray1[r]);
                                   counter++;
                               }
                           }
                           if(r>0&&counter==0){
                               //System.out.println("Stopped"+currentCSize);
                               stop = true;
                           }
                       }
                       while(remember.isEmpty()==false) {
                           temp1.remove(remember.get(0));
                           temp1.remove(remember.get(0));
                           temp2.remove(remember.get(0));
                           remember.remove(0);
                       }
                        //System.out.println("Now: "+temp2.toString());

                        if (counter == currentCSize - 1) { //If they share same amount of vertices
                            if (adjMatrix[temp1.get(0)][temp1.get(1)] == 1) { //Check if edge between last 2 exists
                                for (int s = 0; s < temp2.size(); s++) {
                                    if(s==0){
                                        temp3.add(-1); //Seperator
                                        numberOfCliques++;
                                    }
                                    temp3.add(temp2.get(s));
                                }
                            }
                        }
                    }
                }

            }
        }
        int count = 0;
        boolean stop = false;
        for(int z=0;z<temp3.size()&&stop!=true;z++){
            if(temp3.get(z)==-1){
                count++;
            }
            if(count==2){
                stop = true;
                System.out.println("Next Cycle!!!");
                System.out.println(temp3.toString());
                System.out.println("Number of Cliques: "+numberOfCliques);
                cliqueSearchNext(temp3,currentCSize+1,adjMatrix);
            }
        }
        //System.out.println(temp3.toString());
        //System.out.println(numberOfCliques);
        System.out.println("Its done");
        return temp3;
    }
}
