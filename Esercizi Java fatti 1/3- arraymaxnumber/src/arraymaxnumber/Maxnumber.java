package arraymaxnumber;

public class Maxnumber {
	public static void main(String[] args) {
		int [] findMax = {0, 14 , 6, 25, 26, 34, 13, 7, 38, 11};
		int max = findMax[0];
		for(int i = 0; i < findMax.length; i++) {
			if(max <= findMax[i]) {
				max = findMax[i];
			}
		}
		System.out.println("Il numero più grande è " + max);
	}
}
