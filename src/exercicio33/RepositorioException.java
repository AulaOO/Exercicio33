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
public class RepositorioException extends Exception{

    @Override
    public String getMessage() {
        return "Nao é possível inserir mais clientes";
    }
    
    
}
