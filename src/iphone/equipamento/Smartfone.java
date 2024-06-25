package iphone.equipamento;

import iphone.aplicativo.aplicativos;
import iphone.musica.Deezer;
import iphone.navegador.Chorme;
import iphone.telefone.AparelhoTelefonico;
import iphone.musica.Spotify;
import iphone.navegador.safari;
import iphone.telefone.Contatos;

public class Smartfone {
    public static void main(String[] args) {

      aplicativos iphone = new aplicativos();

      System.out.println("Telefonando");
      iphone.atender();

      System.out.println("Navegando");
      iphone .adicionarNovaAba();

      System.out.println("Escutando Musica");
      iphone.tocar();

      // Spotify iphone = new Spotify();
      // iphone.tocar();

      //Deezer iphone = new Deezer();
      // iphone.tocar();

      // safari iphone = new safari();
      // iphone.atualizarPagina();

      //  Chorme iphone = new Chorme();
      //  iphone.adicionarNovaAba();

      //  AparelhoTelefonico iphone = new Contatos();
      //  iphone.atender();



    }


}