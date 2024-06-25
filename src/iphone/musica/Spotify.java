package iphone.musica;

public class Spotify implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("TOCANDO Spotify");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO Spotify");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA Spotify");
    }
}
