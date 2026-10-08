## Gestore di Inventario Magazzino (Console App)
* **Focus:** OOP di base, incapsulamento (getter/setter), collezioni (`ArrayList`), suddivisione in più file/classi.
* **Cosa apprendere:**
  * Creazione di classi e oggetti (`class Prodotto`).
  * Attributi privati e metodi pubblici (**Incapsulamento**: getter, setter, costruttori).
  * Uso di `ArrayList<Prodotto>` al posto degli array fissi.
  * Organizzazione del codice in almeno due file distinti (`Main.java` e `Prodotto.java`).

### La Traccia:
1. Crea la classe `Prodotto` con attributi privati: `id` (String), `nome` (String), `prezzo` (double), `quantita` (int).
2. Implementa un costruttore che inizializza tutti i campi, i metodi `get` e `set` per ciascuno, e un metodo `toString()` personalizzato per stampare le informazioni del prodotto.
3. Nel `Main`, crea un `ArrayList<Prodotto>` e gestisci un menu testuale a console che permetta di:
   * Aggiungere un nuovo prodotto.
   * Visualizzare tutti i prodotti in magazzino.
   * Cercare un prodotto per ID.
   * Calcolare il valore totale del magazzino (prezzo $\times$ quantità per ogni articolo).

### Restrizioni / Regole:
* **No logica nel Main:** Il `Main` deve solo gestire l'input/output utente e chiamare i metodi (puoi anche creare una classe di servizio `Magazzino`).
* **Validazione:** Quando crei o aggiorni un prodotto, il prezzo e la quantità non possono essere negativi (lancia o gestisci un controllo con un messaggio d'errore).
