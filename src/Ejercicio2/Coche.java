package Ejercicio2;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;


    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }


    public void Acelerar(int incremento){
        if (incremento > 0 ){
            velocidadMaxima += incremento;
            System.out.println("La velocidad maxima ahora es de = " + velocidadMaxima);

        } else {
            System.out.println("El incremento debe ser positivo");


        }
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }




}
