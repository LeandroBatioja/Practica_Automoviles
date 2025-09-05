public class Combustion extends Automovil{

    private String tipoDeMotor;

    public Combustion(String fabricante, String modelo, String color, double cilindraje, int puertas,
                      String tipoDeMotor) {
        super(fabricante, modelo, color, cilindraje, puertas);
        this.tipoDeMotor = tipoDeMotor;
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    //@Override
    public String toString() {
        return "Automovil{" +
                "fabricante= '" + getFabricante() + '\'' +
                ", modelo= '" + getModelo() + '\'' +
                ", color= '" + getColor() + '\'' +
                ", cilindraje=" + getCilindraje() +'\'' +
                ", puertas= ' " + getPuertas() +'\'' + '\'' +
                ", tipoDeMotor= '" + tipoDeMotor + '\''+
                '}';
    }

    //Mensaje para combustion
    @Override
    public void Acelerar() {
        System.out.println("El carro a combustion acelera a 100km/h");
    }

    /*
        El get lo obtiene y el set lo cambia
     */
}
