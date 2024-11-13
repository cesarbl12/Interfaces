import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
public class ControlVehiculo {
    
    private ArrayList<Carro> misCarros;

    public ControlVehiculo(){
        misCarros = new ArrayList<>();
    }

    public void llenarCarros(int cantidad){
        String [] marcas = {"Honda","Toyota","Nissan","Chevrolet","Ford","Mercedes","BMW"};
        Random aleatorio = new Random();
        for (int i=0; i<cantidad;i++){
            misCarros.add(new Carro(marcas[aleatorio.nextInt(marcas.length)],aleatorio.nextInt(25)+2000));
        }
    }

    public String toString(){
        StringBuffer cadena = new StringBuffer();
        for (Carro misCarro : misCarros){
            cadena.append(misCarro);
            cadena.append("\n");
        }
        return cadena.toString();
    }

    public void ordenar(){
        Collections.sort(misCarros);
    }

    public void ordenarMarca(){
        Collections.sort(misCarros,new ComparaMarca());
    }
}
