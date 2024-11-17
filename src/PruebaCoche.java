public class PruebaCoche {

    public static void main(String[] args) {

    Coche coche1 = new Coche("Honda", "Civic", 150);

/*
        //Ejemplo de uso incorrecto del acceso a las propiedades
        System.out.println("Marca = " + coche1.marca);
        System.out.println("Modelo = " + coche1.modelo);
        System.out.println("Velocidad Maxima = " + coche1.velocidadMaxima);
*/

        System.out.println("Marca = " + coche1.getMarca());
        System.out.println("Modelo = " + coche1.getModelo());
        System.out.println("Velocidad Maxima = " + coche1.getVelocidadMaxima());


        coche1.Acelerar(30); // Incremento valido al ser positivo

        coche1.Acelerar(-30); // Incremento erróneo al ser negativo



    }
}
