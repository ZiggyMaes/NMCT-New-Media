import SimpleOpenNI.*;

SimpleOpenNI kinect;
PImage background;

void setup() 
{
  size(640, 480);

  kinect = new SimpleOpenNI(this);
  background = loadImage("background.jpg");

  kinect.enableDepth();
  kinect.enableUser();
  
}

void draw() 
{
  kinect.update();
  image(background, 0, 0);

  int[] userList = kinect.getUsers();
  int[] userPixels;
  for(int i=0;i<userList.length;i++)
  {
    userPixels = kinect.getUsersPixels(i);
  }   
}