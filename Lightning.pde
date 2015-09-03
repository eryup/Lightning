PImage photo;
int wipe = 0;
int shift = 20;
int startX = 515;
int startY= 215;
int endX= 0;
int endY= 215;
void setup()
{
  size(800,450);
  background(50,10);
  strokeWeight(2);
  frameRate(30);
  colorChange();
  photo = loadImage("knee.jpg");
  image(photo,0,0);
}
void draw()
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
void colorChange()
{
	stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
}
void lightning()
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