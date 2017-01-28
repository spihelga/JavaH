package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv extends Application {

    public void start (Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setScene(scene);

        Circle ring = new Circle(15);
        Circle ring2 = new Circle(15);
        Circle ring3 = new Circle(15);

        ring.setFill(Color.WHITE);
        ring2.setFill(Color.WHITE);
        ring3.setFill(Color.WHITE);

        grid.setHgap(30);
        grid.setVgap(30);
        //grid.setGridLinesVisible(true);
        grid.add(ring, 1, 2);
        grid.add(ring2, 5, 2);
        grid.add(ring3, 1, 5);

        ring.setOnMouseMoved(event -> {
            ring.setFill(Color.BLUE);
        });

        ring2.setOnMouseMoved(event -> {
            ring2.setFill(Color.PURPLE);
        });

        ring3.setOnMouseMoved(event -> {
            ring3.setFill(Color.YELLOW);
        });

        primaryStage.show();
    }
}
