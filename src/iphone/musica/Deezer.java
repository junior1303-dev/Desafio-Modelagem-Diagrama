package iphone.musica;

public class Deezer implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("TOCANDO DEEZER");
    }


    @Override
    public void pausar() {
        System.out.println("PAUSANDO DEEZER");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA DEEZER");
    }
}
