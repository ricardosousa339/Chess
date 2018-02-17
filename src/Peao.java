public class Peao extends Peca {



    public static int BRANCO = 1;
    public static int PRETO = 2;

    public static int PEAO_BRANCO_1 = 10;
    public static int PEAO_BRANCO_2 = 11;
    public static int PEAO_BRANCO_3 = 12;
    public static int PEAO_BRANCO_4 = 13;
    public static int PEAO_BRANCO_5 = 14;
    public static int PEAO_BRANCO_6 = 15;
    public static int PEAO_BRANCO_7 = 16;
    public static int PEAO_BRANCO_8 = 17;

    public static int PEAO_PRETO_1 = 18;
    public static int PEAO_PRETO_2 = 19;
    public static int PEAO_PRETO_3 = 20;
    public static int PEAO_PRETO_4 = 21;
    public static int PEAO_PRETO_5 = 22;
    public static int PEAO_PRETO_6 = 23;
    public static int PEAO_PRETO_7 = 24;
    public static int PEAO_PRETO_8 = 25;

    public int posX;
    public int posY;

    public int cor;
    public int id;

    Peao(int cor, int id, int posX, int posY){

        this.cor = cor;
        this.id = id;
        this.posX = posX;
        this.posY = posY;

    }

    public boolean move(int postX, int postY, Peca tabuleiro[][]){


        if(validaMovimento(this.posX,this.posY, postX,postY, tabuleiro,Tabuleiro.vazio)){

            this.posX = postX;
            this.posY = postY;

            return true;
        }
        else{

            return false;

        }




    }

    public boolean validaUniversal(int x, int y){

        if(x > 7 || x < 0 || y >7 || y < 0){


            return false;
        }
        return true;

    }

    public boolean validaMovimento(int preX, int preY, int postX, int postY, Peca tabuleiro[][], Vazio vazio){

        if(validaUniversal(postX,postY)){

            if(this.cor == this.BRANCO){

                //System.out.println(tabuleiro[preX][preY].id);


                if(preY == 1 && postX == preX && tabuleiro[postX][postY].id == 0){



                    if(postY == 2 || postY == 3){

                        return true;

                    }

                }
                if(postX == preX + 1 || postY == preY - 1){

                    if(tabuleiro[postX][postY].id != 0){

                        captura(tabuleiro[postX][postY]);

                        return true;

                    }

                }
                //TODO: terminar de implementar o movimento normal de avancar uma casa, depois terminar todos no preto tbm
                if(postX == preX && preY == postY + 1){

                    return true;

                }

            }
            if(this.cor == this.PRETO){

                if(preY == 1 && postX == preX && tabuleiro[postX][postY].id == 0){



                    if(postY == 2 || postY == 3){

                        return true;

                    }

                }

            }


        }
        return false;

    }
    public String toString(){
        return "P_" +  (cor == this.BRANCO ? "B" : "P");
    }

}
