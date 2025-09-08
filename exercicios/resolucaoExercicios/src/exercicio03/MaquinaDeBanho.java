package exercicio03;

public class MaquinaDeBanho {
    private int nivelAgua; // em litros
    private int nivelShampoo; // em litros
    private boolean petNoBanho;
    private boolean petLimpo;
    private boolean precisaLimpar;
    private static final int MAX_AGUA = 30;
    private static final int MAX_SHAMPOO = 10;

    public MaquinaDeBanho() {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.petNoBanho = false;
        this.petLimpo = false;
        this.precisaLimpar = false;
    }

    public boolean colocarPet() {
        if (petNoBanho) {
            System.out.println("Já existe um pet na máquina!");
            return false;
        }
        if (precisaLimpar) {
            System.out.println("A máquina precisa ser limpa antes de colocar outro pet!");
            return false;
        }
        petNoBanho = true;
        petLimpo = false;
        System.out.println("Pet colocado na máquina.");
        return true;
    }

    public boolean retirarPet() {
        if (!petNoBanho) {
            System.out.println("Não há pet na máquina!");
            return false;
        }
        if (!petLimpo) {
            precisaLimpar = true;
            System.out.println("Pet retirado sujo. A máquina precisa ser limpa!");
        } else {
            System.out.println("Pet retirado limpo!");
        }
        petNoBanho = false;
        petLimpo = false;
        return true;
    }

    public boolean darBanho() {
        if (!petNoBanho) {
            System.out.println("Não há pet na máquina!");
            return false;
        }
        if (nivelAgua < 10 || nivelShampoo < 2) {
            System.out.println("Nível insuficiente de água ou shampoo!");
            return false;
        }
        nivelAgua -= 10;
        nivelShampoo -= 2;
        petLimpo = true;
        System.out.println("Banho realizado com sucesso!");
        return true;
    }

    public boolean abastecerAgua() {
        if (nivelAgua + 2 > MAX_AGUA) {
            System.out.println("Capacidade máxima de água atingida!");
            return false;
        }
        nivelAgua += 2;
        System.out.println("2 litros de água abastecidos. Nível atual: " + nivelAgua + "L");
        return true;
    }

    public boolean abastecerShampoo() {
        if (nivelShampoo + 2 > MAX_SHAMPOO) {
            System.out.println("Capacidade máxima de shampoo atingida!");
            return false;
        }
        nivelShampoo += 2;
        System.out.println("2 litros de shampoo abastecidos. Nível atual: " + nivelShampoo + "L");
        return true;
    }

    public void verificarNivelAgua() {
        System.out.println("Nível de água: " + nivelAgua + "L");
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo: " + nivelShampoo + "L");
    }

    public void verificarPetNoBanho() {
        if (petNoBanho) {
            System.out.println("Há um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public boolean limparMaquina() {
        if (!precisaLimpar) {
            System.out.println("A máquina não precisa ser limpa.");
            return false;
        }
        if (nivelAgua < 3 || nivelShampoo < 1) {
            System.out.println("Nível insuficiente de água ou shampoo para limpeza!");
            return false;
        }
        nivelAgua -= 3;
        nivelShampoo -= 1;
        precisaLimpar = false;
        System.out.println("Máquina limpa!");
        return true;
    }
}
