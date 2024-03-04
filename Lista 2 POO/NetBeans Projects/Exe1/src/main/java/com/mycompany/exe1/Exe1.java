/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe1;

/**
 *
 * @author Admin
 */
public class Exe1 {

    public static class Cliente {

        private String nome;
        private String endereco;
        private String cep;
        private String cpf;

        // Construtor
        public Cliente(String nome, String endereco, String cep, String cpf) {
            this.nome = nome;
            this.endereco = endereco;
            this.cep = cep;
            this.cpf = cpf;
        }

        // Métodos de acesso (getters e setters)
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        // Método para validar CPF usando regex
        public static boolean validaCPF(String cpf) {
            // Regex para validar CPF no formato "XXX.XXX.XXX-XX" onde X é um dígito
            String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
            return cpf.matches(regex);
        }
    }

    public static void main(String[] args) {
        // Dados do cliente (simulando entrada do usuário)
        String nome = "João da Silva";
        String endereco = "Rua ABC, 123";
        String cep = "12345-678";
        String cpf = "123.456.789-10";

        // Validando CPF
        if (Cliente.validaCPF(cpf)) {
            // Criando o objeto cliente
            Cliente cliente = new Cliente(nome, endereco, cep, cpf);

            // Exibindo os dados do cliente
            System.out.println("Cliente cadastrado:");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("CEP: " + cliente.getCep());
            System.out.println("CPF: " + cliente.getCpf());
        } else {
            System.out.println("CPF inválido!");
        }
    }
}
