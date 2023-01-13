import java.time.LocalDateTime;

public class MinhaApp {
  public static void main(String[] args) {

      //Empresas de Onibus
      Empresa viacaoABC = new EmpresaOnibusUrbano();
      Empresa viacaoXPTO = new EmpresaOnibusInterestadual();

      //Emite passagem
      Passagem pUrbana = viacaoABC.emitePassagem("Gama", "Brasilia", LocalDateTime.now());
      Passagem pInterestadual = viacaoXPTO.emitePassagem("Brasilia", "Goiania", LocalDateTime.now());

      //Exibe detalhes
      pUrbana.exibeDetalhes();
      pInterestadual.exibeDetalhes();

  }
}
