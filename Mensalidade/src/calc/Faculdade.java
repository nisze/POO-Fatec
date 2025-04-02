package calc;

public class Faculdade {
    private final String nome;
    private final String ra;
    private final double nota;
    private final String curso;
    private double mensalidade;


    public Faculdade(String nome, String ra, double nota, String curso, double mensalidade) {
        this.nome = nome;
        this.ra = ra;
        this.nota = nota;
        this.curso = curso;
        this.mensalidade = (nota >= 9) ? mensalidade * 0.5 : mensalidade;
    }
    public Faculdade(String nome, String ra, double nota, String curso) {
        this.nome = nome;
        this.ra = ra;
        this.nota = nota;
        this.curso = curso;
    }

  /*  public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getCurso() {
        return curso;
    }

    public double getNota() {
        return nota;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }
*/
    public String toString() {
        return "\n~~~~~~ DADOS DO ALUNO ~~~~~~\n" +
                "Nome: " + nome + "\n" +
                "RA: " + ra + "\n" +
                "Nota: " + nota + "\n" +
                "Curso: " + curso + "\n" +
                "Mensalidade: R$" + mensalidade;
    }
}
