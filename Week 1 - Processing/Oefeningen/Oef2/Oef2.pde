void setup() {
	size(800, 300);
	background(#EEEEF0);
}

void draw() {

	noStroke();

	fill(#3C1651);
	ellipse(150, 150, 200, 200);

	fill(#3C1651);
	arc(400, 150, 200, 200, 0, PI+QUARTER_PI);

	fill(#3C1651);
	arc(650, 150, 200, 200, 0, 0.6);
	fill(#5C3E6D);
	arc(650, 150, 200, 200, 0.6, 1.25);
	fill(#7B6188);
	arc(650, 150, 200, 200, 1.25, PI);
	fill(#9A86A3);
	arc(650, 150, 200, 200, PI, 4);
	fill(#BAACC2);
	arc(650, 150, 200, 200, 4, TWO_PI);
}