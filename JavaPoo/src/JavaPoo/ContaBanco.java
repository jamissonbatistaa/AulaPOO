
package JavaPoo;
public final class ContaBanco {

    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

   
    public void estadoAtualObjeto(){
        System.out.println("CONTA: "+this.getNumConta());
        System.out.println("DONO: "+this.getDono());
        System.out.println("SALDO: "+this.getSaldo());
        System.out.println("STATUS: "+ this.getStatus());
    }
    //METODOS PERSONALISADOS
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta criada com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta nao pode ser fecha pois possui dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta nao pode ser fechada pois possui debito");
        } else {
            this.setStatus(false);
        }
        System.out.println("Conta fechada com sucesso");
    }

    public void depositar(float s) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + s);
            System.out.println("Deposito realizado na conta" + this.getDono());
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float s) {
        if (this.getStatus()) {
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado com sucesso na conta " + this.getDono());
            } else if (this.getSaldo() < 0) {
                System.out.println("Saldo insuficiente");
            } else {
                System.out.println("impossivel sacar");
            }

        }

    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;

        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
        }
    }

    //METODO ESPECIAL
    public ContaBanco() {

        this.setSaldo(0);
        this.setStatus(false);
    }

    //SET E GET DOS ATRIBUTOS
    public void setNunConta(int numconta) {
        this.numConta = numconta;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return this.dono;
    }

    public final void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

}