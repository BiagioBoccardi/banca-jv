


public class Conto {
    private String nome;
    private double saldo;
    private String Iban;
    public Conto() {

    }
    public Conto(String nome, double saldo, String Iban) {
        this.nome = nome;
        this.saldo = saldo;
        this.Iban = Iban;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIban() {
        return Iban;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setIban(String Iban) {
        this.Iban = Iban;
    }

    public void visualizzaSaldo() {
        System.out.println("Il saldo del conto " + Iban + " è: " + saldo + " euro.");
    }
    public void effettuaPrelievo(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo di " + importo + " euro effettuato con successo.");
        } else {
            System.out.println("Saldo insufficiente o importo non valido per il prelievo.");
        }
    }
    public void effettuaDeposito(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito di " + importo + " euro effettuato con successo.");
        } else {
            System.out.println("Importo non valido per il deposito.");
        }
    }



    

}
