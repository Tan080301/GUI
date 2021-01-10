/*
2 * To change this license header, choose License Headers in Project Properties.
3 * To change this template file, choose Tools | Templates
4 * and open the template in the editor.
5 */
 package bukualamat;

 import java.io.IOException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javafx.application.Application;
 import javafx.fxml.FXMLLoader;
 import javafx.scene.Scene;
 import javafx.scene.layout.AnchorPane;
 import javafx.scene.layout.BorderPane;
 import javafx.stage.Stage;

 /**
19 *
20 * @author Yonatan
21 */
public class BukuAlamat extends Application {

 //variabel kelas
private Stage stageAplikasi;
private BorderPane rootAplikasi;

 @Override
public void start(Stage primaryStage){
this.stageAplikasi = primaryStage;
this.stageAplikasi.setTitle("Buku Alamat");

 initGuiKerangka(); //fungsi untuk inisialisasi node dari Guikerangka.fxml
 initViewBukuAlamat();//fungsi inisialisasi node dari viewBukuAlamat
 }

 /**
38 * @param args the command line arguments
39 */
public static void main(String[] args) {
launch(args);
 }

 private void initGuiKerangka() {
try {
 FXMLLoader loader = new FXMLLoader();
 loader.setLocation(BukuAlamat.class.getResource("view/GuiKerangka.fxml"));
 rootAplikasi = (BorderPane)loader.load();

 Scene sceneAplikasi = new Scene(rootAplikasi);
 stageAplikasi.setScene(sceneAplikasi);
stageAplikasi.show();
 } catch (IOException ex) {
 Logger.getLogger(BukuAlamat.class.getName()).log(Level.SEVERE, null, ex);
 }
}

private void initViewBukuAlamat() {
 try {
FXMLLoader loader = new FXMLLoader();
 loader.setLocation(BukuAlamat.class.getResource(
"view/viewBukuAlamat.fxml"));
 AnchorPane guiIsi = (AnchorPane)loader.load();
 rootAplikasi.setCenter(guiIsi);
} catch (IOException ex) {
 Logger.getLogger(BukuAlamat.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
}
