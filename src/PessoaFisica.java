import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

    private String sobrenome;
    private String cpf;
    private LocalDate idade;




    public PessoaFisica(String nome, String endereco, String sobrenome, String cpf, LocalDate idade) {
        super(nome, endereco);
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }
}
