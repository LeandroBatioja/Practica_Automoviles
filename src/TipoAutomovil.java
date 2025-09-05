public enum TipoAutomovil {

    SEDAN("Sedan", 4, "Auto mediano"),
    STATION_WAGON("Station Wagon", 4, "Auto grande"),
    HATCHBACK("Hatchback", 4, "Auto compacto"),
    PICKUP("Pickup", 4, "Camioneta"),
    COUPE("Coupe", 2, "Auto pequeño"),
    CONVERTIBLE("Convertible", 2, "Auto deportivo"),
    FURGON("Furgon", 4, "Auto utilitario");

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    /*
        Para java se usa el Camel Case, en varios lenguaje de programacion se utliza
        Para python Snake Case- es unico
     */

    TipoAutomovil(String nombre, int numeroPuertas, String descripcion){
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    //Llamarlos con el get
    public String getNombre() {
        return nombre;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public String getDescripcion() {
        return descripcion;
    }






}
