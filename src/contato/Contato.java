package contato;

public class Contato {
    private String nome;
    private String numero;


    @Override
    public String toString() {
        return this.nome + ": " + this.numero;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public String setNumero(String numero) {
        this.numero = numero;
        return numero;
    }
}
