int diameter = 30;
int canvaswidth = 1800;
int canvasheight = 1000;
color[] randomColors = {#E9D32F, #D1A72C, #42919F, #FE3830, #284253, #102C38, #0E1B2E, #152535};
int timer;

void setup() 
{
	size(1800, 1000);
	patern();
}

void draw()
{
	if (millis() > timer + 1000) 
	{
		patern();
		timer = millis();
	}
}

void patern()
{
	noStroke();

	for (int i = 40; i < canvasheight; i+=40)
	{
		drawElipseHorizontal(i);
	}
}

void drawElipseHorizontal(int y)
{
	for (int i = 40; i < canvaswidth; i+=40) 
	{
		fill(RandomColor());
		ellipse(i, y, diameter, diameter);	
	}
}

color RandomColor()
{	
	return randomColors[int(random(randomColors.length))];
}

