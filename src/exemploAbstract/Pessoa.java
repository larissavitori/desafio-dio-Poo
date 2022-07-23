package exemploAbstract;

public abstract class Pessoa {

    //método abstrato
    public abstract void mostraDados();

    //método concreto
    public void testaDado() {
        System.out.println("teste!");
    }
}
