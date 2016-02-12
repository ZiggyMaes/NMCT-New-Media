PImage island;
int iHeight, iWidth;
float size = 500;

void setup() {
	size(1600, 800);
	island = loadImage("img/island.png");
	imageMode(CENTER);
}

void draw() {
	background(#80bfff);
	image(island, width/2, height/2, size, size);
}

void mouseMoved() 
{
	float distance = dist(width/2, height/2, mouseX, mouseY);
  	float maxDistance = dist(0, 0, width/2, height/2);
  	size = map(distance, 0, maxDistance, height, 0);
}