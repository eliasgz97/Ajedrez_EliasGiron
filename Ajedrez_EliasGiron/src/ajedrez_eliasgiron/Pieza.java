package ajedrez_eliasgiron;

public class Pieza {
    int x;
    int y;
    char letra;
    boolean white;

    public Pieza() {
    }

    public Pieza(int x, int y, char letra, boolean white) {
        this.x = x;
        this.y = y;
        this.letra = letra;
        this.white = white;
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

    //polimorfismo
    public boolean movimiento(int x, int y, int x2, int y2) {
        boolean valido = false;
        return valido;
    }
}
