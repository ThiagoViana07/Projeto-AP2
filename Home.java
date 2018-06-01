package principal;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author vitor
 */
public class Home extends Application {
    public static Stage palcoPrincipal, palcoCadastrarProduto = new Stage();
    private static Scene telaHome, telaCadastrarProduto;
    
    
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        palcoPrincipal = primaryStage;
//        try {
            Parent fxmlhome = FXMLLoader.load(getClass().getResource("/view/TelaHome.fxml"));
            Parent fxmlTelaCadastrarProduto = FXMLLoader.load(getClass().getResource("/view/TelaCadastrarProduto.fxml"));
            telaCadastrarProduto = new Scene(fxmlTelaCadastrarProduto);
            
            telaHome = new Scene(fxmlhome);
            palcoPrincipal.setTitle("SuperMarket  Virtual");
            palcoPrincipal.getIcons().add(new Image("/imagens/logo.png"));
            palcoPrincipal.centerOnScreen();
            palcoPrincipal.setResizable(false);
            palcoPrincipal.setScene(telaHome);
            palcoPrincipal.show();
            
//        } catch (IOException ex) {
//            System.out.println("Deu erro na parada de start");
//        }
    }
    
    public static void telaCadastrarProduto (String aux){
        
        
        switch(aux){
            case "abrir":
                palcoCadastrarProduto.setScene(telaCadastrarProduto);
                palcoCadastrarProduto.setTitle("Cadastrar Produto");
                palcoCadastrarProduto.setResizable(false);
                palcoCadastrarProduto.centerOnScreen();
                palcoCadastrarProduto.show();
                break;
            case "fechar":
                palcoCadastrarProduto.close();
                break;
                
        }
    }
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
