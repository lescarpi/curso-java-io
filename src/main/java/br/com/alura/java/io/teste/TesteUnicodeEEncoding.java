package br.com.alura.java.io.teste;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws IOException {

        String str = "ç^";
        System.out.println(str.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = str.getBytes("windows-1252");
        System.out.print(bytes.length + ", windows-1252, ");
        String newStr = new String(bytes);
        System.out.println(newStr);

        bytes = str.getBytes("UTF-8");
        System.out.print(bytes.length + ", UTF-8, ");
        newStr = new String(bytes);
        System.out.println(newStr);

        bytes = str.getBytes("UTF-16");
        System.out.print(bytes.length + ", UTF-16, ");
        newStr = new String(bytes);
        System.out.println(newStr);

        bytes = str.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US-ASCII, ");
        newStr = new String(bytes);
        System.out.println(newStr);

    }

}
