public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String areaDeAtividade;
    private String cnae;

    public PessoaJuridica(String nome, String endereco, String cnpj, String areaDeAtividade, String cnae) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.areaDeAtividade = areaDeAtividade;
        this.cnae = cnae;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAreaDeAtividade() {
        return areaDeAtividade;
    }

    public void setAreaDeAtividade(String areaDeAtividade) {
        this.areaDeAtividade = areaDeAtividade;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }
}
