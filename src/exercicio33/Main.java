/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio33;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente cliente1 = new Cliente();
        System.out.println("Digite as informaçoes do cliente");
        System.out.println("Nome: ");
        String nome = ler.next();
        System.out.println("Idade: ");
        String idade = ler.next();
        System.out.println("CPF: ");
        String cpf = ler.next();
        try {
            cliente1.setNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
