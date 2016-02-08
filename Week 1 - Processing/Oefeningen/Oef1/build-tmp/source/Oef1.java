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

public class Oef1 extends PApplet {

public void setup() {
	
	background(0xffFEF4E9);

}

public void draw() {

	noStroke();

	fill(0xffA697B6);
	triangle(200, 300, 250, 250, 280, 320); // 1

	fill(0xffFDC96C);
	triangle(200, 300, 200, 200, 300, 200); // 2

	fill(0xffA2CAC1);
	triangle(200, 200, 300, 200, 300, 100); // 3

	fill(0xffCEBFD4);
	triangle(300, 100, 300, 200, 400, 200); // 4

	fill(0xffED7F75);
	triangle(300, 100, 400, 100, 400, 200); // 5

	fill(0xffA697B6);
	triangle(400, 100, 400, 200, 500, 200); // 6

	fill(0xffFDC96C);
	triangle(400, 100, 500, 100, 500, 200); // 7

	fill(0xffBFDCE9);
	triangle(400, 200, 500, 200, 500, 300); // 8

	fill(0xffCEBFD4);
	triangle(400, 200, 400, 300, 500, 300); // 9

	fill(0xffED7F75);
	triangle(400, 300, 500, 300, 500, 400); // 10

	fill(0xffFDC96C);
	triangle(400, 300, 400, 400, 500, 400); // 11

	fill(0xffA2CAC1);
	triangle(400, 400, 500, 400, 500, 500); // 12

	fill(0xffCEBFD4);
	triangle(400, 400, 400, 500, 500, 500); // 13

	fill(0xffBFDCE9);
	triangle(400, 500, 500, 500, 500, 600); // 14
	
	fill(0xffA697B6);
	triangle(500, 600, 540, 600, 500, 550); // 15
}
  public void settings() { 	size(750, 700); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Oef1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
