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

PImage photo;
int wipe = 0;
int shift = 20;
int startX = 515;
int startY= 215;
int endX= 0;
int endY= 215;
public void setup()
{
  size(800,450);
  background(50,10);
  strokeWeight(2);
  frameRate(30);
  colorChange();
  photo = loadImage("knee.jpg");
  image(photo,0,0);
}
public void draw()
{
	if (wipe>500){
		 image(photo,0,0);
		 wipe=0;
	}
	 lightning();
  startX = 515;
startY= 215;
endX= 0;
endY= 215;
}
public void colorChange()
{
	stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
}
public void lightning()
{
	while (endX <= 800) {
	endX=startX+(int)(Math.random()*(shift));
	endY=startY+(int)(Math.random()*(shift*2))-(shift);
	line(startX,startY,endX,endY);
	colorChange();
	startX=endX;
	startY=endY;
	wipe++;
}
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
