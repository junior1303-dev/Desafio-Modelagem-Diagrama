package iphone.navegador;

public class safari implements NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO Safari");
    }
}
