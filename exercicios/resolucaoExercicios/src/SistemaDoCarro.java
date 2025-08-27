public class SistemaDoCarro {
    private boolean ligado= false;
    private int velocidade= 0;
    private int marcha= 0; // 0 = ponto morto, 1-6 = marchas

    
    public void ligarCarro() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }
    
    public void desligarCarro() {
        if (ligado) {
            ligado = false;
            velocidade = 0;
            marcha = 0;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void mudarMarchaCarro(char direcao){
        if(!ligado){
            System.out.println("O carro está desligado. Ligue o carro antes de mudar a marcha.");
            return;
        }
        if(direcao == 'U'){
            if(marcha < 6){
                if((marcha == 0) || (marcha == 1 && velocidade >= 15) || (marcha == 2 && velocidade >= 35) ||
                   (marcha == 3 && velocidade >= 55) || (marcha == 4 && velocidade >= 75) || (marcha == 5 && velocidade >= 95)){
                    marcha++;
                    System.out.println("Marcha aumentada para: " + marcha);
                }else{
                    System.out.println("Velocidade insuficiente para aumentar a marcha.");
                }
            }else{
                System.out.println("Já está na marcha máxima.");
            }
        }else if(direcao == 'D'){
            if(marcha > 0){
                if((marcha == 1 && velocidade <= 15) || (marcha == 2 && velocidade <= 35) || (marcha == 3 && velocidade <= 55) ||
                   (marcha == 4 && velocidade <= 75) || (marcha == 5 && velocidade <= 95) || (marcha == 6 && velocidade <= 120)){
                    marcha--;
                    System.out.println("Marcha reduzida para: " + marcha);
                }else{
                    System.out.println("Velocidade alta demais para reduzir a marcha, reduza a velocidade primeiro.");        
                }
            }else{
                System.out.println("Já está em ponto morto.");
            }
        
        }else{
            System.out.println("Direção inválida. Use 'U' para subir ou 'D' para descer.");
        }

    }

    public void acelerarCarro(){
        if(!ligado){
            System.out.println("O carro está desligado. Ligue o carro antes de acelerar.");
            return;
        }
        switch(marcha){
            case 0:
                System.out.println("Carro em ponto morto. Não é possível acelerar.");
                break;
            case 1:
                if(velocidade < 20){
                    if(velocidade < 10){
                        velocidade += 1;
                    }else{
                        velocidade += 5;
                    }
                    System.out.println("Velocidade atual: " + velocidade + " km/h");
                }else{
                    System.out.println("Velocidade máxima para a 1ª marcha atingida. Mude para a 2ª marcha.");
                }
                break;
            case 2:
                if(velocidade < 40){
                    if(velocidade < 20){
                        velocidade += 1;
                    }else{
                        velocidade += 5;    
                    }
                    System.out.println("Velocidade atual: " + velocidade + " km/h");
                }else{
                    System.out.println("Velocidade máxima para a 2ª marcha atingida. Mude para a 3ª marcha.");
                }
                break;
            case 3:
                if(velocidade < 60){
                    if(velocidade < 40){
                        velocidade += 1;
                    }else{
                        velocidade += 5;        
                    }   
                    System.out.println("Velocidade atual: " + velocidade + " km/h");
                }else{
                    System.out.println("Velocidade máxima para a 3ª marcha atingida. Mude para a 4ª marcha.");
                }
                break;
            case 4:
                if(velocidade < 80){
                    if(velocidade < 60){
                        velocidade += 1;
                    }else{
                        velocidade += 5;
                    }
                    System.out.println("Velocidade atual: " + velocidade + " km/h");
                }else{
                    System.out.println("Velocidade máxima para a 4ª marcha atingida. Mude para a 5ª marcha.");
                }
                break;
            case 5:
                if(velocidade < 100){
                    if(velocidade < 80){
                        velocidade += 1;
                    }else{
                        velocidade += 5;    
                    }   
                    System.out.println("Velocidade atual: " + velocidade + " km/h");
                }else{
                    System.out.println("Velocidade máxima para a 5ª marcha atingida. Mude para a 6ª marcha.");
                }
                break;
            case 6:
                if(velocidade < 120){
                    if(velocidade < 100){
                        velocidade += 1;
                    }else{
                        velocidade += 5;
                    }       
                    System.out.println("Velocidade atual: " + velocidade + " km/h");
                }else{
                    System.out.println("Velocidade máxima para a 6ª marcha atingida."); 
                }
                break;
            default:
                System.out.println("Marcha inválida.");
            }
            
    }

    public void diminuirVelocidadeCarro(){
        //mesma lógica de acelerar, mas reduzindo a velocidade de acordo com a marcha caso a marcha nao reduza 
        //junto com a velocidade avisando o usuário para reduzir a marcha
        if(!ligado){
            System.out.println("O carro está desligado. Ligue o carro antes de reduzir a velocidade.");
            return; 
        }   
        if(velocidade > 0){
            if(velocidade <= 20){
                velocidade -= 1;
            }else{
                velocidade -= 5;
            }
            System.out.println("Velocidade atual: " + velocidade + " km/h");
            switch(marcha){
                case 1:
                    if(velocidade == 0){
                        System.out.println("Carro parado. Coloque em ponto morto.");
                    }
                    break;
                case 2:
                    if(velocidade < 15){
                        System.out.println("Reduza a marcha para a 1ª.");
                    }
                    break;
                case 3:
                    if(velocidade < 35){
                        System.out.println("Reduza a marcha para a 2ª.");
                    }
                    break;
                case 4:
                    if(velocidade < 55){
                        System.out.println("Reduza a marcha para a 3ª.");
                    }
                    break;
                case 5:
                    if(velocidade < 75){
                        System.out.println("Reduza a marcha para a 4ª.");
                    }
                    break;
                case 6:
                    if(velocidade < 95){
                        System.out.println("Reduza a marcha para a 5ª.");
                    }
                    break;
                default:
                    break;
            }
        }else{
            System.out.println("O carro já está parado.");
        }


        
    }

    public void virarCarro(char direcao){
        if(!ligado){
            System.out.println("O carro está desligado. Ligue o carro antes de virar.");
            return;
        }
        if(velocidade == 0){
            System.out.println("O carro está parado. Não é possível virar.");
            return;
        }
        if(direcao == 'E'){
            System.out.println("Virando para a esquerda.");
        }else if(direcao == 'D'){
            System.out.println("Virando para a direita.");
        }else{
            System.out.println("Direção inválida. Use 'E' para esquerda ou 'D' para direita.");
        }
    }
}
