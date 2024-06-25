package iphone.telefone;

public class Contatos implements AparelhoTelefonico{

    @Override
    public void ligar(int numero) {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("CORREIO");
    }
}
