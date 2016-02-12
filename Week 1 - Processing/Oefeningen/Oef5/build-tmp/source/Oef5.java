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

public class Oef5 extends PApplet {

public void setup() {
	
	fill(0xffcc1c1c);
}

public void draw() {
	rect(150, 150, 500, 500);
}

public void mouseMoved() 
{
	checkRectangle();
}

public void mouseDragged()
{
	checkRectangle();
}

public void checkRectangle()
{
	if((mouseX >= 150 && mouseX <= 650) && (mouseY >= 150 && mouseY <= 650)) fill(0xff38c429);
	else fill(0xffcc1c1c);
}
  public void settings() { 	size(800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Oef5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
