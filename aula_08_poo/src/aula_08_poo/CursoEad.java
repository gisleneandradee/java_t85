package aula_08_poo;

public class CursoEad {
	private String nomeCurso;
	private float mensalidade;
	private int totalHoras;
	private String nomeProfessor;
	private int modulos;
 
	public CursoEad(String nomeCurso, float mensalidade, int totalHoras, String nomeProfessor, int modulos) {
		this.nomeCurso = nomeCurso;
		this.mensalidade = mensalidade;
		this.totalHoras = totalHoras;
		this.nomeProfessor = nomeProfessor;
		this.modulos = modulos;
	}
	
	public CursoEad() {}
 
	public String getNomeCurso() {
		return nomeCurso;
	}
 
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
 
	public float getMensalidade() {
		return mensalidade;
	}
 
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
 
	public int getTotalHoras() {
		return totalHoras;
	}
 
	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}
 
	public String getNomeProfessor() {
		return nomeProfessor;
	}
 
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
 
	public int getModulos() {
		return modulos;
	}
 
	public void setModulos(int modulos) {
		this.modulos = modulos;
	}
	
	public void visualizar() {
		System.out.println("\n˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");
		System.out.println("                     Cursos EAD                    ");
		System.out.println("˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");
		System.out.printf("\nNome do curso: %s", this.nomeCurso);
		System.out.printf("\nValor da mensalidade: %.2f", this.mensalidade);
		System.out.printf("\nNome do professor: %s", this.nomeProfessor);
		System.out.printf("\nQuantidade de módulos: %d", this.modulos);
		System.out.printf("\nTotal de horas do curso: %d", this.totalHoras);
		System.out.println("\n˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜");
	}
	
	
}
 