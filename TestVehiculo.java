public class TestVehiculo {
    public static void main(String[] args) {
        Carro miCarro = new Carro();
        miCarro.setMarca("Honda");
        miCarro.setAnio(2000);
        System.out.println(miCarro.desacelera());
        System.out.println(miCarro.acelera());
        System.out.println(miCarro.prendeAlarma());
        System.out.println(miCarro.apagaAlarma());


        ControlVehiculo cv =new ControlVehiculo();
        cv.llenarCarros(20);
        System.out.println(cv);
        cv.ordenarMarca();
        System.out.println(cv);
    }
}
