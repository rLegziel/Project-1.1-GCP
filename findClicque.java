import java.util.ArrayList;

public class findClicque {
	static int cSize = 2;


	public static int findClique(int[][] adjMat) {
		ArrayList<Integer> checkedNow = new ArrayList<>();
		ArrayList<Integer> checkLater = new ArrayList<>();

		int currentC = 1;
		for (int i = 0; i < adjMat.length; i++) {
			for (int j = 0; j < adjMat.length; j++) {
				if (adjMat[i][j] == 1) {
					checkedNow.add(j);
				}

			}
			for (int k = 0; k < checkedNow.size(); k++) {
				for (int y = 0; y < checkedNow.size(); y++) {
					if (adjMat[checkedNow.get(k)][checkedNow.get(y)] == 1) {
						checkLater.add(checkedNow.get(y));
					}
				}
				int connections = isConnected(adjMat, checkLater);
				System.out.println("connections is " + connections);
				currentC =  currentC+connections;
				if (currentC > cSize) {
					cSize = currentC;
					System.out.println(cSize + " is the new highest clique!");
				}
				currentC = 2;
				checkLater.clear();
			}
			checkedNow.clear();
		}
		return cSize;
	}


	public static int isConnected(int[][] adjMat, ArrayList<Integer> connections) {
		int counter = 1;
		int currentHigh = 0;
		for (int k = 0; k < connections.size(); k++) {
			for (int y = 0; y < connections.size(); y++) {
				if (adjMat[connections.get(k)][connections.get(y)] == 1) {
					counter++;
				}
			}
			if (counter > currentHigh) {
				currentHigh = counter;
			}
			counter = 1;
		}
		return currentHigh;
	}
}

