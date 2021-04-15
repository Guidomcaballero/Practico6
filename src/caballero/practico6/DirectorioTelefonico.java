/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballero.practico6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class DirectorioTelefonico {
    private Map<Long,Cliente> listaClientes = new HashMap<>(); 
    
    
    public void agregarCliente(Long tel, Cliente c){
        this.listaClientes.put(tel, c);
    }
    
    public Cliente buscarCliente(Long tel){
        return listaClientes.get(tel);
    }
    
    public boolean buscarTelefono(String ap){
        
        return true;
    }
    
    public List buscarClientes(String ciudad){
        List<String> aux = new LinkedList<>(); 
        Set<Long> keys = listaClientes.keySet();
        Iterator it = keys.iterator();
        while(it.hasNext()){
            Cliente cliente=listaClientes.get(it.next());
            if(cliente.getCiudad().equals(ciudad)){
                String nombreCompleto = cliente.getNombre()+" "+cliente.getApellido();
                aux.add(nombreCompleto);
            }
        }
        return aux;
    }
    
    public void eliminarCliente(long dni){
        
    }
}
