package Ex1_Carros;

public class Hyundai extends Carros{

    public Hyundai(String marca, Integer ano, Double valor, String cor, Integer portas, Integer velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
    }

    public void detalhesCarro(){
        System.out.println("Marca do Carro: " + getMarca());
        System.out.println("Ano do Carro: " + getAno());
        System.out.println("Valor do Carro: " + getValor());
        System.out.println("Cor do Carro: " + getCor());
        System.out.println("Quantas portas o carro possui: " + getPortas()+"\n");
    }

    @Override
    public void iniciarMotor() {
        setVelocidade(5);
        System.out.println("Iniciando o motor...minha velocidade está em " + getVelocidade() + "km/h");
    }

    @Override
    public void freiar() {
        if(getVelocidade() == 0){
            System.out.println("Carro desligado!");
        } else {
            setVelocidade(getVelocidade() - 2);
            System.out.println("Freando...minha velocidade está em " + getVelocidade() + "km/h");
        }
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 15);
        System.out.println("Acelerando...minha velocidade está em " + getVelocidade() + "km/h");
    }
}