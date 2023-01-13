import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//produto concreto
public class PassagemOnibusUrbana extends Passagem{

    public PassagemOnibusUrbana(String origem, String destino, LocalDateTime dataHoraPartida){
        super(origem, destino, dataHoraPartida);
    }

    public void exibeDetalhes(){
        System.out.println("Passagem de ônibus Ubana: " + this.getOrigem()
                + " para " + this.getDestino() + " , Data/Hora: " + this.getDataTimePartida().format(super.df));
    }
}
