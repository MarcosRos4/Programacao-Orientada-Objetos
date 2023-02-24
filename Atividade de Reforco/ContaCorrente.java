public class ContaCorrente{
    private String numeroConta;
    private float saldoConta;

    public void setnumeroConta(String num) {
        this.numeroConta = num;
    }

    public String getnumeroConta() {
        return this.numeroConta;
    }

    public void setsaldoConta(float saldo) {
        this.saldoConta = saldo;
    }

    public float getsaldoConta() {
        return this.saldoConta;
    }
    
}