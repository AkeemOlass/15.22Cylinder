import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.stage.Stage;

public class Cylinderadjustment extends Application {
   // private CylinderPane cylinderPane = new CylinderPane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Cylinder cylinder = new Cylinder(20,70,5);
        HBox hBox = new HBox();
              hBox.setSpacing(10);
              hBox.setAlignment(Pos.CENTER);
            /**  Button btEnlarge = new Button("Enlarge");
              Button btShrink = new Button("Shrink");
              hBox.getChildren().add(btEnlarge);
              hBox.getChildren().add(btShrink);


// Create and register the handler
              btEnlarge.setOnAction(
                new EnlargeHandler());*/

              BorderPane borderPane = new BorderPane();
              borderPane.setCenter(cylinder);
              borderPane.setBottom(hBox);
              BorderPane.setAlignment(hBox, Pos.CENTER);


// Create a scene and place it in the stage
              Scene scene = new Scene(borderPane, 200, 200);
              primaryStage.setTitle(
                "ControlCircle"
        );
// Set the stage title
              primaryStage.setScene(scene);
// Place the scene in the stage
              primaryStage.show();
// Display the stage
        borderPane.widthProperty().addListener(ov ->
                cylinder.setRadius(borderPane.getWidth()/4)
        );

        borderPane.heightProperty().addListener(ov ->
                cylinder.setHeight(borderPane.getHeight()/4)
        );

    }

    private class EnlargeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {

        }
    }
}

/**class CylinderPane extends StackPane{
    private Cylinder cylinder = new Cylinder(20,70,5);
    public CylinderPane() {
              getChildren().add(cylinder);
              //cylinder.setStroke(Color.BLACK);
             // cylinder.setFill(Color.WHITE);\
            }
    public void setR(double radius){
        cylinder.setRadius(radius);
            }
    public void setH(double  height){
        cylinder.setHeight(height);
    }
*/



