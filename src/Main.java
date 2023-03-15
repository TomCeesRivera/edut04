import mijava.ratonera.Raton;

public class Main {
    public static void main(String[] args) {
        Raton mickey=new Raton();
        mickey.setEdad(1);
        mickey.setPeso(10);
        mickey.setTasaCrecimiento(0.5);

        Raton ratatouille=new Raton();
        ratatouille.setEdad(1);
        ratatouille.setPeso(8);
        ratatouille.setTasaCrecimiento(0.2);

        while(ratatouille.getPeso() <= mickey.getPeso()){
            evolucion(mickey, ratatouille);
        }
    }

    private static void evolucion(Raton a, Raton b) {
        System.out.printf("%s->%s   %s->%s\n","Ratatouille", b.datos(),"Mickey", a.datos());
        b.desarrollar();
        a.desarrollar();
        if(b.getEdad() >=60) b.setTasaCrecimiento(b.getTasaCrecimiento() +1);
    }
}