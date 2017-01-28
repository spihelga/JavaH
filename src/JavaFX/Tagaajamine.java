package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Random ran = new Random();
        int x = ran.nextInt(500);
        int y = ran.nextInt(500);

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);

        Circle ring = new Circle(50, Color.GOLD);
        ring.setCenterX(x);
        ring.setCenterY(y);
        pane.getChildren().add(ring);

        ring.setOnMouseMoved(event -> {
            ring.setCenterX(Math.random()*450);
            ring.setCenterY(Math.random()*450);
        });

        primaryStage.show();

    }
}
