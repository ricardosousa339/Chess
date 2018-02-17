public class Main {



    public static void main(String[] args){

        Tabuleiro tabuleiro = new Tabuleiro();


        tabuleiro.preencheTabuleiro();
        tabuleiro.mostraTabuleiro();


        tabuleiro.peaoBranco1.move(0,3,tabuleiro.tabuleiro);
        tabuleiro.preencheTabuleiro();
        tabuleiro.mostraTabuleiro();

        tabuleiro.peaoBranco2.move(1,3,tabuleiro.tabuleiro);

        tabuleiro.preencheTabuleiro();
        tabuleiro.mostraTabuleiro();

        tabuleiro.peaoBranco5.move(4,2,tabuleiro.tabuleiro);

        tabuleiro.preencheTabuleiro();
        tabuleiro.mostraTabuleiro();

        tabuleiro.peaoBranco5.move(4,3,tabuleiro.tabuleiro);

        tabuleiro.preencheTabuleiro();
        tabuleiro.mostraTabuleiro();


    }

}
