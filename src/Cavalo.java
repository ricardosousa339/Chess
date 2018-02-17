public class Cavalo extends Peca{

    public boolean isCapturado = false;

    public static int BRANCO = 1;
    public static int PRETO = 2;

    public static int CAVALO_BRANCO_1 = 34;
    public static int CAVALO_BRANCO_2 = 35;

    public static int CAVALO_PRETO_1 = 36;
    public static int CAVALO_PRETO_2 = 37;

    public int posX;
    public int posY;

    public int cor;
    public int id;

    Cavalo(int cor, int id, int posX, int posY){

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
        return "C_" +  (cor == this.BRANCO ? "B" : "P");
    }

}
