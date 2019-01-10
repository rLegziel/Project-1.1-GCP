import java.util.ArrayList;

public class findClicque {
	static int cSize = 2;


	public static int findClique(int[][] adjMat) {
		ArrayList<Integer> checkedNow = new ArrayList<>();
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
						currentC++;
						if (currentC > cSize) {
							cSize = currentC;
						}
					}
				}
				currentC = 1;
			}
			checkedNow.clear();
		}
		return cSize;
	}
}

