package aaa;


import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

class Fila{
	public static void main (String[] args) throws java.lang.Exception, IOException{
		
		BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter escreve = new BufferedWriter(new OutputStreamWriter(System.out));
      
        String linha = leitura.readLine();
        int numeroP = Integer.parseInt(linha);
      
        int[] pessoas = new int[numeroP];
        linha = leitura.readLine();
        String[] s = linha.split(" ");
        for (int i = 0; i < numeroP; i++) {
        	pessoas[i] = Integer.parseInt(s[i]);
        }
      
        HashSet<Integer> foi = new HashSet<>();
        linha = leitura.readLine();
        int andar = Integer.parseInt(linha);
        linha = leitura.readLine();
        s = linha.split(" ");
        for (int i = 0; i < andar; i++) {
            foi.add(Integer.parseInt(s[i]));
        }
      
        int conta = 0;
        int ajustefila = numeroP-andar;
        for (int i = 0; i < numeroP; i++) {
            if (foi.contains(pessoas[i])) {
                continue;
            }
            conta++;
            if (conta == ajustefila) {
            	escreve.write(pessoas[i]+"\n");
                break;
            }
            escreve.write(pessoas[i] + " ");
        }
          
        leitura.close();
        escreve.flush();
        escreve.close();
       
        return;

		
	}
}