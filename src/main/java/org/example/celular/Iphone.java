package org.example.celular;

import org.example.funcoes.AparelhoTelefonico;
import org.example.funcoes.NavegadorInternet;
import org.example.funcoes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");

    }
}
