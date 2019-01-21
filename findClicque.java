import java.util.ArrayList;
import java.lang.Math;

public class findClicque {
	static int cSize = 2;


	public static int findClique(int[][] adjMat) {
		ArrayList<Integer> checkedNow = new ArrayList<>();
		ArrayList<Integer> checkLater = new ArrayList<>();
		int connections = 0;
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
				connections = isConnected(adjMat, checkLater);
				System.out.println("connections is " + connections);
				System.out.println("currentC is " + currentC);
				currentC = currentC + connections;

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
			counter = 1;
			for (int y = 0; y < connections.size(); y++) {
				if (adjMat[connections.get(k)][connections.get(y)] == 1) {
					counter++;
				}
			}
			if (counter > currentHigh) {
				currentHigh = counter;
			}
		}
		if (currentHigh == 1) {
			return 0;
		}
		return currentHigh;
	}

	public static int[] vertexOrdering(int[][] adjMat){
		int[] another = new int[adjMat.length];
		int[] sorted = new int[adjMat.length];
		for(int i = 0;i < adjMat.length;i++){
			another[i] = i;

		}

		for(int j =0;j<adjMat.length;j++){
           int currentHighIndex = ChromaticMethods.highestDegreeVertex(adjMat,another);
           System.out.println(currentHighIndex + " this is currently the highest degree index");
           another[currentHighIndex] = 0;
           sorted[j]=currentHighIndex;
		}
		return sorted;
	}

	public static int[] degreesOrdering(int[][] adjMat,int[] sorted){
		int[] actualDegrees = new int[adjMat.length];
		for(int j =0;j<adjMat.length;j++){
			int currentHighNumber = ChromaticMethods.checkDegrees(adjMat,sorted[j]);
			actualDegrees[j] = currentHighNumber;
		}
		return actualDegrees;
	}

    public static int computeFromEigens(double[] eigens){
		double highest =0;
		double lowest = 0;
		for(int i = 0;i<eigens.length;i++){
			if(eigens[i] > highest){
				highest = eigens[i];
			}
			if(eigens[i]<lowest){
				lowest = eigens[i];
			}
		}

		System.out.println("the biggest eigenvalue is  : " + highest);
		System.out.println("the lowest eigenvalue is : " + lowest);
		double anotherShot =  (1+(highest /(0-lowest)));
		int yeahnah = (int) Math.round(anotherShot);
		return yeahnah;
	}


}



