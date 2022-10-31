import java.util.Random;

public class GameOfLifeLogic {
	public final int SIZE;
	private static final int ALIVE= 1;
	private static final int DEAD= 0;
	private int[][] lifeMatrix;//the array that will be used thorugh the game
	private int[][] copyMatrix;




	public GameOfLifeLogic(int size) {
		SIZE=size;
		lifeMatrix= new int [SIZE][SIZE];
		copyMatrix= new int [SIZE][SIZE];
		Random rand = new Random();
		int randomValue;
		for(int i=0; i<SIZE ;i++) {
			for (int j=0; j<SIZE ;j++) {
				randomValue = rand.nextInt(2);
				lifeMatrix[i][j]=randomValue;
			}
		}
	}


	public int scanMat(int i, int j) {
		return lifeMatrix[i][j];
	}

	public void nextGenMat() {
		int neighbors;
		copyLifeMat();
		for(int i=0; i<SIZE ;i++) {
			for (int j=0; j<SIZE ;j++) {
				neighbors=0;
				neighbors=calculateAliveNeighbors(i,j);
				if (lifeMatrix[i][j]==ALIVE) {
					if (neighbors==2 || neighbors==3 )
						lifeMatrix[i][j]=ALIVE;
					if (neighbors<2 || neighbors>3)
						lifeMatrix[i][j]=DEAD;
				}
				else if (lifeMatrix[i][j]==DEAD) {
					if (neighbors==3)
						lifeMatrix[i][j]=ALIVE;
				}
			}

		}
	}
	public int calculateAliveNeighbors(int i, int j) {
		int neighbors=0;
		int left=j-1;
		int up=i-1;
		int right=j+1;
		int down=i+1;
		if (left>=0) {//will check the three left neighbors
			neighbors+=copyMatrix[i][left];
			if (up>=0) {
				neighbors+=copyMatrix[up][left];
			}
			if(down<SIZE) {
				neighbors+=copyMatrix[down][left];
			}
		}
		if (right<SIZE) {//will check the three right neighbors
			neighbors+=copyMatrix[i][right];
			if (up>=0) {
				neighbors+=copyMatrix[up][right];
			}
			if(down<SIZE) {
				neighbors+=copyMatrix[down][right];
			}
		}
		if (up>=0) {
			neighbors+=copyMatrix[up][j];
		}
		if (down<SIZE) {
			neighbors+=copyMatrix[down][j];
		}
		return neighbors;
	}

	private void copyLifeMat() {
		for(int i=0; i<SIZE ;i++) 
			for (int j=0; j<SIZE ;j++) 
				copyMatrix[i][j]=lifeMatrix[i][j];
	}
}
