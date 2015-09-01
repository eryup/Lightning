import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 0;
int startY= 150;
int endX= 0;
int endY= 150;
public void setup()
{
  size(300,300);
  background(50,10);
  strokeWeight(2);
  frameRate(30);
  colorChange();
}
public void draw()
{
while (endX <= 300) {
	endX=startX+(int)(Math.random()*10);
	endY=startY+(int)(Math.random()*19)-9;
	line(startX,startY,endX,endY);
	colorChange();
	startX=endX;
	startY=endY;
}
//	  fill(0,130,130,30);
  //rect(0, 0, 300, 300);
  background(50,10);
}
public void mousePressed()
{
startX = 0;
startY= 150;
endX= 0;
endY= 150;
}
public void colorChange()
{
	stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
