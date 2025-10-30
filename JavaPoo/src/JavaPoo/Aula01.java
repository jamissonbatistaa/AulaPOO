
package JavaPoo;
public class Aula01 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNunConta(5445);
        p1.setTipo("CC");
        p1.setDono("jamisson");
        p1.setSaldo(0);
        p1.setStatus(true); 
        
        
       p1.abrirConta("CC");
        p1.estadoAtualObjeto();
    }
}
