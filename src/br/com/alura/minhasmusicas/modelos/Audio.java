package br.com.alura.minhasmusicas.modelos;

public class Audio {
private String titulo;
private int totalReproducoes;
private int totalCurtidas;
private int classficacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassficacao() {
        return classficacao;
    }

    public void setClassficacao(int classficacao) {
        this.classficacao = classficacao;

    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }


    public int getTotalCurtidas() {
        return totalCurtidas;
    }



    public void curte(){
        this.totalCurtidas++;


    }
    public void reproduz(){
        this.totalReproducoes++;

    }

}

