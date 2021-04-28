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
 * @author Guido Caballero
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
        for (Long key : keys) {
            Cliente cliente=listaClientes.get(key);
            if(cliente.getApellido().equals(ap)){
                System.out.println(key);
                listaTelefonos.add(key);
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
    public Cliente eliminarCliente(long dni){ 
        Cliente eliminado = new Cliente();
        Set<Long> keys = listaClientes.keySet();
        Iterator it = keys.iterator();
        while(it.hasNext()){
            Cliente c = listaClientes.get(it.next());
            if(c.getDni()== dni){
                eliminado = c;
                it.remove();
                break;
            }
        }
        return eliminado;
    }
    
    
    public Cliente buscarDni(Long dni){ 
        Set<Long> keys = listaClientes.keySet();
        Long keyAux =0L;
        for (Long aux : keys) {
            Cliente cliente=listaClientes.get(aux);
            if(cliente.getDni()== dni)
                keyAux = aux;
        }
        return listaClientes.get(keyAux);
    }
    public Long buscaClave(Long dni){
        Set<Long> keys = listaClientes.keySet();
        Long keyAux =0L;
        for (Long aux : keys) {
            Cliente cliente=listaClientes.get(aux);
            if(cliente.getDni()== dni)
                keyAux = aux;
        }
        return keyAux;
    }
    
    
    public Map<Long, Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(Map<Long, Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
}
