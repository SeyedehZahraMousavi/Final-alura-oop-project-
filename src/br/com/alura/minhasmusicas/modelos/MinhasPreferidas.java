package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui( Audio audio){
        if (audio.getClassficacao()>=8){
            System.out.println(audio.getTitulo() + " eh considerado sucesso absoluto e " +
                    "prefirido por todos");

        } else{
            System.out.println(audio.getTitulo() + " Tudo mundo esta curtindo!");
        }
    }
}
