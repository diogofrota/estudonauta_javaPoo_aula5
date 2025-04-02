import java.util.Objects;

public class Conta {
    public int numConta;
    protected  String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // métodos da classe
    public void abrirConta() {
        if ( this.tipo.equals("CP")){
            this.saldo = this.saldo + 150;
        }else {
            this.saldo = this.saldo + 50;
        }
    }

    public void fecharConta() {
        if (this.saldo>= 0) {
            System.out.println("seu saldo é:" + this.saldo + "valor para saque");
            this.saldo = this.saldo - this.saldo;
        }else {
            System.out.println("voce nào pode fechar essa conta!!!");
        }
    }

    public double depositar(double d) {
        this.saldo = this.saldo + d;
        return  this.saldo;
    }

    public double sacar(double s) {
        this.saldo = this.saldo - s;
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


    // get e set dos atributos
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
