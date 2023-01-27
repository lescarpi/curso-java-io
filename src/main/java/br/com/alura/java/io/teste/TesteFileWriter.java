package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem-file-writer.txt"));
        bw.write("Linha escrita");
        bw.newLine();
        bw.newLine();
        bw.write("Outra linha");

        bw.close();

    }

}
