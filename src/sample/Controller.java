package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class Controller {

    @FXML
    Button btn;
    @FXML
    RadioButton t2,t3,t4;
    public void start(ActionEvent event) throws IOException {
        if(t2.isSelected ()){
            data.nuntour=2;
        }else{
            if (t3.isSelected ()){
                data.nuntour=3;
            }else {
                data.nuntour=4;
            }
        }

        ((Node) event.getSource()).getScene ().getWindow ().hide ();
        //


        //
        Parent root = FXMLLoader.load(getClass().getResource("game.fxml"));
        Stage primaryStage;
        primaryStage = new Stage (  );
        primaryStage.setTitle("Guess My Age");
        primaryStage.getIcons ().add (new Image ("image/images (2).png"));
        primaryStage.setResizable (false);
        primaryStage.setScene(new Scene (root));
        primaryStage.show();
    }

}
