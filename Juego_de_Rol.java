package juego_de_rol;

public class Juego_de_Rol {

    public static void main(String[] args) {
        Player jugador1 = new Player();
        Player jugador2 = new Player();        
                
        jugador1.setNombre("Manu");
        jugador2.setNombre("Víctor");
        jugador2.golpear(jugador1);
        jugador1.golpear(jugador2);
        jugador2.golpear(jugador1);
        jugador1.golpear(jugador2);
    }    
}
