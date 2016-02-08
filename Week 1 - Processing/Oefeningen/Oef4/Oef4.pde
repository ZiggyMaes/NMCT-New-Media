color[] drawCcolors = {#000000, #E9D32F, #D1A72C, #42919F, #FE3830, #284253, #102C38, #0E1B2E, #152535};
int currentColorIndex;

void setup() {
	size(1800, 1000);
}

void draw() {

	if (mouseButton == LEFT) 
  	{
  		stroke(drawCcolors[currentColorIndex]);
  		line(pmouseX, pmouseY, mouseX, mouseY);
  	}
}


void keyPressed() {
	if (keyPressed) 
	{
		if (key == 'r' || key == 'R') currentColorIndex = 0;
	}

	  if (key == CODED) 
	  {
		if (keyCode == LEFT)
		{
  			if(currentColorIndex == 0) int(drawCcolors.length - 1);
  			else currentColorIndex--;
		}
		else if (keyCode == RIGHT)
		{
  			if(currentColorIndex + 1 == int(drawCcolors.length)) currentColorIndex = 0;
  			else currentColorIndex++;
		}
	}
}
