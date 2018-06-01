/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author vitor
 */
public class TelaProdutoController implements Initializable {
    
    

    @FXML
    private ImageView h_image;
    @FXML
    private AnchorPane ancho_pane_adicionar_carrinho;
    
    @FXML
    private Button btn_adicionar_ao_carrinho;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void favoritos (MouseEvent event) {
        //Pegar ID do produto e adicionar aos seus favoritos
        if (event.getTarget() == h_image){
            if (h_image.getBlendMode() == BlendMode.EXCLUSION){
                h_image.setBlendMode(BlendMode.SRC_OVER);
            } else {
                h_image.setBlendMode(BlendMode.EXCLUSION);
            }
        }
    }

    @FXML
    private void passarMouseAdicionarCarrinhoSaida (MouseEvent event) {
        if (event.getTarget() == ancho_pane_adicionar_carrinho){
            ancho_pane_adicionar_carrinho.setStyle("-fx-background-color: transparent;"
                    + "-fx-border-color: #1b9392;");
            btn_adicionar_ao_carrinho.setStyle("-fx-text-fill: #1b9392;"
                    + "-fx-background-color: transparent;");
        }
    }

    @FXML
    private void passarMouseAdicionarCarrinho (MouseEvent event) {
        
        if (event.getTarget() == ancho_pane_adicionar_carrinho){
            ancho_pane_adicionar_carrinho.setStyle("-fx-background-color: #1b9392;"
                + "-fx-border-color: transparent;");
            
            btn_adicionar_ao_carrinho.setStyle("-fx-text-fill: white;"
                + "-fx-background-color: transparent;");
        }
    }
    
    
    @FXML
    protected void addFavoritos(MouseEvent e){
        System.out.println("Adicionado ao carrinho");
        
    }
    
}
