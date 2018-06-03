import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import edu.princeton.cs.algs4.*;
import java.util.ArrayList;

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
      
	    // return this.getIdade() - (outrapessoa2.getIdade());
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
	Pessoa pessoa3 = new Pessoa("Arthur Kubagawa", 24, "IME");
	Pessoa pessoa2 = new Pessoa("Artur Magalhaes", 19, "IME");
	Pessoa pessoa1 = new Pessoa("Mariana Thomaz", 23, "FFLCH");
	Pessoa pessoa5 = new Pessoa("Natalia Morita", 19, "IQ");
	Pessoa pessoa4 = new Pessoa("Cecy Marback", 20, "FFLCH");
	//	StdOut.println(pessoa1.getNome());

	//	Pessoa[] lista = {pessoa1, pessoa2, pessoa3};
	ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	lista.add(pessoa1); lista.add(pessoa2); lista.add(pessoa3); lista.add(pessoa4); lista.add(pessoa5);

	//	Pessoa[] nomes = lista.toArray();
	
	for (int i = 0; i < lista.size(); i++)
	    StdOut.println(lista.get(i).getNome() + " - " + lista.get(i).getIdade() + " - " + lista.get(i).getFacul());
	
	Collections.sort(lista);
	StdOut.println("---");
	for (int i = 0; i < lista.size(); i++)
	    StdOut.println(lista.get(i).getNome() + " - " + lista.get(i).getIdade() + " - " + lista.get(i).getFacul());
	
	Collections.sort(lista, new IdadeComparator());
	StdOut.println("---");
	for (int i = 0; i < lista.size(); i++)
	    StdOut.println(lista.get(i).getNome() + " - " + lista.get(i).getIdade() + " - " + lista.get(i).getFacul());

	Collections.sort(lista, new FaculComparator());
	StdOut.println("---");
	for (int i = 0; i < lista.size(); i++)
	    StdOut.println(lista.get(i).getNome() + " - " + lista.get(i).getIdade() + " - " + lista.get(i).getFacul());

	

				   
    }
}

class FaculComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa a, Pessoa b) {
        return a.facul.compareTo(b.facul);
    }
}

class IdadeComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa a, Pessoa b) {
        return a.idade - b.idade;
    }
}
/*
class KeyValComparator implements Comparator<KeyVal> {

    public int compare(KeyVal a, KeyVal b) {
	return a.getVal() - b.getVal();
    }

}
*/


