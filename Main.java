public class Main {
    public static void main(String[] args) {
        SquadraRepository repo = new SquadraRepository();

        repo.aggiungiSquadra("Inter", "Inzaghi", 89);
        repo.aggiungiSquadra("Milan", "Pioli", 75);
        repo.aggiungiSquadra("Juventus", "Montero", 72);
        repo.aggiungiSquadra("Napoli", "Calzona", 64);

        System.out.println("=== Squadre Serie A ===");
        for (int i = 0; i < repo.getTutteLeSquadre().size(); i++) {
            System.out.println(repo.getTutteLeSquadre().get(i));
        }

        System.out.println("\n-- Rimozione della Juventus --");
        repo.rimuoviPerNome("Juventus");

        System.out.println("\n=== Squadre aggiornate ===");
        for (int i = 0; i < repo.getTutteLeSquadre().size(); i++) {
            System.out.println(repo.getTutteLeSquadre().get(i));
        }
    }
}
