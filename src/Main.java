import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java es considerado con un Tipado Fuerte
        // Devido a que Debemos declarar la variable que vallamos a usar


//        Automovil chevrolet = new Automovil();
//
//        chevrolet.color = "ROJO";
//        chevrolet.modelo = "Dimax";
//        chevrolet.fabricante = "Chevrolet";
//        chevrolet.cilindraje = 1.5;
//
//        System.out.println(chevrolet.detalle());
//
//
//        System.out.println("*************************************");
//        System.out.println("*************************************");
//
//        Automovil dfsk = new Automovil();
//
//        dfsk.color = "Blanco";
//        dfsk.modelo = "Glory";
//        dfsk.fabricante = "Don feng";
//        dfsk.cilindraje = 1.5;
//
//        System.out.println(dfsk.detalle());


        //Usando El constructor
        Automovil kia = new Automovil("Kia Motors", "Europa Sportaje 2024", "Azul Marino", 1.6, 4);
        //Concatenar el objeto al enum que se creo - DESPUES DEL CONSTRUCTOR
        kia.setTipo(TipoAutomovil.SEDAN);

        System.out.println("\nauto.fabricante: " + kia.getFabricante());
        System.out.println("auto.modelo: " + kia.getModelo());
        System.out.println("auto.cilindraje: " + kia.getCilindraje());
        System.out.println("auto.color: " + kia.getColor());
        System.out.println("auto.tipo: " + kia.getTipo().getNombre());


        System.out.print("\n========================\n");

        Automovil dfsk = new Automovil("Dong Feng", "Glory", "Blanco", 1.6, 4);

        System.out.println("auto.fabricante: " + dfsk.getFabricante());
        System.out.println("auto.modelo: " + dfsk.getModelo());
        System.out.println("auto.cilindraje: " + dfsk.getCilindraje());
        System.out.println("auto.color: " + dfsk.getColor());

        //Con toString
        System.out.print("\n========================\n");
        System.out.println(kia.toString());


        System.out.print("\n========================\n");

        //Instanaciar Combustion
        Combustion CarreCombustion = new Combustion("Kia Motors", "Europa Sportaje 2024", "Azul Marino", 1.6, 4, "Combustion");
        System.out.println(CarreCombustion.toString());

        System.out.print("\n========================\n");
        //Instanciar Electrico
        Electrico CarreElectrico = new Electrico("Dong Feng", "Glory", "Blanco", 1.6, 4,"ion-litio");
        System.out.println(CarreElectrico.toString());

        System.out.print("\n========================\n");
        //Instanciar mensajes
        kia.Acelerar();
        kia.DisminuiVelocidad();
        dfsk.Detener();

        System.out.print("\n========================\n");
        //Instanciar mensajes Para combustion
        CarreCombustion.Acelerar();
        CarreElectrico.Acelerar();







    }
}