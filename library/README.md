## Sistema di Gestione Biblioteca con Interfacce e Polimorfismo
* **Focus:** Ereditarietà, Classi Astratte, Interfacce, `HashMap`.
* **Cosa apprendere:**
  * Ereditarietà (`extends`) e polimorfismo.
  * Classi astratte e interfacce (`interface`).
  * Uso di `HashMap<String, ElementoBiblioteca>` per una ricerca rapida per codice ISBN o ID.

### La Traccia:
1. Crea un'interfaccia `Scrivibile` con un metodo `getDettagliFormattati()`.
2. Crea una classe astratta `ElementoBiblioteca` che implementa `Scrivibile` (campi comuni: `titolo`, `annoPubblicazione`, `codiceUnivoco`).
3. Crea due classi figlie: `Libro` (aggiunge `numeroPagine`, `autore`) e `Rivista` (aggiunge `numeroEdizione`, `mese`).
4. Nel `Main` (o in una classe `GestoreBiblioteca`), usa una `HashMap` in cui la chiave è il `codiceUnivoco` e il valore è l'oggetto (`Libro` o `Rivista`).
5. Implementa la logica per:
   * Aggiungere elementi alla mappa.
   * Stampare il catalogo sfruttando il polimorfismo (chiamando il metodo dell'interfaccia indipendentemente che sia un libro o una rivista).
   * Rimuovere un elemento tramite codice.

### Restrizioni / Regole:
* **Uso del Polimorfismo:** Il metodo di stampa nel gestore deve accettare o iterare sugli elementi trattandoli come `ElementoBiblioteca` (o `Scrivibile`), sfruttando l'override dei metodi.
* **Gestione Chiavi Duplicate:** Se l'utente prova ad aggiungere un elemento con un codice già esistente nella `HashMap`, il programma deve intercettarlo e avvisare l'utente senza sovrascrivere o crashare.

### Aggiunte personali
- **Errori:** Implementata una gestione degli errori con messaggi personalizzati in modo centralizzato.
- **Cli:** Implementata una cli interattiva con feedback per l'utente, garantendo integrità dei dati.
- **Main file:** Rimane molto pulito e leggero, istanzia le classi e avvia il tutto con i relativi metodi. 