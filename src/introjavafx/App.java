package introjavafx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class App extends Application {
/*
    public static void main(String[] args){

    }

*/  private int count = 0;
    private Label label;

    private Button addOne;
    private Button remOne;
   @Override
    public void start(Stage mainScreen) throws Exception {
        /*
        firstPage.setTitle("Mon premier programme");
        firstPage.setWidth(500);
        firstPage.setHeight(200);
        firstPage.show();
        firstPage.centerOnScreen();



        Stage secondPage = new Stage();
        secondPage.setTitle("Deuxieme page");
        secondPage.setWidth(400);
        secondPage.setHeight(200);
        secondPage.show();
        secondPage.centerOnScreen();
        //thread de java fx
        //Thread.sleep(3000)

        new Thread(()-> {
            try {
                Thread.sleep(3000); //thread de java
                Platform.runLater(() -> secondPage.hide());//acceder au thread de javafx -> Utiliser Plateform.runLater
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();
*/
        mainScreen.setTitle("Compteur de click");
       //StackPane root = new StackPane(); //plateau


      // Rectangle rectangle = new Rectangle(500,200, Color.CYAN);
       //Label label = new Label("Coucou");
       //root.getChildren().add(rectangle);
       //root.getChildren().add(label);
       //root.getChildren().add(new Background(Color.RED));
       VBox root = new VBox(10);
       root.setAlignment(Pos.CENTER); //modifier position
       root.setPadding(new Insets(25)); //espacement
       ImageView addImageView = new ImageView(getClass().getResource("/resources/images/plus.png").toString());
       ImageView remImageView = new ImageView(getClass().getResource("/resources/images/moins.png").toString());

       label= new Label("Compteur = 0");
       addOne = new Button("Ajouter 1");
       remOne = new Button("Retirer 1");
       addOne.setOnAction(( e)-> updateLabel(++count));
       addOne.setMinWidth(100);
       addOne.setGraphic(addImageView);


       remOne.setOnAction(( e)-> updateLabel(--count));
       remOne.setMinWidth(100);
       remOne.setGraphic(remImageView);

       root.getChildren().addAll(label, addOne, remOne);
       Scene scene = new Scene(root, 600, 300);

       mainScreen.setScene(scene);

       mainScreen.show();

   }

    private void updateLabel(int count) {
        label.setText("Bouton cliqué : " + count + " fois");
    }
}
