# Consegna Progetto Java – Gestione Squadre di Calcio

# Obiettivo

Realizza un'applicazione Java orientata agli oggetti per la gestione di una serie di squadre di calcio. L'applicazione deve essere strutturata utilizzando interfacce, classi astratte, DAO e repository.

---

# Requisiti funzionali

1. **Classe `Squadra`**
   - Attributi: `nome`, `allenatore`, `punti`
   - Metodi: costruttore, getter, `toString()`, `equals(Object obj)`
   - Deve implementare un'interfaccia `ISquadra` che definisce i metodi `getNome()`, `getAllenatore()`, `getPunti()`

2. **Interfaccia `ISquadra`**
   - Definisce i metodi essenziali che ogni squadra deve avere.

3. **Classe astratta `AbstractDAO<T>`**
   - Metodi astratti:
     - `void add(T item)`
     - `void remove(T item)`
     - `Vector<T> getAll()`

4. **Classe `SquadraDAO`**
   - Estende `AbstractDAO<Squadra>`
   - Implementa i metodi usando una struttura `Vector` per salvare le squadre.

5. **Classe `SquadraRepository`**
   - Usa `SquadraDAO` per gestire l'elenco delle squadre
   - Metodi:
     - `aggiungiSquadra(String nome, String allenatore, int punti)`
     - `getTutteLeSquadre()`
     - `rimuoviPerNome(String nome)`
     - `cercaPerNome(String nome)`
     - `getSquadreOrdinatePerPunti()`

6. **Classe `Main`**
   - Crea un oggetto `SquadraRepository`
   - Inserisce alcune squadre
   - Stampa la classifica
   - Rimuove una squadra
   - Ordina e stampa nuovamente
