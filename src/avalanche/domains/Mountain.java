package avalanche.domains;

public class Mountain {
	
	public static final int ROCKS_PER_LINE = 32;
	
	private Rock rocks[][];
	private int currentLine;
	
	
	public static Mountain ofDimAndSpeed(int startingHeight, int[] dims, int[] speeds) {
		Mountain mountain = new Mountain();
		mountain.rocks = new Rock[dims.length][ROCKS_PER_LINE];
		mountain.currentLine = 0;
		for (int i = 0; i < dims.length; i++ ) {
			for (int j = 0; j < ROCKS_PER_LINE; j++) {
				mountain.rocks[i][j] = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(j * dims[0] + dims[0]/2, startingHeight - (dims[i] /2), dims[i], dims[i]), speeds[i]);
				
			} startingHeight += dims[i]/2;
		} return mountain;
	}
	
	public int remainingLinesCount() {
		return rocks.length - currentLine;
		
	}
	
	public int rocksCountFor(int ligne) {
		return rocks[ligne].length;
	}
	
	public Rock rock(int i, int j) {
		return rocks[i][j];
	}
	
//	public Rock fallNext() {
//	
//	}

}
