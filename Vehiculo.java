
public interface Vehiculo {
    String getMarca();
    String acelera();
    String desacelera();

    default String prendeAlarma(){
        return "Prendiendo la alarma del vehiculo.";
    }

    default String apagaAlarma(){
        return "Apagando alarma del vehiculo.";
    }
}
