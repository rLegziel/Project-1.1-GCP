import java.util.ArrayList;

public class Pruner {

    public static int[][] prune(int[][] adjMatrix) {
        ArrayList<Integer> pruneable = new ArrayList<>();
        for (int i = 0; i < adjMatrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < adjMatrix.length;j++){
                if (adjMatrix[i][j] == 1) {
                    counter++;
                }
                if (j == adjMatrix.length - 1) {
                    if (counter == 1) {
                        pruneable.add(i);
                    }
                }
            }
        }
        for (int i = 0; i < pruneable.size(); i++) {
            int delete = (int) pruneable.get(i);
            for (int j = 0; j < adjMatrix.length; j++) {
                adjMatrix[delete][j] = 0;
                adjMatrix[j][delete] = 0;
            }
        }
        if (pruneable.isEmpty()) {
            return adjMatrix;
        } else {
            prune(adjMatrix);
        }
        return adjMatrix;
    }
}
