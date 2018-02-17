public class Bispo extends Peca{

    public boolean isCapturado = false;

    public static int BRANCO = 1;
    public static int PRETO = 2;

    public static int BISPO_BRANCO_1 = 30;
    public static int BISPO_BRANCO_2 = 31;

    public static int BISPO_PRETO_1 = 32;
    public static int BISPO_PRETO_2 = 33;

    public int posX;
    public int posY;

    public int cor;
    public int id;

    Bispo(int cor, int id, int posX, int posY){

        this.cor = cor;
        this.id = id;
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
        return "B_" +  (cor == this.BRANCO ? "B" : "P");
    }

}
