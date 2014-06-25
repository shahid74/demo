package com.java.test;

public class Question1 {
	
	public void printVerticesOfRectangle(Point[] pointArr){
		Point bottomLeftMostPoint=pointArr[0];
		for(int i=1; i < 4; i++){
			if(pointArr[i].x < bottomLeftMostPoint.x || pointArr[i].y < bottomLeftMostPoint.y){
				bottomLeftMostPoint=pointArr[i];
			}
		}
		System.out.println("bottom-left: ("+bottomLeftMostPoint.x+","+bottomLeftMostPoint.y+")");

		Point topRightMostPoint=pointArr[0];
		for(int i=1; i < 4; i++){
			if(pointArr[i].x > topRightMostPoint.x || pointArr[i].y > topRightMostPoint.y){
				topRightMostPoint=pointArr[i];
			}
		}
		System.out.println("top-right: ("+topRightMostPoint.x+","+topRightMostPoint.y+")");

	}

}


class Point{
	int x;
	int y;
}