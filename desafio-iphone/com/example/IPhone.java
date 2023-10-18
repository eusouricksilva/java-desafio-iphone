public interface ReprodutorMusical {
  void playMusic();
  void pauseMusic();
  void nextMusic();
  void previousMusic();
}

public interface AparelhoTelefonico {
  void makeCall(String number);
  void endCall();
}

public interface NavegadorInternet {
  void openBrowser(String url);
  void closeBrowser();
}

public class IPhone
  implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  // Implementação do ReprodutorMusical
  public void playMusic() {
    // Código para tocar música
  }

  public void pauseMusic() {
    // Código para pausar música
  }

  public void nextMusic() {
    // Código para ir para a próxima música
  }

  public void previousMusic() {
    // Código para ir para a música anterior
  }

  // Implementação do AparelhoTelefonico
  public void makeCall(String number) {
    // Código para fazer uma chamada
  }

  public void endCall() {
    // Código para encerrar uma chamada
  }

  // Implementação do NavegadorInternet
  public void openBrowser(String url) {
    // Código para abrir o navegador
  }

  public void closeBrowser() {
    // Código para fechar o navegador
  }
}
