import java.lang.Math;

public class Vertex 
{
	public Vertex(){
	
	color = 0;// one color for every vertex at the beggining
	count++;
	index=count;
	
		if (index==1){
			A = new double[1][2];
			x_coordinate = Math.random() * WIDTH + 1;
			y_coordinate = Math.random() * HEIGHT +1;
			x_coordinate = x_coordinate - (x_coordinate%5);
			y_coordinate = y_coordinate - (x_coordinate%5);
			
			A[0][0] = x_coordinate;
			A[0][1] = y_coordinate;
		}
	
		else{
			boolean check = false;
			int samePosition=0;
			
			while (check==false){
				x_coordinate = Math.random() * WIDTH + 1;
				y_coordinate = Math.random() * HEIGHT + 1;
					for (int i=0; i<A.length; i++){
						if (A[i][0] == x_coordinate &&  A[i][1] == y_coordinate){
							samePosition++;
						}
					}
				
					if (samePosition != 0){
						check = false;
					}
					else{
						double[][] newA = new double[A.length+1][1];
						System.arraycopy(A,0,newA,0, A.length);
						A = newA;
						A[A.length-1][0]=x_coordinate;
						A[A.length-1][1]=y_coordinate;
						check = true;
					}
			}
		}
	
	}

	public void setColor(int c){
		color = c;
	}
	
	public int getColor(){
		return color;
	}
	
	public double getX(){
		return x_coordinate;
	}
	
	public double getY(){
		return y_coordinate;
	}
	
	public static double getRadius(){
		return radius;
	}
	
	
	private double x_coordinate;
	private double y_coordinate;
	private int color;
	private int index;
	
	private static int count;
	private static double[][]A;
	private static final double WIDTH = 400;
	private static final double HEIGHT = 400;
	private static final double radius = 5;

}