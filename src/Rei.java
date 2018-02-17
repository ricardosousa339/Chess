public class Rei extends Peca{

    public boolean isEmCheque = false;

    public static int BRANCO = 1;
    public static int PRETO = 2;

    public static int REI_BRANCO = 40;
    public static int REI_PRETO = 41;

    public int posX;
    public int posY;

    public int cor;

    Rei(int cor, int id, int posX, int posY){

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
        return "Re" +  (cor == this.BRANCO ? "B" : "P");
    }

}
