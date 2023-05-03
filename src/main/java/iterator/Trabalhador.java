package iterator;

public class Trabalhador {

    private String nome;
    private boolean aposentado;
    private boolean empregado;

    public Trabalhador(String nome, boolean aposentado, boolean empregado) {
        this.nome = nome;
        this.aposentado = aposentado;
        this.empregado = empregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAposentado() {
        return aposentado;
    }

    public void setAposentado(boolean aposentado) {
        this.aposentado = aposentado;
    }

    public boolean isEmpregado() {
        return empregado;
    }

    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }
}
