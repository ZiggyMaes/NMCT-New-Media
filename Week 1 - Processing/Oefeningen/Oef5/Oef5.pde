void setup() {
	size(800, 800);
	fill(#cc1c1c);
}

void draw() {
	rect(150, 150, 500, 500);
}

void mouseMoved() 
{
	checkRectangle();
}

void mouseDragged()
{
	checkRectangle();
}

void checkRectangle()
{
	if((mouseX >= 150 && mouseX <= 650) && (mouseY >= 150 && mouseY <= 650)) fill(#38c429);
	else fill(#cc1c1c);
}