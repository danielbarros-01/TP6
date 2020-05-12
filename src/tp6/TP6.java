/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author Dani Barros
 */
public class TP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente Barros = new Cliente("Daniel","Barros","San Luis","Calle s/n", "47497200");
        Cliente Ocaño = new Cliente("Daniela","Ocaño","Villa de Las Rosas","Calle Oscura s/n","32929212");
        Cliente Julieta = new Cliente("Julieta","Gonzalez","Dolores","Felipe Erdman","32111234");
        DirecTelefonico Traslasierra = new DirecTelefonico();
        
        Traslasierra.agregarCliente("3544562721", Barros);
        Traslasierra.agregarCliente("351554321", Ocaño);
        Traslasierra.agregarCliente("3544883322", Julieta);
        
        Traslasierra.mostraClientes();
        Traslasierra.borrarCliente("47497200");
        Traslasierra.mostraClientes();
        
    }
    
}
