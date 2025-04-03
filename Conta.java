import java.util.Objects;

public class Conta {
    public int numConta;
    protected  String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    // ----------------  métodos da classe ---------------------

    public void abrirConta(String t) {

        this.setTipo(t);
        this.setStatus(true);

        if (t.equals("CC")) {
            this.saldo = 50;
        } else if (t.equals("CP")) {
            this.saldo = 150;
        }

        Conta cliente =  new Conta();
        cliente.numConta = 1;
        cliente.tipo = "CC";
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("seu saldo é:" + this.saldo + "valor para saque");
            this.saldo = this.saldo - this.saldo;
        }else if (this.saldo < 0){
            System.out.println("voce nào pode fechar essa conta!!!");
        } else {
            System.out.println("Conta Fechada!");
            this.setStatus(false);
        }
    }

    public double depositar(double d) {
        if (this.status) {
            this.saldo = this.saldo + d;
        } else {
            System.out.println("Impossivel depositar conta fechada!");
        }
        return  this.saldo;
    }

    public double sacar(double s) {
        if (this.status && this.saldo > s ) {
            this.saldo = this.saldo - s;
        } else {
            System.out.println("Não é possivel fazer saque sem saldo!!!!");
        }
        return this.saldo;
    }


    public double pagarMensal() {
        double tarifaCp = 20;
        double tarifaCc = 12;

        if (this.tipo.equals("CC")) {
            this.saldo = this.saldo - tarifaCc;
        }else {
            this.saldo = this.saldo - tarifaCp;
        }

        return this.saldo;
    }


    // -------------  get e set dos atributos ----------------------

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
}
