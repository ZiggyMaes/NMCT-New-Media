import controlP5.*;

String KEY = "developer"; // "secret" key/token
String IP = "172.23.190.22"; // ip bridge in lokaal GKG A112

int hue = 0;
int brightness = 0;
int saturation = 0;

ControlP5 gui;

DefaultHttpClient httpClient;

void setup() {
  frameRate(10);
  size(400,400);
  smooth();
  colorMode(HSB, 65535, 255, 255);

  httpClient = new DefaultHttpClient();
  gui = new ControlP5(this);
  
  PFont p = createFont("HelveticaNeue-Light", 15); 
  gui.setControlFont(p);
  
  gui.addSlider("hue", 0, 65535, 10000, 50, 50, 150, 25);
  gui.addSlider("sat", 0, 255, 200, 50, 80, 150, 25);
  gui.addSlider("bri", 0, 255, 200, 50, 110, 150, 25);
}

void draw() {
  hue = int(gui.getController("hue").value());
  saturation = int(gui.getController("sat").value());
  brightness = int(gui.getController("bri").value());
  
  background(hue, saturation, brightness);
  
  try {
    String data = "{\"on\":true, \"hue\":"+hue+", \"bri\":"+brightness+", \"sat\":"+saturation+", \"transitiontime\":5}";

    StringEntity se = new StringEntity(data);
    HttpPut httpPut = new HttpPut("http://"+IP+"/api/"+KEY+"/lights/1/state");

    httpPut.setEntity(se);

    HttpResponse response = httpClient.execute(httpPut);
    HttpEntity entity = response.getEntity();
    if (entity != null) entity.consumeContent();
  }
  catch(Exception e) {
    e.printStackTrace();
  }
}
void stop() {
  httpClient.getConnectionManager().shutdown();
  super.stop();
}

