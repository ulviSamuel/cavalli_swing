# Cavalli Swing

![Java](https://img.shields.io/badge/Java-Desktop%20Application-blue)
![Stato](https://img.shields.io/badge/Stato-Progetto%20scolastico-orange)
![UI](https://img.shields.io/badge/UI-Swing-green)
![Architettura](https://img.shields.io/badge/Architettura-MVC%20didattica-lightgrey)

**Cavalli Swing** è un progetto Java che simula una corsa di cavalli con interfaccia grafica Swing.  
Il codice è organizzato in package separati per modello dati, logica di business, interfacce, avvio e viste.

Repository: [ulviSamuel/cavalli_swing](https://github.com/ulviSamuel/cavalli_swing)

---

## Descrizione

Il progetto implementa una simulazione di gara in cui più cavalli avanzano lungo una pista fino alla determinazione del vincitore.

La struttura reale del sorgente mostra una separazione chiara delle responsabilità:

- `bean` per gli oggetti dati;
- `business` per la logica applicativa;
- `interfaces` per i contratti;
- `views` per la parte grafica Swing;
- `main` per l’avvio del programma.

---

## Funzionalità principali

- avvio della simulazione di corsa;
- gestione concorrenti (cavalli) e stato gara;
- aggiornamento avanzamento durante la corsa;
- visualizzazione della simulazione tramite GUI Swing;
- determinazione del vincitore finale.

---

## Struttura reale del progetto

```text
cavalli_swing/
│
├── Cavalli Swing/
│   ├── src/
│   │   └── it/volta/ts/ulivisamuel/cavalli_swing/
│   │       ├── bean/
│   │       ├── business/
│   │       ├── interfaces/
│   │       ├── main/
│   │       └── views/
│   │
│   ├── img/
│   ├── .classpath
│   ├── .project
│   └── .settings/
│
└── README.md
```

---

## Architettura

Impostazione didattica a layer:

- **Bean (Model):** classi dati usate nella simulazione (es. cavallo, stato, risultati).
- **Business:** regole della corsa (avanzamento, controllo fine gara, vincitore).
- **Interfaces:** astrazioni/contratti tra componenti.
- **Views:** schermate Swing e aggiornamento grafico.
- **Main:** entry point applicativo.

Questa organizzazione rende il progetto più leggibile e facile da estendere.

---

## Tecnologie utilizzate

- **Java** (100% repository)
- **Java Swing** per la GUI desktop
- **OOP** (incapsulamento, separazione responsabilità, modularità)

---

## Esecuzione del progetto

### Requisiti

- JDK 8+ (consigliato)
- IDE Java (Eclipse/IntelliJ/NetBeans) oppure terminale

### Avvio da IDE

1. Importa la cartella `Cavalli Swing` come progetto Java.
2. Individua la classe nel package `main`.
3. Esegui la classe con metodo `public static void main(String[] args)`.

### Compilazione da terminale (generica)

```bash
javac -d out $(find . -name "*.java")
java -cp out it.volta.ts.ulivisamuel.cavalli_swing.main.Main
```

> Se la classe di avvio ha un nome diverso da `Main`, sostituisci l’ultimo comando con il fully-qualified name corretto.

---

## Obiettivi didattici

Il progetto è utile per esercitarsi su:

- progettazione di applicazioni desktop Java;
- separazione Model/Business/View;
- organizzazione a package;
- simulazioni con aggiornamento stato e output grafico.

---

## Possibili miglioramenti futuri

- parametri gara configurabili (numero cavalli, lunghezza pista, velocità);
- gestione multithreading più avanzata per animazioni concorrenti;
- statistiche e storico gare;
- test unitari della logica business;
- miglioramento UI/UX grafica.

---

## Autore

Realizzato da **[ulviSamuel](https://github.com/ulviSamuel)**.

---

## Licenza

Progetto sviluppato per finalità scolastiche/didattiche.
