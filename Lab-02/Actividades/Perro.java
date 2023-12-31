/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/package-info.java to edit this template
 */
package principal4;

public class Perro {
    private String raza;
    private String color;
    private double temp;
    private int edad;
    public double peso;

    public Perro(String raza, String color) {
        this.raza = raza;
        this.color = color;
        this.temp = 37;
        this.edad = 1;
        this.peso = 0.5;
    }

    public Perro() {
        this.raza = "chusco";
        this.color = "gris";
        this.temp = 37;
        this.edad = 1;
        this.peso = 0.5;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", color=" + color + ", temp=" + temp + ", edad=" + edad + ", peso=" + peso + '}';
    }

    public void ladrar() {
        System.out.println("Guau Guau");
    }

    public void dormir() {
        System.out.println("zzz zzzz");
    }

    public void comer() {
        System.out.println("pka pka");
    }

    public void increEdad(int anios) {
        this.edad = this.edad + anios;
        cambiarPeso(anios);
    }

    private void cambiarPeso(int anios) {
        this.peso = this.peso + (anios * 1.5);
    }

}
