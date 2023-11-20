package Venturalog.cliente;

import Venturalog.funcionarios.Funcionario;
import Venturalog.utils.Pessoa;

public class Cliente extends Pessoa {
    private static String ocupacaoProfissional;
    private static String TelefoneCelular;
    private static String rua;
    private static String numero;
    private static String complemento;
    private static String bairro;
    private static String cidade;
    private static String estado;
    private static String cep;


    public void setOcupacaoProfissional() {
        ocupacaoProfissional = ocupacaoProfissional;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        TelefoneCelular = telefoneCelular;
    }

    public void setRua(String rua) {
        Cliente.rua = rua;
    }

    public void setNumero(String numero) {
        Cliente.numero = numero;
    }

    public void setComplemento(String complemento) {
        Cliente.complemento = complemento;
    }

    public void setBairro(String bairro) {
        Cliente.bairro = bairro;
    }

    public void setCidade(String cidade) {
        Cliente.cidade = cidade;
    }

    public void setEstado(String estado) {
        Cliente.estado = estado;
    }

    public void setCep(String cep) {
        Cliente.cep = cep;
    }

    public static void imprimirDadosCliente() {
        System.out.println("\nDados do Cliente:");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("E-mail: " + email);
        System.out.println("Ocupação Profissional: " + ocupacaoProfissional);
        System.out.println("Telefone: " + TelefoneCelular);
        System.out.println("Endereço: " + rua + ", " + numero  + "/ " + (complemento + ". ") + bairro + ", " + cidade + " - " + estado + ", CEP: " + cep);
    }
}