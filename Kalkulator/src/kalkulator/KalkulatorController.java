/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Yonatan Dwi Perkasa
 */
public class KalkulatorController implements Initializable {

    @FXML
    private TextArea display;
    @FXML
    private Button BtSatu;
    @FXML
    private Button BtDua;
    @FXML
    private Button BtTiga;
    @FXML
    private Button BtTambah;
    @FXML
    private Button BtEmpat;
    @FXML
    private Button BtLima;
    @FXML
    private Button BtEnam;
    @FXML
    private Button BtKurang;
    @FXML
    private Button BtTujuh;
    @FXML
    private Button BtDelapan;
    @FXML
    private Button BtSembilan;
    @FXML
    private Button BtKali;
    @FXML
    private Button BtHapus;
    @FXML
    private Button BtEnter;
    @FXML
    private Button BtNol;

    private int angka1 = 0;
    private String operasi = "netral";
    private int angka2 = 0;
    private int hasil;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
        @FXML
        private void buttonClicked(ActionEvent event) {
        if(event.getSource()== BtNol){ //cek apakah tombol yang ditekan adalah 0
        if(!display.getText().isEmpty())
        {                               //cek, apakah display masih kosong
        display.setText(display.getText() + "0"); //jika tidak kosong, tambahkan 0
        }
    }
        if(event.getSource()== BtSatu){
        display.setText(display.getText() + "1");
        }else if (event.getSource() == BtDua) {
        display.setText(display.getText() + "2");
        }else if (event.getSource() == BtTiga) {
        display.setText(display.getText() + "3");
        }else if (event.getSource() == BtEmpat) {
        display.setText(display.getText() + "4");
        }else if (event.getSource() == BtLima) {
        display.setText(display.getText() + "5");
        }else if (event.getSource() == BtEnam) {
        display.setText(display.getText() + "6");
        }else if (event.getSource() == BtTujuh) {
        display.setText(display.getText() + "7");
        }else if (event.getSource() == BtDelapan) {
        display.setText(display.getText() + "8");
        }else if (event.getSource() == BtSembilan) {
        display.setText(display.getText() + "9");
        }else if (event.getSource() == BtNol) {
        display.setText(display.getText() + "0");
        }else if (event.getSource() == BtHapus) {
        display.setText("");
        }else if (event.getSource() == BtTambah) {
        angka1 = Integer.parseInt(display.getText());
        operasi = "tambah";
        display.setText("");
        }else if (event.getSource() == BtKurang) {
        angka1 = Integer.parseInt(display.getText());
        operasi = "kurang";
        display.setText("");
        }else if (event.getSource() == BtKali) {
        angka1 = Integer.parseInt(display.getText());
        operasi = "kali";
        display.setText("");
        }else if (event.getSource() == BtEnter) {
        angka2 = Integer.parseInt(display.getText());
        if (operasi.equals("tambah")) {
        hasil = angka1 + angka2;
        }
        if (operasi.equals("kurang")) {
        hasil = angka1 - angka2;
        }
        if (operasi.equals("kali")) {
        hasil = angka1 * angka2;
        }
        display.setText(String.valueOf(hasil));
        operasi = "netral";
        } 
    }
}

        
