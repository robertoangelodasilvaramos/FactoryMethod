import java.time.LocalDateTime;

//produto concreto
public class PassagemOnibusInterestadual extends Passagem{

    public PassagemOnibusInterestadual(String origem, String destino, LocalDateTime dataHoraPartida){
        super(origem, destino, dataHoraPartida);
    }

    public void exibeDetalhes(){
        System.out.println("Passagem de ônibus interestadual: " + this.getOrigem()
        + " para " + this.getDestino() + " , Data/Hora: " + this.getDataTimePartida().format(super.df));
    }
}
