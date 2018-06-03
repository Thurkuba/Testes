import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class Pessoa implements Comparable<Pessoa> {
	String nome;
	int idade;
	String facul;

	public Pessoa(String nome, int idade, String facul) {
	    this.nome = nome;
	    this.idade = idade;
	    this.facul = facul;
	}
	
	public String getNome(){
	    return nome; 
	}

	public int getIdade() {
	    return idade;
	}

	public String getFacul() {
	    return facul;
	}

	public int compareTo(Pessoa outrapessoa2) {
	    //	if ( ! pi instanceof PersonalInformation )
	    //    return false;
	    return this.getNome().compareTo(outrapessoa2.getNome());
      //
      //return this.pessoa.getIdade() - (outrapessoa.pessoa.getIdade());
	}
    /* public int compareTo(testeComparator outrapessoa) {
    //	if ( ! pi instanceof PersonalInformation )
    //    return false;
    return this.pessoa.getNome().
    compareTo(outrapessoa.pessoa.getNome());
    //
    return this.pessoa.getIdade() - (outrapessoa.pessoa.getIdade());
    }
    */


    public static void main(String[] args) {
	Pessoa pessoa1 = new Pessoa("Arthur Kubagawa", 24, "IME");
	Pessoa pessoa2 = new Pessoa("Arthur Magalhaes", 19, "IME");
	Pessoa pessoa3 = new Pessoa("Mariana Thomaz", 23, "FFLCH");
	//	StdOut.println(pessoa1.getNome());

	Pessoa[] lista = {pessoa1, pessoa2, pessoa3};
	for (int i = 0; i < lista.length; i++)
	    StdOut.println(lista[i].getNome());
	Collections.sort(lista);
	for (int i = 0; i < lista.length; i++)
	    StdOut.println(lista[i].getNome());
				   
    }
}
