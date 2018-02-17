public class Torre extends Peca {

    public boolean isCapturado = false;

    public static int BRANCO = 1;
    public static int PRETO = 2;

    public static int TORRE_BRANCA_1 = 26;
    public static int TORRE_BRANCA_2 = 27;

    public static int TORRE_PRETA_1 = 28;
    public static int TORRE_PRETA_2 = 29;

    public int posX;
    public int posY;

    public int cor;
    public int id;

    Torre(int cor, int id, int posX, int posY){

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
        return "T_" +  (cor == this.BRANCO ? "B" : "P");
    }

}
