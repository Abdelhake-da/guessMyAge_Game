package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class gameSe {

    @FXML
    TextField usertxt;
    @FXML
    ImageView imagev,imagev1,up ,down;
    @FXML
    Label affi,winorlose;
    @FXML
    Button play,guess;

    int num= 0,numt=0;
    public void START(){
        String k=data.imageurl[data.getnum ()];

        imagev.setImage (new Image (k));
        guess.setDisable (false);
        usertxt.setDisable (false);
        imagev1.setVisible (false);
        play.setDisable (true);
        winorlose.setText ("");
        up.setVisible (false);
        down.setVisible (false);
        affi.setText ("");
        usertxt.requestFocus ();


    }
    public void tret() {


        numt+=1;
        if(numt<=data.nuntour){

            try {
                num = Integer.parseInt (usertxt.getText ( ));
                affi.setText (usertxt.getText ());
                if(num==data.age[data.num]){
                    up.setVisible (false);
                    down.setVisible (false);
                    winorlose.setText ("Great , you guessed it");
                    guess.setDisable (true);
                    usertxt.setDisable (true);
                    play.setDisable (false);
                    numt=0;
                    play.requestFocus ();

                }else{
                    if(num<data.age[data.num]){
                        up.setVisible (true);
                        down.setVisible (false);

                    }else{
                        down.setVisible (true);
                        up.setVisible (false);
                    }
                }
                usertxt.setText ("");
                usertxt.requestFocus ();

                if((numt)==data.nuntour){
                    winorlose.setText ("Try again");
                    guess.setDisable (true);
                    usertxt.setDisable (true);
                    play.setDisable (false);
                    usertxt.setText ("");
                    numt=0;
                    play.requestFocus ();
                }

            }catch (Exception ex){
                numt-=1;
                usertxt.setText ("");
                usertxt.requestFocus ();
            }



        }}
        public void menu(ActionEvent event)throws IOException {
            ((Node) event.getSource()).getScene ().getWindow ().hide ();
            //


            //
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Stage primaryStage;
            primaryStage = new Stage (  );
            primaryStage.setTitle("Guess My Age");
            primaryStage.getIcons ().add (new Image ("image/images (2).png"));
            primaryStage.setResizable (false);
            primaryStage.setScene(new Scene (root));
            primaryStage.show();
        }


}
