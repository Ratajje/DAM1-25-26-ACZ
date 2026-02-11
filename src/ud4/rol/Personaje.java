package ud4.rol;

import java.util.Random;

public class Personaje {
    private String nombre;
    private String raza;

    private int fuerza;
    private int agilidad;
    private int constitucion;

    private int nivel;
    private int experiencia;
    private int ptosDeVida;

    public static void main(String[] args) {
        Personaje personaje = new Personaje("Guldan", "enano", 1, 1, 1, 1, 1);

        System.out.println(personaje.getRaza());
    }

    /*============================== CONTRUSCTORES ====================================================*/
    public Personaje(String nombre, String raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia) {
        setNombre(nombre);
        setRaza(raza);
        setFuerza(fuerza);
        setAgilidad(agilidad);
        setConstitucion(constitucion);
        setNivel(nivel);
        setExperiencia(experiencia);
        this.ptosDeVida = 50 + this.constitucion;
    }

    public Personaje(String nombre, String raza, int fuerza, int agilidad, int constitucion) {
        this(nombre, raza, fuerza, agilidad, constitucion, 1, 0);
    }

    public Personaje(String nombre, String raza) {
        this(nombre, raza, generarRandom(), generarRandom(), generarRandom(), 1, 0);
    }

    public Personaje(String nombre) {
        this(nombre, "HUMANO");
    }

    private static int generarRandom() {
        Random rnd = new Random();
        int random = rnd.nextInt(1, 101);
        return random;
    }

    /*============================== METODOS ====================================================*/
    public void mostrar() {
        System.out.println("============ TU PERSONAJE ===========");
        System.out.println("|Nombre: " + this.nombre);
        System.out.println("|Raza : " + raza);
        System.out.println("------ CARACTERÍSTICAS FÍSICAS ------");
        System.out.println("|Fuerza: " + this.fuerza);
        System.out.println("|Agilidad: " + this.agilidad);
        System.out.println("|Constitucion: " + this.constitucion);
        System.out.println("---------- ESTADO DEL P.J -----------");
        System.out.println("|Nivel: " + this.nivel);
        System.out.println("|Experiencia: " + this.experiencia);
        System.out.println("|Estado actual de " + toString());
        System.out.println("=====================================");
    }

    public String toString() {
        return this.nombre + " (" + this.ptosDeVida + "/" + 150 + ")";
    }



    /*==== GETTER Y SETTER ====*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        String arrRaza[] = { "HUMANO", "ELFO", "ENANO", "HOBBIT", "ORCO", "TROLL" };

        boolean esRazaValida = false;

        for (int i = 0; i < arrRaza.length && !esRazaValida; i++) {
            if (arrRaza[i].equalsIgnoreCase(raza)) {
                esRazaValida = true;
            }
        }

        if (!esRazaValida) {
            throw new IllegalArgumentException("Tipo de raza invalida");
        }

        this.raza = raza.toUpperCase();
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if (fuerza < 1)
            throw new IllegalArgumentException("La FUERZA debe ser mayor o igual que 1");
        else
            this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        if (agilidad < 1)
            throw new IllegalArgumentException("La AGILIDAD debe ser mayor o igual que 1");
        else
            this.agilidad = agilidad;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public void setConstitucion(int constitucion) {
        if (constitucion < 1)
            throw new IllegalArgumentException("La CONSTITUCION debe ser mayor o igual que 1");
        else
            this.constitucion = constitucion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 1)
            throw new IllegalArgumentException("El NIVEL debe ser mayor o igual que 1");
        else
            this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        if (experiencia < 0)
            throw new IllegalArgumentException("La EXPERIENCIA debe se mayor o igual que 0");
        else
            this.experiencia = experiencia;
    }

}
