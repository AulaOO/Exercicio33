/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio33;

/**
 *
 * @author Luis Guilherme
 */
public class CadastroCliente {
    private Cliente clientes[];

    public CadastroCliente() {
        clientes = new Cliente[10];
    }

    public CadastroCliente(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
    public void inserir(Cliente cliente) throws Exception{
        for(Cliente c: clientes){
            if(clientes.length > 10){
                throw new RepositorioException();
            }
            if(c.getCpf().equals(cliente.getCpf())){
                throw new ElementoJaExistenteException();
            }
            c = cliente;
        }
    }
    
    public void buscar(Cliente cliente) throws Exception{
        for(Cliente c: clientes){
            if(!c.dados().equals(cliente.dados())){
              throw new ElementoInexistenteException();  
            } else {
               cliente.dados();
            }
        }
    }
}
