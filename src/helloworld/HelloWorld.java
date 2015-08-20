/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author fernandes
 */
public class HelloWorld extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
//        File f = new File("C:\\Users\\fernandes\\Documents\\NetBeansProjects\\HelloWorld\\dist\\FXMLDocument.fxml");
//        System.out.println(f.toURL());
        URL u =new URL("file:/C:/Users/fernandes/Documents/NetBeansProjects/HelloWorld/dist/FXMLDocument.fxml");
//        Parent root = FXMLLoader.load(u);
        Parent root = FXMLLoader.load(getClass().getResource("./FXMLDocument.fxml"));        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
//        javax.swing.JOptionPane.showMessageDialog(null, "teste");
    }
    
}
