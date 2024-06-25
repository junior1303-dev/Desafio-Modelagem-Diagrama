package iphone.aplicativo;

import iphone.musica.ReprodutorMusical;
import iphone.navegador.NavegadorInternet;
import iphone.telefone.AparelhoTelefonico;

public class aplicativos implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBIR PAGINA DO APLICATIVO");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONAR NOVA ABA DO APLICATIVO");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZAR PAGINA DO APLICATIVO");
    }

    public void tocar(){
        System.out.println("TOCANDO MUSICA IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSAR DO APLICATIVO");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONAR MUSICA DO APLICATIVO");
    }


    @Override
    public void ligar(int numero) {
        System.out.println("LIGAR DO APLICATIVO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDER DO APLICATIVO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIAR CORREIO VOZ DO APLICATIVO");
    }
}
