package ajedrez_eliasgiron;

public class Caballo extends Pieza{
    public Caballo(int x, int y, char letra, boolean white) {
        super(x, y, letra, white);
    }

    public Caballo() {
    }
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    @Override
    public boolean movimiento(int x, int y, int x2, int y2) {
        
            if (((x-x2 == 2 || x2 - x == 2) || (x2 - x == 1 || x - x2 == 1)) && (((y - y2 == 2 || y2 - y == 2) || (y - y2 == 1 || y2 - y == 1)))) {
                return true;
            } else {
                return false;
            }
 
    }
}
