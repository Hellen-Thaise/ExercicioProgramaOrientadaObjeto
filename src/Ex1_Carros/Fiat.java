package Ex1_Carros;

public class Fiat extends Carros{

    public Fiat(String marca, Integer ano, Double valor, String cor, Integer portas, Integer velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
    }

    public void detalhesCarro(){
        System.out.println("Marca do carro: " + getMarca());
        System.out.println("Ano do carro: " + getAno());
        System.out.println("Valor do carro: " + getValor());
        System.out.println("Cor do carro: " + getCor());
        System.out.println("Quantas portas o carro possui: " + getPortas()+"\n");
    }
    @Override
    public void iniciarMotor() {
        setVelocidade(3);
        System.out.println("Iniciando o motor...a minha velocidade está em " + getVelocidade() + "km/h");
    }

    @Override
    public void freiar() {
        if(getVelocidade() == 0){
            System.out.println("Carro desligado!");
        } else {
            setVelocidade(getVelocidade() - 6);
            System.out.println("Freando...minha velocidade está em " + getVelocidade() + "km/h");
        }
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 12);
        System.out.println("Acelerando...minha velocidade está em " + getVelocidade() + "km/h");
    }

}
