# 🏦 Banca JV

Un semplice progetto Java che simula il funzionamento di una **banca**: gestione dei conti correnti, utenti e operazioni di base (deposito, prelievo, saldo, ecc.).

## 🚀 Funzionalità principali

- Creazione di un **conto corrente** associato a un utente  
- Operazioni di **deposito** e **prelievo** con aggiornamento del saldo  
- Visualizzazione del **saldo attuale**  
- Struttura a classi (`Conto`, `Utente`, `App`) per una chiara separazione dei ruoli  
- Logica orientata agli oggetti (OOP)

---

## 🧩 Struttura del progetto

banca_java/
│
├── src/
│ ├── App.java # Classe principale (main)
│ ├── Conto.java # Gestione del conto corrente
│ └── utente.java # Definizione dell’utente
│
├── bin/ # File compilati (.class)
│
└── README.md # Descrizione del progetto

---

## ⚙️ Come eseguire il progetto

1. **Compila i file Java:**
   ```bash
   javac src/*.java -d bin


  👥 Classi principali
Utente

Rappresenta un cliente della banca.
Contiene informazioni come nome, cognome e ID utente.

Conto

Gestisce il saldo e le operazioni principali:

deposita(double importo)

preleva(double importo)

getSaldo()

App

Contiene il metodo main() e coordina l’esecuzione del programma.

🧾 Licenza

Questo progetto è distribuito con licenza MIT.
Puoi modificarlo e riutilizzarlo liberamente, citando l’autore originale.

✍️ Autore

Biagio Boccardi
Progetto Java – Banca JV
📅 2025

