/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.GeradorID;
import models.Produto;


/**
 * FXML Controller class
 *
 * @author vitor
 */
public class TelaHomeController implements Initializable {
    private Stage aux;
    
    @FXML
    private Label labelNome, labelPreco;
    
    @FXML
    private Pane sombra;
    
    @FXML
    private TextField textFieldBusca;
    
    @FXML
    private AnchorPane promocoes, ancho_pane_adicionar_carrinho, menu,
            ancho_pane_adicionar_carrinho1, ancho_pane_adicionar_carrinho2,ancho_pane_adicionar_carrinho3,
            ancho_pane_adicionar_carrinho4;
    
    @FXML
    private ImageView fecharMenu, abrirMenu, h_image, h_image1, h_image2,
            h_image3, h_image4;

    
    @FXML
    private Button btn_adicionar_ao_carrinho, btn_adicionar_ao_carrinho1, 
            btn_adicionar_ao_carrinho2, btn_adicionar_ao_carrinho3,
            btn_adicionar_ao_carrinho4;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarPromocoes();
    }  


    //Ao passar o mouse sobre o botão de "Adicionar ao carrinho"
    // inverterá a cor do texto e do fundo
    @FXML
    void adicionarAoCarrinho(MouseEvent event) {
        //00
        if (event.getTarget() == ancho_pane_adicionar_carrinho){
            ancho_pane_adicionar_carrinho.setStyle("-fx-background-color: #1b9392;"
                + "-fx-border-color: transparent;");
            
            btn_adicionar_ao_carrinho.setStyle("-fx-text-fill: white;"
                + "-fx-background-color: transparent;");
        }
        //01
        if (event.getTarget() == ancho_pane_adicionar_carrinho1){
            ancho_pane_adicionar_carrinho1.setStyle("-fx-background-color: #1b9392;"
                + "-fx-border-color: transparent;");
            
            btn_adicionar_ao_carrinho1.setStyle("-fx-text-fill: white;"
                + "-fx-background-color: transparent;");
        }
        //02
        if (event.getTarget() == ancho_pane_adicionar_carrinho2){
            ancho_pane_adicionar_carrinho2.setStyle("-fx-background-color: #1b9392;"
                + "-fx-border-color: transparent;");
            
            btn_adicionar_ao_carrinho2.setStyle("-fx-text-fill: white;"
                + "-fx-background-color: transparent;");
        }
        //03
        if (event.getTarget() == ancho_pane_adicionar_carrinho3){
            ancho_pane_adicionar_carrinho3.setStyle("-fx-background-color: #1b9392;"
                + "-fx-border-color: transparent;");
            
            btn_adicionar_ao_carrinho3.setStyle("-fx-text-fill: white;"
                + "-fx-background-color: transparent;");
        }
        //04
        if (event.getTarget() == ancho_pane_adicionar_carrinho4){
            ancho_pane_adicionar_carrinho4.setStyle("-fx-background-color: #1b9392;"
                + "-fx-border-color: transparent;");
            
            btn_adicionar_ao_carrinho4.setStyle("-fx-text-fill: white;"
                + "-fx-background-color: transparent;");
        }
       
            
    }
    
    @FXML
    protected void adicionarAoCarrinhoSaida(MouseEvent event){
        //00
        if (event.getTarget() == ancho_pane_adicionar_carrinho){
            ancho_pane_adicionar_carrinho.setStyle("-fx-background-color: transparent;"
                    + "-fx-border-color: #1b9392;");
            btn_adicionar_ao_carrinho.setStyle("-fx-text-fill: #1b9392;"
                    + "-fx-background-color: transparent;");
        }
        
        //01
        if (event.getTarget() == ancho_pane_adicionar_carrinho1){
            ancho_pane_adicionar_carrinho1.setStyle("-fx-background-color: transparent;"
                    + "-fx-border-color: #1b9392;");
            btn_adicionar_ao_carrinho1.setStyle("-fx-text-fill: #1b9392;"
                    + "-fx-background-color: transparent;");
        }
        
        //02
        if (event.getTarget() == ancho_pane_adicionar_carrinho2){
            ancho_pane_adicionar_carrinho2.setStyle("-fx-background-color: transparent;"
                    + "-fx-border-color: #1b9392;");
            btn_adicionar_ao_carrinho2.setStyle("-fx-text-fill: #1b9392;"
                    + "-fx-background-color: transparent;");
        }
        
        //03
        if (event.getTarget() == ancho_pane_adicionar_carrinho3){
            ancho_pane_adicionar_carrinho3.setStyle("-fx-background-color: transparent;"
                    + "-fx-border-color: #1b9392;");
            btn_adicionar_ao_carrinho3.setStyle("-fx-text-fill: #1b9392;"
                    + "-fx-background-color: transparent;");
        }
        
        //04
        if (event.getTarget() == ancho_pane_adicionar_carrinho4){
            ancho_pane_adicionar_carrinho4.setStyle("-fx-background-color: transparent;"
                    + "-fx-border-color: #1b9392;");
            btn_adicionar_ao_carrinho4.setStyle("-fx-text-fill: #1b9392;"
                    + "-fx-background-color: transparent;");
        }
    }
     
    @FXML
    void menu(MouseEvent event) {
        
        if (event.getTarget() == abrirMenu){
            menu.setVisible(true);
            abrirMenu.setVisible(false);
            promocoes.toBack();
        } else if(event.getTarget() == fecharMenu){
            menu.setVisible(false);
            abrirMenu.setVisible(true);
            promocoes.toFront();
        }
    }
    
    
    //INICIO - Adicionar ou remover dos favoritos
    @FXML
    void favoritos(MouseEvent event) {
        
        //00
        if (event.getTarget() == h_image){
            if (h_image.getBlendMode() == BlendMode.EXCLUSION){
                h_image.setBlendMode(BlendMode.SRC_OVER);
            } else {
                h_image.setBlendMode(BlendMode.EXCLUSION);
            }
        }
        //01
        if (event.getTarget() == h_image1){
            if (h_image1.getBlendMode() == BlendMode.EXCLUSION){
                h_image1.setBlendMode(BlendMode.SRC_OVER);
            } else {
                h_image1.setBlendMode(BlendMode.EXCLUSION);
            }
        }
        //02
        if (event.getTarget() == h_image2){
            if (h_image2.getBlendMode() == BlendMode.EXCLUSION){
                h_image2.setBlendMode(BlendMode.SRC_OVER);
            } else {
                h_image2.setBlendMode(BlendMode.EXCLUSION);
            }
        }
        //03
        if (event.getTarget() == h_image3){
            if (h_image3.getBlendMode() == BlendMode.EXCLUSION){
                h_image3.setBlendMode(BlendMode.SRC_OVER);
            } else {
                h_image3.setBlendMode(BlendMode.EXCLUSION);
            }
        }
        //04
        if (event.getTarget() == h_image4){
            if (h_image4.getBlendMode() == BlendMode.EXCLUSION){
                h_image4.setBlendMode(BlendMode.SRC_OVER);
            } else {
                h_image4.setBlendMode(BlendMode.EXCLUSION);
            }
        } 
    }
    //FIM - Adicionar ou remover dos favoritos
    
    
    @FXML
    protected void abrirDescricaoProduto(MouseEvent event){
        sombra.setDisable(false);
        sombra.setVisible(true);
        try {
            Stage produto = new Stage();
            
            Parent fxmlProduto = FXMLLoader.load(getClass().getResource("/view/TelaProduto.fxml"));
            Scene telaProduto = new Scene(fxmlProduto);
            produto.initStyle(StageStyle.TRANSPARENT);
            produto.setTitle("Nome produto");
            produto.setScene(telaProduto);
            produto.setResizable(false);
            produto.centerOnScreen();
            aux = produto;
            produto.show();
            
        } catch (IOException ex) {
            System.out.println("Erro na iniciação da tela do produto");
        }
        
        
    }
    
    @FXML
    protected void tirarSombra(MouseEvent e){
        sombra.setDisable(true);
        sombra.setVisible(false);
        aux.close();
    }
    
    
    
    @FXML
    protected void cadastrarProduto(){
        principal.Home.telaCadastrarProduto("abrir");
    }
    
    protected void carregarPromocoes(){
        addProduto();
        labelNome.setText(b.getNome());
        labelPreco.setText(b.getPreco());
        
    }
    
    Produto b = new Produto();
    public void addProduto(){
        
        b.setNome("BEBIDA");
        b.setPreco("9,50");
        b.setDescricao("MASSA DMS");
        b.setId(GeradorID.GeradorID());
    }
}
