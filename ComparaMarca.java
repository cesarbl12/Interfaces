import java.util.Comparator;

public class ComparaMarca implements Comparator<Carro> {
    @Override
    
    public int compare (Carro o1, Carro o2){
        return o1.getMarca().compareToIgnoreCase(o2.getMarca());
    }
}
