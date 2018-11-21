import java.lang.Math;
import java.util.Random;

/*To use make an object of this class like this:
RandomNodes graph = new RandomNodes(10,15); //10 vertices, 15 edges
graph.createAdjMatrix;
graph.getAdjMatrix; //This returns an adj Matrix with randomised connections
*/


public class RandomNodes{
	private int vertices;
	private int edges;
	private int randomX = 0;
	private int randomY = 0;
	private boolean stop = false;
	private int[][] array;
	
	public RandomNodes(){ //Random
	vertices = (int) (Math.random()*19)+1; //19 is example, this should be max amount of vertices
	edges = (int) (Math.random()*39)+1; //Same goes for 39 here, max amount of edges
	}
	public RandomNodes(int userVertex, int userEdge){ //With user input
		vertices = userVertex;
		edges = userEdge;
	}
	
	public void createAdjMatrix(){ 
	int[][] adjMatrix = new int[vertices][vertices];
		
	for(int counter=0; counter<edges; counter++){
		if(counter==0){
		randomNum();
		adjMatrix[randomX][randomY] = 1;
		}
		
		if(counter!=0){
			stop = false;
			while(stop==false){
			randomNum();
				if(adjMatrix[randomX][randomY]!=1){ //check if there isn't an edge already
					stop = true;
					adjMatrix[randomX][randomY] = 1;
				}
			}
		}
		adjMatrix[randomY][randomX]=1; //Adj Matrix is mirrored
	}
	array = adjMatrix;
}			
				
	public void randomNum(){
		randomX=0;
		randomY=0;
		while(randomX==randomY){ //Nothing on the diagonal
		randomX = (int) (Math.random()*vertices);
		randomY = (int) (Math.random()*vertices);
		}
	}
	public int[][] getAdjMatrix(){
		return array;
	}
}
