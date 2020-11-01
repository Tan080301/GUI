package javagui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 *
 * @author Yonatan Dwi Perkasa
 */
public class JavaGui extends Application {
    
@Override            
  
public void start(Stage stage) {

Text text1 = new Text("Nama     :");
Text text2 = new Text("Telepon  :");
Text text3 = new Text("Alamat   :");
Text text4 = new Text();
Text text5 = new Text();
Text text6 = new Text();
Text text7 = new Text();
TextField tField1 = new TextField();
TextField tField2 = new TextField();
TextArea tArea1 = new TextArea();

Button btn1 = new Button("Kirim");
Button btn2 = new Button("Hapus");
        
GridPane position = new GridPane();
position.setMinSize(400, 300);
position.setPadding(new Insets(100,100,100,100));
position.setVgap(10);
position.setHgap(10);
position.setAlignment(Pos.CENTER);

position.add(text1, 0, 0);
position.add(tField1, 1, 0);
position.add(text2, 0, 1);
position.add(tField2, 1, 1);
position.add(text3, 0, 2);
position.add(tArea1, 1, 2);
position.add(btn1, 0, 3);
position.add(btn2, 1, 3);
position.add(text5, 1, 5);
position.add(text6, 1, 6);
position.add(text7, 1, 7);

btn1.setOnAction(value -> {
    text5.setText(text1.getText() + "   " + tField1.getText());
    text6.setText(text2.getText() + "   " + tField2.getText());
    text7.setText(text3.getText() + "   " + tArea1.getText());
});

btn2.setOnAction(value -> {
    tField1.setText("");
    tField2.setText("");
    tArea1.setText("");
    text5.setText("");
    text6.setText("");
    text7.setText("");
});

Scene scene1 = new Scene(position);
stage.setTitle("Form Pendaftaran Seminar Online");
    stage.setScene(scene1);
        stage.show();
}
public static void main(String args[]){
launch(args);
    }
}