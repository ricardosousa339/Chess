public class Rainha extends Peca{

    public boolean isCapturado = false;

    public static int BRANCO = 1;
    public static int PRETO = 2;

    public static int RAINHA_BRANCA = 38;

    public static int RAINHA_PRETA = 39;

    public int posX;
    public int posY;

    public int cor;



    Rainha(int cor, int id, int posX, int posY){

        this.cor = cor;
        this.posX = posX;
        this.posY = posY;

    }

    public boolean validaUniversal(int x, int y){

        if(x > 7 || x < 0 || y >7 || y < 0){
            return false;
        }
        return true;

    }
    public String toString(){
        return "Ra"  +  (cor == this.BRANCO ? "B" : "P");
    }

}
