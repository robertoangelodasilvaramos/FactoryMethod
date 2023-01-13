import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Passagem {
    private String origem;
    private String destino;
    private LocalDateTime dataTimePartida;

    protected DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Passagem(String origem, String destino, LocalDateTime dataHoraPartida) {
        this.dataTimePartida = dataHoraPartida;
        this.destino = destino;
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getDataTimePartida() {
        return dataTimePartida;
    }

    public void setDataTimePartida(LocalDateTime dataTimePartida) {
        this.dataTimePartida = dataTimePartida;
    }

    public abstract void exibeDetalhes();
}
