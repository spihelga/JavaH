package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application {
    GridPane grid;
    int ruutx = 20;
    int ruuty = 20;
    int numbox = 10;
    int ridu = 20;
    int veerge = 30;


    @Override
    public void start(Stage primaryStage) throws Exception {
        grid = new GridPane();
        Scene scene = new Scene(grid, veerge*ruuty, ridu*ruutx);
        primaryStage.setScene(scene);

        Box(numbox);

        primaryStage.show();
    }

    public void Box (int numbox){
        Random ran = new Random();

        for (int i = 0; i < numbox; i++){
            int x = ran.nextInt(ridu*ruutx);
            int y = ran.nextInt(veerge*ruuty);
            Rectangle ruut = new Rectangle(ruutx,ruuty);
            ruut.setFill(Color.BLUE);
            ruut.setId("ruut");
            grid.add(ruut, y, x);
            System.out.println(x + ", " + y);

            ruut.setOnMouseClicked(event -> {
                if (ruut.getId().equals("ruut")) {
                    ruut.setScaleX(0.5);
                    ruut.setScaleY(0.5);
                }
                else if (ruut.getId().equals("clicked")){
                    ruut.setScaleX(0);
                    ruut.setScaleY(0);
                }
                ruut.setId("clicked");
            });
        }
    }
}
