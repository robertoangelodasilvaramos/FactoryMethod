import java.time.LocalDateTime;
//Fabrica concreta
public class EmpresaOnibusInterestadual extends Empresa{
    public Passagem emitePassagem(String origem, String destino, LocalDateTime dataHoraPartida) {
        return new PassagemOnibusInterestadual(origem, destino, dataHoraPartida);
    }
}
