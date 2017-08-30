
import java.io.Serializable;

/*
 * Para que objetos do tipo Aluno possam 
 * ser salvos em disco, a classe Aluno
 * deve, obrigatoriamente, implementar a 
 * interface Serializable
 */
public class Aluno implements Serializable{
	
	protected String matricula;
	protected String nome;
	
	protected Float notaGA;
	protected Float notaGB;
	
	public Aluno(String matricula, String nome, Float notaGA, Float notaGB) {
		this.matricula = matricula;
		this.nome = nome;
		this.notaGA = notaGA;
		this.notaGB = notaGB;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getNotaGA() {
		return notaGA;
	}

	public void setNotaGA(Float notaGA) {
		this.notaGA = notaGA;
	}

	public Float getNotaGB() {
		return notaGB;
	}

	public void setNotaGB(Float notaGB) {
		this.notaGB = notaGB;
	}

	public float calculaNotaFinal(){
		return ((notaGA * 0.33f) + (notaGB * 0.67f));
	}
	
	public String toString(){
		return String.format("%s %s %.2f", matricula, nome, calculaNotaFinal());
	}

}
