import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Creiamo due conti di esempio
        Conto contoMario = new Conto("Mario Rossi", 1000.0, "IT60X0542811101000000123456");
        Conto contoLuigi = new Conto( "Luigi Rossi", 500.0, "IT60X0542811101000000654321");
        Conto contoSelezionato = null;

        // Menu selezione conto
        while (contoSelezionato == null) {
            System.out.println("\n--- Seleziona conto ---");
            System.out.println("1. Mario Rossi");
            System.out.println("2. Luigi Rossi");
            System.out.print("Scegli un conto: ");
            int sceltaConto = scanner.nextInt();

            switch (sceltaConto) {
                case 1 -> contoSelezionato = contoMario;
                case 2 -> contoSelezionato = contoLuigi;
                default -> System.out.println("Scelta non valida, riprova.");
            }
        }

        // Menu principale per il conto selezionato
        boolean uscita = false;
        while (!uscita) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Effettua deposito");
            System.out.println("2. Effettua prelievo");
            System.out.println("3. Mostra saldo");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1 -> {
                    System.out.print("Inserisci importo da depositare: ");
                    double deposito = scanner.nextDouble();
                    contoSelezionato.effettuaDeposito(deposito);
                }
                case 2 -> {
                    System.out.print("Inserisci importo da prelevare: ");
                    double prelievo = scanner.nextDouble();
                    contoSelezionato.effettuaPrelievo(prelievo);
                }
                case 3 -> {
                    System.out.println("Entrato nel case 3");
                    contoSelezionato.visualizzaSaldo();
                }
                case 4 -> {
                    uscita = true;
                    System.out.println("Arrivederci!");
                }
                default -> System.out.println("Scelta non valida, riprova.");
            }
        }

        scanner.close();
    }
}


    

