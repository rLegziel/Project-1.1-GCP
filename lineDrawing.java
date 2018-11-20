//TODO : FIGURING OUT HOW TO ADD TO GROUP SO ITS VISUALIZED, ADD TO GROUP HERE?


public void lineDrawing(int[][] adjMatrix,Vertex[] vertexArray){
	int[][] copyMatrix = new int[adjMatrix.length][adjMatrix[0].length];
	for (int i= 0;i<adjMatrix.length;i++){
	for (int j = 0; j< adjMatrix[0].length;j++){
	copyMatrix[i][j] = adjMatrix[i][j];
	}
	}

	for (int i= 0;i<adjMatrix.length;i++){
	for (int j = 0; j< adjMatrix[0].length;j++){
    if (copyMatrix[i][j] == 1){
    copyMatrix [j][i] = 0;
    Line line = new Line(); 
    line.setStartX(vertexArray[i].getXCoordinate()); 
      line.setStartY(vertexArray[i].getYCoordinate()); 
      line.setEndX(vertexArray[j].getXCoordinate); 
      line.setEndY(vertexArray[j].getYCoordinate); 
      
    }
	}
	}

}
