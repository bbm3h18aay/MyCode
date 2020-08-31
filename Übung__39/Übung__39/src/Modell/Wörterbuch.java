package Modell;

public class Wörterbuch {
	
	private Wortpaar[] liste = new Wortpaar[20];
	
	public Wörterbuch() {
		
		liste[0] = new Wortpaar("hass" , "hate");
		liste[1] = new Wortpaar("katze" , "cat");
		liste[2] = new Wortpaar("hund" , "dog");
		liste[3] = new Wortpaar("hallo" , "hello");
		liste[4] = new Wortpaar("gut" , "good");
		liste[5] = new Wortpaar("schlecht" , "bad");
		liste[6] = new Wortpaar("ja" , "yes");
		liste[7] = new Wortpaar("nein" , "no");
		liste[8] = new Wortpaar("wasser" , "water");
		liste[9] = new Wortpaar("luft" , "air");
		liste[10] = new Wortpaar("waffe" , "gun");
		liste[11] = new Wortpaar("kissen" , "pillow");
		liste[12] = new Wortpaar("erde" , "earth");
		liste[13] = new Wortpaar("feuer" , "fire");
		liste[14] = new Wortpaar("liebe" , "love");
		liste[15] = new Wortpaar("doof" , "dumb");
		liste[16] = new Wortpaar("nett" , "nice");
		liste[17] = new Wortpaar("eis" , "ice");
		liste[18] = new Wortpaar("reis" , "rice");
		liste[19] = new Wortpaar("scheibe" , "slice");
		liste[0] = new Wortpaar("fritten" , "fries");
	}

}
