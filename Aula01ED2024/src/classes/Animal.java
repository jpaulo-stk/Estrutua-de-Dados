package classes;

public class Animal {

    private String nome;

    private String cor;

    private String tamanho;

    private String familial;

    public Animal(String nome, String cor, long tamanho, String familial) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = String.valueOf(tamanho);
        this.familial = familial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getFamilial() {
        return familial;
    }

    public void setFamilial(String familial) {
        this.familial = familial;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", familial='" + familial + '\'' +
                '}';
    }
}
