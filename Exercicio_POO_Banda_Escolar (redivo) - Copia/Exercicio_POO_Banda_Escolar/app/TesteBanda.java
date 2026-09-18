package app;

import java.util.ArrayList;
import java.util.List;
import model.InstrumentoMusical;
import model.Violao;
import model.Bateria;

public class TesteBanda {
    public static void main(String[] args) {
        Violao violao = new Violao("Violao", "Madeira", 6);
        Bateria bateria = new Bateria("Bateria", "Metal", 5);

        List<InstrumentoMusical> instrumentos = new ArrayList<>();
        instrumentos.add(violao);
        instrumentos.add(bateria);

        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.afinar();
            System.out.println(instrumento.tocar());
        }

        int quantidadeAfinados = 0;

        for (InstrumentoMusical instrumento : instrumentos) {
            if (instrumento.isAfinado()) {
                quantidadeAfinados++;
            }
        }

        System.out.println("Instrumentos afinados: " + quantidadeAfinados + " de " + instrumentos.size());

        // new InstrumentoMusical("Instrumento", "Material") nao compila porque
        // InstrumentoMusical e uma classe abstrata e classes abstratas nao podem
        // ser instanciadas diretamente.
    }
}
