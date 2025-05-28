# Gestione Squadre di Calcio in Java

# Concetti chiave

- **DAO (Data Access Object)**  
  È un pattern progettuale che incapsula l'accesso ai dati da una fonte (es. database o struttura in memoria). Fornisce metodi per aggiungere, rimuovere e recuperare oggetti.

- **Repository**  
  È un'astrazione sopra il DAO. Organizza la logica di accesso ai dati e centralizza le operazioni di business. Mantiene disaccoppiato il codice di alto livello dalla gestione dei dati.

- **Interface in Java**  
  È un contratto che specifica i metodi che una classe deve implementare. Permette di astrarre il comportamento da una concreta implementazione.

- **Abstract class**  
  È una classe che può contenere metodi sia astratti (senza corpo) che concreti. Serve come base per essere estesa da altre classi.

---

# Struttura del progetto

Questo progetto simula la gestione di una classifica di squadre di calcio. Sono coinvolti i seguenti componenti:

# `ISquadra.java`  
Un'interfaccia che definisce i metodi base di una squadra (`getNome()`, `getAllenatore()`, `getPunti()`).

# `Squadra.java`  
Classe concreta che rappresenta una squadra e implementa l'interfaccia `ISquadra`.

# `AbstractDAO.java`  
Classe astratta generica che definisce i metodi principali di un DAO:
- `add(T item)`
- `remove(T item)`
- `getAll()`

# `SquadraDAO.java`  
Estende `AbstractDAO` per gestire squadre in una struttura `Vector`. Si occupa dell'aggiunta, rimozione e recupero di squadre.

# `SquadraRepository.java`  
Utilizza `SquadraDAO` per offrire funzionalità di livello superiore:
- Aggiungere squadre
- Rimuovere per nome
- Ricercare squadre
- Ordinare per punti

# `Main.java`  
Classe di avvio che mostra l’utilizzo delle funzionalità:
- Aggiunta squadre
- Stampa della classifica
- Rimozione di una squadra
- Ordinamento e ricerca
