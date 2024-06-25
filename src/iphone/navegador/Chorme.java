package iphone.navegador;

public class Chorme implements NavegadorInternet{
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO Chorme");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO Chorme");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO Chorme");
    }
}
