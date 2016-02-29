String IP = "172.23.190.22";
String user = "ZiggyMaes0";

DefaultHttpClient httpClient;

void setup() {
	size(800, 600);
	httpClient = new DefaultHttpClient();

	setColor(15,true,65280,25,50,0);
}

void draw() {

}

void setColor(int lamp, boolean state, int hue, int saturation, int brightness, int transition)
{

	try
	{
    	String data = "{\"on\":"+state+", \"hue\":"+hue+", \"bri\":"+brightness+", \"sat\":"+saturation+", \"transitiontime\":"+transition+"}";
		
		StringEntity se = new StringEntity(data);
		HttpPut httpPut = new HttpPut("http://" + IP + "/api/" + user + "/lights/" + lamp + "/state");

    	httpPut.setEntity(se);

    	HttpResponse response = httpClient.execute(httpPut);
    	HttpEntity entity = response.getEntity();

		if(entity != null) entity.consumeContent();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	//hueLoop = (hueLoop<65535-interval)?hueLoop+interval:0;
}

void stop()
{
	httpClient.getConnectionManager().shutdown();
	super.stop();
}