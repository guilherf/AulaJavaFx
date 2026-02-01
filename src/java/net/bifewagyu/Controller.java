package net.bifewagyu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Date;

public class Controller {

    @FXML
    private Label meuTexto;
    private Button meuBotao;


    @FXML
    private void clicouButao(ActionEvent event){
        Date date = new Date();
        meuTexto.setText(date.toString());

    }


}
