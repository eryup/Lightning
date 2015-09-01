int startX = 0;
int startY= 150;
int endX= 0;
int endY= 150;
void setup()
{
  size(300,300);
  background(50,10);
  strokeWeight(2);
  frameRate(30);
  colorChange();
}
void draw()
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
}
void mousePressed()
{
startX = 0;
startY= 150;
endX= 0;
endY= 150;
}
void colorChange()
{
	stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
}
