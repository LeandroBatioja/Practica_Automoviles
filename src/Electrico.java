public class Electrico extends Automovil{

    private String tipoDeBateria;

    public Electrico(String fabricante, String modelo, String color, double cilindraje, int puertas,
                     String tipoDeBateria) {
        super(fabricante, modelo, color, cilindraje, puertas);
        this.tipoDeBateria = tipoDeBateria;
    }

    public String getTipoDeBateria() {
        return tipoDeBateria;
    }
    public void setTipoDeBateria(String tipoDeBateria) {
        this.tipoDeBateria = tipoDeBateria;
    }

    //Para los electricos
    @Override
    public void Acelerar() {
        System.out.println("El carro electrico acelera a 100km/h");
    }


    //@Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + getFabricante() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", color='" + getColor() + '\'' +
                ", cilindraje=" + getCilindraje() +'\'' +
                ", puertas=' " + getPuertas() +'\'' + '\'' +
                ", tipoDeBateria='" + tipoDeBateria + '\''+
                '}';
    }

}
