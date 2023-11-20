public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String numeroTelefone;

    public iPhone(String modelo, String numeroTelefone) {
        this.modelo = modelo;
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void reproduzirMusica(String musica) {
    }

    @Override
    public void fazerChamada(String numero) {
    }

    @Override
    public void navegarInternet(String url) {
    }
}
