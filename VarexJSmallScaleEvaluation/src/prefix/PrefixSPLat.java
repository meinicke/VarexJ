package prefix;
import Starter.ISPLatEvaluation;
import Starter.SPLat;

public class PrefixSPLat implements ISPLatEvaluation {

	int i = 0;
	public void run(int value) {
		int current = 0;
		if (value == current) calculate();
		if (SPLat.get(1)) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (SPLat.get(2)) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (SPLat.get(3)) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (SPLat.get(4)) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (SPLat.get(5)) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (SPLat.get(6)) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (SPLat.get(7)) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (SPLat.get(8)) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (SPLat.get(9)) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (SPLat.get(10)){i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		
	}

	private void calculate() {
		int maxPrefix = 100_000;
		for (int j = 0; j < maxPrefix; j++) {System.out.print("");}
	}
	
}
