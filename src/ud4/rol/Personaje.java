package ud4.rol;

import java.util.Random;

public class Personaje {
    private String nombre;
    private Raza raza;

    private int fuerza;
    private int agilidad;
    private int constitucion;

    private int nivel;
    private int experiencia;
    private int ptosDeVida;

    final static int VIDA_MINIMA = 50;

    public static void main(String[] args) {
        Personaje personaje = new Personaje("Guldan", Raza.ENANO, 1, 1, 1, 1, 1);

        System.out.println(personaje.getRaza());
    }

    /*
     * ============================== CONTRUSCTORES
     * ====================================================
     */
    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia) {
        setNombre(nombre);
        setRaza(raza);
        setFuerza(fuerza);
        setAgilidad(agilidad);
        setConstitucion(constitucion);
        setNivel(nivel);
        setExperiencia(experiencia);
    }

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion) {
        this(nombre, raza, fuerza, agilidad, constitucion, 1, 0);
    }

    public Personaje(String nombre, Raza raza) {
        this(nombre, raza, generarRandom(1, 100), generarRandom(1, 100), generarRandom(1, 100));
    }

    public Personaje(String nombre) {
        this(nombre, Raza.HUMANO);
    }

    /* ======= UTILIDADES ======= */
    private static int generarRandom(int inicio, int fin) {
        Random rnd = new Random();
        int random = rnd.nextInt(inicio, fin + 1);
        return random;
    }

    /*
     * ============================== METODOS DE INSTANCIA
     * ====================================================
     */
    public void mostrar() {
        System.out.println("\n============ TU PERSONAJE ===========");
        System.out.println("|Nombre: " + this.nombre);
        System.out.println("|Raza : " + this.raza);
        System.out.println("------ CARACTERÍSTICAS FÍSICAS ------");
        System.out.println("|Fuerza: " + this.fuerza);
        System.out.println("|Agilidad: " + this.agilidad);
        System.out.println("|Constitucion: " + this.constitucion);
        System.out.println("---------- ESTADO DEL P.J -----------");
        System.out.println("|Nivel: " + this.nivel);
        System.out.println("|Experiencia: " + this.experiencia);
        System.out.println("|PV actual de " + this);
        System.out.println("=====================================\n");
    }

    public String toString() {
        return nombre + " (" + ptosDeVida + "/" + (getPvIniciales()) + ")";
    }

    private int getPvIniciales() {
        return constitucion + VIDA_MINIMA;
    }

    int sumarExperiencia(int puntos) {
        int expAnterior = experiencia / 1000;
        experiencia += puntos;

        return experiencia / 1000 - expAnterior;

        // @TODO Debemos subir de nivel aquí?
    }

    void subirNivel() {
        nivel++;

        fuerza = (int) (fuerza * 1.05);
        agilidad = (int) (agilidad * 1.05);
        constitucion = (int) (constitucion * 1.05);

        // @TODO Deberia el personaje recuperar algo o toda la vida
    }

    void curar() {
        if (ptosDeVida < getPvIniciales())
            ptosDeVida = getPvIniciales();
    }

    boolean perderVida(int puntos) {
        ptosDeVida -= puntos;

        return !estarVivo();
    }

    boolean estarVivo() {
        return ptosDeVida > 0;
    }

    /*=== COMBATE ===*/
    int atacar(Personaje enemigo) {
        int ataque = this.fuerza + generarRandom(1,100);

        int defensa = enemigo.agilidad + generarRandom(1, 100);

        int damage = ataque - defensa;

        if (damage > enemigo.ptosDeVida) {
            damage = enemigo.ptosDeVida;
        }

        if (damage > 0) {
            this.sumarExperiencia(damage);
            enemigo.sumarExperiencia(damage);
            enemigo.perderVida(damage);
        }

        return damage;
    }

    /* ==== GETTER Y SETTER ==== */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
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
        if (constitucion < 1) {
            throw new IllegalArgumentException("La CONSTITUCION debe ser mayor o igual que 1");
        }

        if (constitucion > 100) {
            throw new IllegalArgumentException("La CONSTITUCION no puede ser mayor de 100 (Max vida: 150)");
        }

        this.constitucion = constitucion;

        this.ptosDeVida = getPvIniciales();
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
