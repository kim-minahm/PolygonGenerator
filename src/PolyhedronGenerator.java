import java.util.*;
import DataStructure.Point;

public class PolyhedronGenerator {
	
	public static void main(String[] args){
		Point point = new Point(1,2,3);
	}
	
	public void generateCube(double width, double height, double depth){
		Point corner;
	}
	
	private String createLine(Point start, Point end, double diff){
		String line = new String();
		double currHeight = start.getZ();
		double deltaX = end.getX()-start.getX();
		double deltaY = end.getY()-start.getY();
		double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
		double currX = start.getX();
		double currY = start.getY();
		int count = (int)(distance/diff);
		deltaX/=count;
		deltaY/=count;
		String point = new String(String.valueOf(currX)+","+String.valueOf(currY)+","+String.valueOf(currHeight));
		line.concat(point);
		for(int i = 0; i < count; i++){
			currX+=deltaX;
			currY+=deltaY;
			point= new String(String.valueOf(currX)+","+String.valueOf(currY)+","+String.valueOf(currHeight));
			line.concat(point);
		}
		return line;
	}
}


