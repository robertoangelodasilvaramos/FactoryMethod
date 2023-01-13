import java.time.LocalDateTime;
//Fabrica abstrata
public abstract class Empresa {
    public abstract Passagem emitePassagem(String origem, String destino, LocalDateTime dataHoraPartida);
}
