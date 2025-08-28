public class ContaBancaria {
    private Double saldo = 0.0;
    private Double chequeEspecial= 0.0;
    private Double limiteChequeEspecialUsado= 0.0;
    private Boolean contaCriada= false;

    
    public void setCriarContaBancaria(Double depositoInicial) {
        if (depositoInicial <= 500.0) {
            this.chequeEspecial = 50.0;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }
        saldo += depositoInicial;
        this.contaCriada = true;
        System.out.println("Conta criada com sucesso!");
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setDepoitarDinheiro(Double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso!");
        } else if(limiteChequeEspecialUsado!=0){
            System.out.println("Você possui um limite de cheque especial usado de R$" + limiteChequeEspecialUsado + ". O valor do depósito será usado para quitar esse valor primeiro.");
            if(valorDeposito >= limiteChequeEspecialUsado){
                double valorRestante = valorDeposito - limiteChequeEspecialUsado;
                limiteChequeEspecialUsado = 0.0;
                saldo += valorRestante;
                System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso! Seu limite de cheque especial usado foi quitado.");
            } else {
                limiteChequeEspecialUsado -= valorDeposito;
                System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso! Seu limite de cheque especial usado agora é de R$" + limiteChequeEspecialUsado);
            }
        }
        else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public double getVerificarChequeEspecial() {
        return chequeEspecial;
    }
    
    public double getVerificarLimiteChequeEspecialUsado() {
        return limiteChequeEspecialUsado;
    }
    
    public void setSacarDinheiro(Double valorSaque) {
        if (valorSaque <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }
        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!");
        } else {
            double valorNecessario = valorSaque - saldo;
            if (valorNecessario <= (chequeEspecial - limiteChequeEspecialUsado)) {
                limiteChequeEspecialUsado += valorNecessario + (valorNecessario * 0.2);
                saldo = 0.0;
                System.out.println("Saque de R$" + valorSaque + " realizado com sucesso usando cheque especial!");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        }
    }
    
    public void setPagarBoleto(Double valorBoleto) {
        if (valorBoleto <= 0) {
            System.out.println("Valor de boleto inválido.");
            return;
        }
        if (valorBoleto <= saldo) {
            saldo -= valorBoleto;
            System.out.println("Boleto de R$" + valorBoleto + " pago com sucesso!");
        } else {
            double valorNecessario = valorBoleto - saldo;
            if (valorNecessario <= (chequeEspecial - limiteChequeEspecialUsado)) {
                limiteChequeEspecialUsado += valorNecessario + (valorNecessario * 0.2);
                saldo = 0.0;
                System.out.println("Boleto de R$" + valorBoleto + " pago com sucesso usando cheque especial!");
            } else {
                System.out.println("Saldo insuficiente para pagar o boleto.");
            }
        }
    }  

}
