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
    
    public List buscarTelefono(String ap){
        List<Long> listaTelefonos = new LinkedList<>(); 
        Set<Long> keys = listaClientes.keySet();
        for (Long aux : keys) {
            Cliente cliente=listaClientes.get(aux);
            if(cliente.getApellido().equals(ap)){
                System.out.println(aux);
                listaTelefonos.add(aux);
            }
        }
        return listaTelefonos;
    }
    
    public List buscarClientes(String ciudad){
        List<String> listaEncontrados = new LinkedList<>(); 
        Set<Long> keys = listaClientes.keySet();
        for (Long aux : keys) {
            Cliente cliente=listaClientes.get(aux);
            if(cliente.getCiudad().equals(ciudad)){
                String nombreCompleto = cliente.getNombre()+" "+cliente.getApellido();
                listaEncontrados.add(nombreCompleto);
            }
        }
        return listaEncontrados;
    }
    
    public void eliminarCliente(long dni){ 
        Set<Long> keys = listaClientes.keySet();
        Iterator it = keys.iterator();
        while(it.hasNext()){
            Cliente cliente=listaClientes.get(it.next());
            if(cliente.getDni()== dni){
                it.remove();
                System.out.println("ELIMINADO CORRECTAMENTE.");
                break;
            }
        }
    }
}
