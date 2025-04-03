import java.util.Objects;

public class Conta {
    public int numConta;
    protected  String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoatual() {
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Conta: " + this.getTipo());
        System.out.println("Conta: " + this.getDono());
        System.out.println("Conta: " + this.getSaldo());
        System.out.println("Conta: " + this.getStatus());
    }


    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    // ----------------  métodos da classe ---------------------

    public void abrirConta(String t) {

        this.setTipo(t);
        this.setStatus(true);

        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("seu saldo é:" + this.saldo + "valor liberado para saque");
            this.setSaldo(0);
        }else if (this.getSaldo() < 0){
            System.out.println("Voce não pode fechar essa conta!!!");
        } else {
            System.out.println("Conta Fechada!");
            this.setStatus(false);
        }
    }

    public double depositar(double d) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + d);
        } else {
            System.out.println("Impossivel depositar conta fechada!");
        }
        return  this.saldo;
    }

    public double sacar(double s) {
        if (this.getStatus() && this.getSaldo() > s ) {
            this.setSaldo(this.getSaldo() - s);
        } else {
            System.out.println("Não é possivel fazer saque sem saldo!!!!");
        }
        return this.saldo;
    }


    public double pagarMensal() {
        double tarifaCp = 20;
        double tarifaCc = 12;

        if (this.getTipo().equals("CC")) {
            this.setSaldo(this.getSaldo() - tarifaCc);
        }else {
            this.setSaldo(this.getSaldo() -tarifaCp);
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
