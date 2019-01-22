
import java.lang.Math;

public class findClicque {


	/**
	 * @param adjMat the adj matrix
	 * @return an array that contains the vertices ordered by amount of edges.in decreasing order.
	 */
			public static int[] vertexOrdering ( int[][] adjMat){
				int[] another = new int[adjMat.length];
				int[] sorted = new int[adjMat.length];
				for (int i = 0; i < adjMat.length; i++) {
					another[i] = i;

				}

				for (int j = 0; j < adjMat.length; j++) {
					int currentHighIndex = ChromaticMethods.highestDegreeVertex(adjMat, another);
					System.out.println(currentHighIndex + " this is currently the highest degree index");
					another[currentHighIndex] = 0;
					sorted[j] = currentHighIndex;
				}
				return sorted;
			}

	/**
	 * @param adjMat the adj matrix
	 * @param sorted the sorted array
	 * @return an array that only contains the actual amount of edges for each index.
	 */
			public static int[] degreesOrdering ( int[][] adjMat, int[] sorted){
				int[] actualDegrees = new int[adjMat.length];
				for (int j = 0; j < adjMat.length; j++) {
					int currentHighNumber = ChromaticMethods.checkDegrees(adjMat, sorted[j]);
					actualDegrees[j] = currentHighNumber;
				}
				return actualDegrees;
			}

	/**
	 * @param eigens the list of all eigenvalues.
	 * @return a hypothetical lower bound based on hoffman lower bound.
	 */
			public static int computeFromEigens ( double[] eigens){
				double highest = 0;
				double positives = 0;
				double negatives = 0;
				double lowest = 0;
				for (int i = 0; i < eigens.length; i++) {
					if (eigens[i] > highest) {
						highest = eigens[i];
					}
					if (eigens[i] < lowest) {
						lowest = eigens[i];
					}
					if (eigens[i] > 0) {
						positives = positives + (eigens[i] * eigens[i]);
					}
					if (eigens[i] < 0) {
						negatives = negatives + (eigens[i] * eigens[i]);
					}
				}

				System.out.println("the biggest eigenvalue is  : " + highest);
				System.out.println("the lowest eigenvalue is : " + lowest);
				double alternativeWay = positives / negatives;
				int alt = (int) Math.round(alternativeWay);
				double anotherShot = (1 + (highest / (0 - lowest)));
				int yeahnah = (int) Math.round(anotherShot);
				if(alt> yeahnah){
					return alt;
				}
				return yeahnah;
			}


		}






