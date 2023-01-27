package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws Exception {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Carlos Almeida");
//        cliente.setProfissao("Eletricista");
//        cliente.setCpf("11122233344");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cl = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cl);

    }

}
