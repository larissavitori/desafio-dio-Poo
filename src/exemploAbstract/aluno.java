package exemploAbstract;

public class aluno extends Pessoa{
    @Override
    public void mostraDados() {
        System.out.println("É um aluno!");
    }
    @Override
    public void testaDado() {
        System.out.println("Testa dados de aluno!");
    }
}
