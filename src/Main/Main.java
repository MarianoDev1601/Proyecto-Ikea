package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */



/**
 *
 * @author maria
 */
public class Main {
    
    public static void main(String[] args) {
        Functions func = new Functions();
        Node data = new Node(1,8,1,1,1,1);
        func.write_csv(data);
        
    }  
}
