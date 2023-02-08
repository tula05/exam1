package idrandom;

import java.util.Random;

class ThaiID {
protected String id;


public ThaiID() {
	Random random = new Random();
	int Myarray[] = new int[13];
	id = "";
	for (int i = 0; i < Myarray.length; i++) {
		Myarray[i] = random.nextInt(9) + 1;
		id += Myarray[i];
		if (i == 0) {
			id += "-";
		}
		if (i == 4) {
			id += "-";
		}
		if (i == 9) {
			id += "-";
		}
		if (i == 11) {
			id += "-";	
		}
	}
}

public String getID() {
	return id;
	}
}

