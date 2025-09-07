public class Automovil {

    /*
        Funcionaludades public, private final
            1. El public es el por defecto, es decir haciendo que todo lo que este dentro pueda ser usado por todo del proyecto
            2. El private para proteger atributos para que nos sea usado por esta clase, pero no acceible para las exteriores, este es considerado un principio de encapsulamiento
            3. El final se lo utiliza para crear constancia, el parametro es definitivo osea no se puede cambiar
     */

      /*
        Funciones vacias sin parametros
        Funciones con parametro con retorno
        Funciones con parametro y sin retorno
     */

    /*
        Investigar, ¿QUE SON?, TIPO DE MEMORIA Y VELOCIDAD DE EJECUCION - DE LOS SIGUIENTES TEMAS
            Hashmaps
            Treemap
            Linkedhashmap

     */


    private String fabricante;
    private String modelo;
    private String color;
    private double cilindraje;
    private int puertas;

    private TipoAutomovil tipo;

    public Automovil(String fabricante, String modelo, String color, double cilindraje, int puertas) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.puertas = puertas;
    }


    //Getters Y Setters

    /*

     */
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    //Mensajes de Acciones
    public void Acelerar(){
        System.out.println("Electrico acelerado a 100km/h");
    }
    public void DisminuiVelocidad(){
        System.out.println("Electrico disminuiVelocidad a 50km/h");
    }
    public void Detener(){
        System.out.println("Electrico detenido");
    }


    //Metodo para dar atribuicion al Enum
    //No es instanacia , es un metodo
    //Este proceso es para llamar al entorno Enum
    //Tambien es considerado una Interfaz este metodo




    //    public String mostrarDetalle(){
//        String fabricante = "MAZDA";
//        StringBuilder sb = new StringBuilder();
//        sb.append("auto.fabricante = " + this.fabricante);
//        sb.append("\nauto.modelo = " + this.modelo);
//        sb.append("\nauto.cilindraje = " + this.cilindraje);
//        sb.append("\nauto.color = " + this.color);
//        return sb.toString();
//    }

    @Override
    public String toString() {
        return "Automovil{" +
                "\nfabricante= '" + this.fabricante + '\'' +
                ",\nTipo Automovil = " + this.getTipo().getNombre() +
                ",\nDescripcion = " + this.getTipo().getDescripcion() +
                ",\nmodelo= '" + this.modelo + '\'' +
                ",\ncolor= '" + this.color + '\'' +
                ",\ncilindraje= " + this.cilindraje +
                ", \npuertas= " + this.puertas +
                "'\n}'";
    }
}
