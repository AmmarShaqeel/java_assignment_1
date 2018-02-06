public abstract class Shape{
		
	public abstract string getName();
	
	public double getArea(){
		return 0;
	}
}
	
	public double getVolume(){
		return 0;
	}
}

public class Point extends Shape{
	private int x; 
	private int y;
	
	public Point(){
		x = 0;
		y = 0;
	}
	
	public Point(int xval, int yval) {
		x = xval;
		y = yval;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int xval){
		x = xval;
	}
	
	public void setY(int yval){
		y = yval;
	}
}
	