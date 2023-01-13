import java.time.LocalDateTime;

public class EmpresaOnibusUrbano extends Empresa{
    @Override
    public Passagem emitePassagem(String origem, String destino, LocalDateTime dataHoraPartida) {
        return new PassagemOnibusUrbana(origem, destino,dataHoraPartida);
    }
}
