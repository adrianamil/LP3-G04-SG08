package coordenada;

public class Coordenada {
    private int x;
    private int y;
    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }
    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c) {
        this.x = c.x;
        this.y = c.y;
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
    public double distancia(Coordenada c) {
        int deltaX = this.x - c.x;
        int deltaY = this.y - c.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public static double distancia(Coordenada c1, Coordenada c2) {
        int deltaX = c1.x - c2.x;
        int deltaY = c1.y - c2.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
