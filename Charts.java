package s0start;

class Titel {
	String name;
	int besterPlatz;
	int chartWochen;
	Artist künstler;
}

class Artist {
	String name;
	String land;
}

public class Charts {
	public static void main(String[] args) {
		
		Titel[] charts = new Titel[3];
		
		Artist Ed = new Artist();
		Ed.name = "Ed Sheeran";
		Ed.land = "UK";
		
		charts[0] = new Titel();
		charts[0].name = "Shape of You";
		charts[0].besterPlatz = 1;
		charts[0].chartWochen = 89;
		charts[0].künstler = Ed;
		
		charts[1] = new Titel();
		charts[1].name = "Thunder";
		charts[1].besterPlatz = 2;
		charts[1].chartWochen = 50;
		charts[1].künstler.name = "Imagine Dragon";
		charts[1].künstler.land = "USA";
		
		charts[2] = new Titel();
		charts[2].name = "Thunder";
		charts[2].besterPlatz = 2;
		charts[2].chartWochen = 50;
		charts[2].künstler = Ed;
	}
}
