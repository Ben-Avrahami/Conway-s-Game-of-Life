import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
/**
 * A Java implementation of Conway's Game of Life.
 * This Class will hold the controller methods used for javaFX with scene builder.
 * @author Ben Avrahami
 *
 */
public class MyProjectController {

	@FXML
	private Canvas canvas;
	private GraphicsContext gc;
	private final static int SIZE=10;
	GameOfLifeLogic game= new GameOfLifeLogic(SIZE);//creates a new GameOfLifeLogic object
	//in order to change the size of the board change the number inside the SIZE final variable 
	private double cubesHeigth;
	private double cubesWidth;

	public void initialize() {
		gc = canvas.getGraphicsContext2D();
		cubesHeigth=canvas.getHeight()/game.SIZE;//height of the cubes
		cubesWidth=canvas.getWidth()/game.SIZE;//width of the cubes
		drawMat();//draws the mat 
	}

	@FXML
	void btnPressed(ActionEvent event) {
		game.nextGenMat();//calculates the matrix for the next generation
		gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());//cleans the old matrix
		drawMat();//draws the new matrix
	}


	public void drawMat() {
		for(int i=0; i<game.SIZE ;i++) {
			for (int j=0; j<game.SIZE ;j++) {
				if(game.scanMat(i,j)==0)
					gc.strokeRect(j* cubesWidth, i*cubesHeigth,  cubesWidth, cubesHeigth);//draws the empty cubes
				else 
					gc.fillRect(j* cubesWidth, i*cubesHeigth,  cubesWidth, cubesHeigth);//draws the black cubes
			}
		}
	}
}
