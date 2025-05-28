import java.util.Vector;

public class SquadraDAO extends AbstractDAO<Squadra> {
    private Vector<Squadra> squadre = new Vector<>();

    @Override
    public void add(Squadra squadra) {
        squadre.add(squadra);
    }

    @Override
    public void remove(Squadra squadra) {
        for (int i = 0; i < squadre.size(); i++) {
            if (squadre.get(i).equals(squadra)) {
                squadre.remove(i);
                break;
            }
        }
    }

    @Override
    public Vector<Squadra> getAll() {
        return squadre;
    }
}
