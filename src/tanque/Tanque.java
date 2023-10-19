/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tanque;

/**
 *
 * @author Lenovo
 */
public class Tanque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ancho = 30;
        int altura = 30;
        
        int tanque1X = 13;
        int tanque1Y = 28;
        int tanque2X = 12;
        int tanque2Y = 29;
        int tanque3X = 13;
        int tanque3Y = 29;
        int tanque4X = 14; 
        int tanque4Y = 29;
        
        char caracter = '0';
        char caracterTanque = '0';
        for (int i =0; i<altura; i++){
            for(int j =0; j <ancho; j++){
                if(i==tanque1X && j==tanque1Y) System.out.print(caracterTanque + "  ");
                else if(i==tanque2X && j==tanque2Y) System.out.print(caracterTanque + "  ");
                else if(i==tanque3X && j==tanque3Y) System.out.print(caracterTanque + "  ");
                else if(i==tanque4X && j==tanque4Y) System.out.print(caracterTanque + "  ");
                else.System.out.print(caracter + "   ");           
            }
            System.out.print("\n");
        }
    }
    
}
