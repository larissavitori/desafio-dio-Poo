package exemploAbstract;

public class exemploabstract  {
     public static void main (String[] args){
          // vai dar erro -> Pessoa p1 = new Pessoa();
                  Professor pro1 = new Professor();
                  pro1.mostraDados();

                  aluno a1 = new aluno();
                  a1.mostraDados();

          System.out.println("-----------------");

          Pessoa p1 = new aluno();
          p1.testaDado();
          p1.mostraDados();

     }
}
