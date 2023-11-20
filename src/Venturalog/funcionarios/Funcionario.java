package Venturalog.funcionarios;
import Venturalog.utils.Pessoa;

public class Funcionario extends Pessoa {
    private static String CargoInterno;
    private static String TelefoneCelular;
    private static String rua;
    private static String numero;
    private static String complemento;
    private static String bairro;
    private static String cidade;
    private static String estado;
    private static String cep;

    public void setCargoInterno(String CargoInterno) {
        Funcionario.CargoInterno = CargoInterno;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        TelefoneCelular = telefoneCelular;
    }

    public void setRua(String rua) {
        Funcionario.rua = rua;
    }

    public void setNumero(String numero) {
        Funcionario.numero = numero;
    }

    public void setComplemento(String complemento) {
        Funcionario.complemento = complemento;
    }

    public void setBairro(String bairro) {
        Funcionario.bairro = bairro;
    }

    public void setCidade(String cidade) {
        Funcionario.cidade = cidade;
    }

    public void setEstado(String estado) {
        Funcionario.estado = estado;
    }

    public void setCep(String cep) {
        Funcionario.cep = cep;
    }

    public static void imprimirDadosFuncionario() {
        System.out.println("\nDados do Cliente:");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("E-mail: " + email);
        System.out.println("Cargo: " + CargoInterno);
        System.out.println("Telefone: " + TelefoneCelular);
        System.out.println("Endereço: " + rua + ", " + numero  + "/ " + (complemento + ". ") + bairro + ", " + cidade + " - " + estado + ", CEP: " + cep);
    }
}