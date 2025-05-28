import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        SquadraDAO dao = new SquadraDAO();

        dao.add(new Squadra("Inter", "Inzaghi PIAGNONE", 89));
        dao.add(new Squadra("Milan", "Conceicao", 75));
        dao.add(new Squadra("Juventus", "MASSIMILIANO ALLEGRI ALEEE OOO, DRUGHI!", 72));
        dao.add(new Squadra("Napoli", "Conte", 64));
        dao.add(new Squadra("Roma", "Ranieri", 62));

        System.out.println("=== Squadre Serie A ===");
        Vector<Squadra> squadre = dao.getAll();
        for (int i = 0; i < squadre.size(); i++) {
            System.out.println(squadre.get(i));
        }

        System.out.println("\n-- Rimozione della Juventus --");
        dao.remove(new Squadra("Juventus", "", 0)); // basta solo il nome per equals

        System.out.println("\n=== Squadre aggiornate ===");
        Vector<Squadra> aggiornate = dao.getAll();
        for (int i = 0; i < aggiornate.size(); i++) {
            System.out.println(aggiornate.get(i));
        }
    }
}
