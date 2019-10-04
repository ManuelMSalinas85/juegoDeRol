package juego_de_rol;

public class Player {
    public double vida = 100;
    public String nombre;
    
    public void setNombre( String unNombre){
        this.nombre = unNombre;
    }
    
    public void getNombre(){
        System.out.println(this.nombre);
    }
    
    public void getVida(){
        System.out.println("Los puntos restantes de vida de " + this.nombre + " son: " + this.vida);
    }
    
    public void golpear(Player unJugador) {
        int intensidad = (int)((Math.random())*100);
        unJugador.vida = unJugador.vida - intensidad;
        System.out.println("El golpe de " + nombre + " fue de: " + intensidad); 
        unJugador.getVida();
        if (unJugador.vida <=0) {
            System.out.println(unJugador.nombre + " ha perdido la batalla");
        }   
    }
}
