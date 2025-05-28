public class Squadra {
    private String nome;
    private String allenatore;
    private int punti;

    public Squadra(String nome, String allenatore, int punti) {
        this.nome = nome;
        this.allenatore = allenatore;
        this.punti = punti;
    }

    public String getNome() {
        return nome;
    }

    public String getAllenatore() {
        return allenatore;
    }

    public int getPunti() {
        return punti;
    }

    @Override
    public String toString() {
        return "Squadra: " + nome + ", Allenatore: " + allenatore + ", Punti: " + punti;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Squadra) {
            Squadra altra = (Squadra) obj;
            return this.nome.equals(altra.nome);
        }
        return false;
    }
}
