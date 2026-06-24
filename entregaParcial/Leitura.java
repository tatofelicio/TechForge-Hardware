//Aluno: Otávio Felício RA: 2768488

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Leitura {

    public String entDados(String dado){

        System.out.print(dado);

        String res = "";

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(isr);

        try{
            res = buff.readLine();
        }
        catch(IOException e){
            System.out.println("Erro na leitura do dados (classe Leitura)");
        }
        return res;
    }
}
