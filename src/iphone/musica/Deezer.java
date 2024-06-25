package iphone.musica;

public class Deezer implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("TOCANDO Deezer");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO Deezer");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA Deezer");
    }
}
