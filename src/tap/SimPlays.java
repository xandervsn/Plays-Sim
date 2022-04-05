package tap;

public class SimPlays {
	long sum = 0;
	int given = 99999;
	String word;
	char letter;
	
	public SimPlays() {

			
			
			for(int j = 1; j <= given; j++) {
				boolean found = false;
				String written = "";
				word = " ";
				
				for(int i = 0; !found; i++) {
					double random = Math.random()*32;
					int digit = (int) (random - (random % 1));
					if(digit >= 0 && digit <= 25) {
						digit += 97;
						letter = (char)digit;
					}
					switch (digit) {
		            case 26:  letter = '?';
		                     break;
		            case 27:  letter = '-';
		                     break;
		            case 28:  letter = '.';
		                     break;
		            case 29:  letter = ',';
		                     break;
		            case 30:  letter = '\n';
		                     break;
		            case 31:  letter = ' ';
		                     break;
					}
					
					written += letter;
					if(written.contains(word)) {
						found = true;
						sum += i;
					}
				}
			}
			System.out.println(sum/(given));
		}
	
	public static void main(String[] args) throws Exception {
		new SimPlays();
	}

}
