/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballero.practico6;

/**
 *
 * @author Usuario
 */
public class CaballeroPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        DirectorioTelefonico dir = new DirectorioTelefonico();
        Cliente c1 = new Cliente(40909217L,"Guido","Caballero","San Luis","Juana Koslay");
        Cliente c2 = new Cliente(31645696L,"Juan","Perez","Neuquen","Neuquen");
        Cliente c3 = new Cliente(22249012L,"Mauri","Velazquez","Merlo","Merlito");
        Cliente c4 = new Cliente(26192283L,"Astor","Perez","San Luis","La Punta");
        Cliente c5 = new Cliente(64420420L,"Renzo","Gomez","Villa Mercedes","Calle Angosta");
        dir.agregarCliente(2664326822L, c1);
        dir.agregarCliente(2664326823L, c2);
        dir.agregarCliente(2664326824L, c3);
        dir.agregarCliente(2664326825L, c4);
        dir.agregarCliente(2664326826L, c5);
        
        System.out.println(dir.buscarClientes("San Luis").toString());
        dir.eliminarCliente(40909217L);
        System.out.println(dir.buscarClientes("San Luis").toString());
        dir.agregarCliente(2664326822L, c1);
        System.out.println(dir.buscarTelefono("Perez").toString());
    
    }
    
}
