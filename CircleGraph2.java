import java.lang.Math;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.Graphics2D;

public class CircleGraph2{

		public CircleGraph2(int v, int r){
		vertices = v;
		radius=r;
		X=500;
		angle = Math.toRadians(360)/(2*vertices);
		}
		
		public CircleGraph2(int v, int r, int x, int y){
		vertices = v;
		radius=y/2;
		X=x/3; //x - the width of the screen
		angle = Math.toRadians(360)/(2*vertices);
		}
		
		
		
		public void createPoints(){
		A = new double[vertices][2];
			for (int i = 0; i < vertices; i++){
				double a = (angle*(i));
				double sin = Math.sin(a);
				double cos = Math.cos(a);
					
				/*if (a == Math.toRadians(90)) {
					A[i][0] = X;
					A[i][1] = X;
				}
				
				else if (a == Math.toRadians(180)) {
					A[i][0] = 100;
					A[i][1] = 100;
				}
				
				else if (a == Math.toRadians(270)) {
					A[i][0] = X;
					A[i][1] = X-radius;
				}
				
				else if (a == Math.toRadians(360)) {
					A[i][0] = X+radius;
					A[i][1] = X;
				}
				
				else if (a == Math.toRadians(0)) {
					A[i][0] = X+radius;
					A[i][1] = X;
				}
				
				else {
				A[i][0] = X + (radius - (radius*sin*sin));
				A[i][1] = X + radius*sin*cos;
				}*/
				
				A[i][0] = X + (radius - (radius*sin*sin));
				A[i][1] = X + radius*sin*cos;
						
			}	
			
		}
		
		public void draw(Graphics2D g2){
			for (int i = 0; i < A.length; i++){
			Ellipse2D.Double dot = new Ellipse2D.Double(A[i][0],A[i][1],radiusOfADot,radiusOfADot);
			g2.draw(dot);
			}
		}
		
		public double[][] getA(){
		return A;
		}

		private double radius;
		private int vertices;
		private double angle;
		private double[][] A;
		private double radiusOfADot = 10;
		private static double X; //middle of the screen
}