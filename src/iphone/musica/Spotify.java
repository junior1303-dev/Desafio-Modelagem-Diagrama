package iphone.musica;

public class Spotify implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("TOCANDO SPOTIFY");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO SPOTIFY");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA SPOTIFY");
    }
}
