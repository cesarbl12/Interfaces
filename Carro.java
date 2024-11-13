public class Carro implements Vehiculo,Comparable<Carro> {
    private String marca;
    private int anio;

    public Carro(String marca, int anio){
        this.marca = marca;
        this.anio = anio;
    }
    public Carro(){

    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public int getAnio(){
        return anio;
    }

    public void setAnio(int anio){
        this.anio=anio;
    }

    @Override
    public String getMarca(){
        return marca;
    }

    @Override
    public String acelera(){
        return "carro fast and fourios";
    }

    @Override
    public String desacelera(){
        return "carro tortuga";
    }

    public String toString(){
        return "El carro es de marca: "+marca+" del año "+anio;
    }


    @Override
    public int compareTo(Carro o) {
        return anio-o.getAnio();
    }

}
