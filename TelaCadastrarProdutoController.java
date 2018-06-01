/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author vitor
 */
public class TelaCadastrarProdutoController implements Initializable {
    private boolean imagemBoolean;
    @FXML
    private TextField textFieldNome, textFieldPreco;
    
    
    @FXML
    private TextArea textAreaDescricao;
    @FXML
    private Label falha, sucesso;
    


    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        falha.setVisible(false);
        sucesso.setVisible(false);
    }    
    
    @FXML
    public void cancelarCadastro(ActionEvent e){
        principal.Home.telaCadastrarProduto("fechar");
    }
    
    @FXML
    protected void adicionar(ActionEvent e){
        //Pegar dados do produto e jogar na lista
        if (imagemBoolean == true){
            sucesso.setVisible(true);
            fade(sucesso);
        } else {
            falha.setVisible(true);
            fade(falha);
        }
        
        
    }
    
    protected void fade(Label label){
        FadeTransition ft = new FadeTransition(Duration.seconds(3));
        ft.setNode(label);
        ft.setFromValue(1);
        ft.setToValue(0);
        ft.play();
    }
    
    
    //Adicionar Imagem
    @FXML
    protected void addImage(){
        FileChooser fc = new FileChooser();
        File arquivoSelecionado = fc.showOpenDialog(null);
        
        if (arquivoSelecionado != null){
            System.out.println(arquivoSelecionado.getAbsolutePath());
        } else{
            System.out.println("Arquivo invalido");
        }
    }
    
}
