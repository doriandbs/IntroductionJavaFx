package introjavafx;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {
/*
    public static void main(String[] args){

    }

*/
    @Override
    public void start(Stage firstPage) throws Exception {

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


        new Thread(()-> {
            try {
                Thread.sleep(5000);
                Platform.runLater(() -> secondPage.hide());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();

    }
}
