public class Tabuleiro {



    Peao peaoBranco1 = new Peao(Peao.BRANCO, Peao.PEAO_BRANCO_1, 0, 1);
    Peao peaoBranco2 = new Peao(Peao.BRANCO, Peao.PEAO_BRANCO_2, 1, 1);
    Peao peaoBranco3 = new Peao(Peao.BRANCO, Peao.PEAO_BRANCO_3, 2, 1);
    Peao peaoBranco4 = new Peao(Peao.BRANCO, Peao.PEAO_BRANCO_4, 3, 1);
    Peao peaoBranco5 = new Peao(Peao.BRANCO, Peao.PEAO_BRANCO_5, 4, 1);
    Peao peaoBranco6 = new Peao(Peao.BRANCO, Peao.PEAO_BRANCO_6, 5, 1);
    Peao peaoBranco7 = new Peao(Peao.BRANCO, Peao.PEAO_BRANCO_7, 6, 1);
    Peao peaoBranco8 = new Peao(Peao.BRANCO, Peao.PEAO_BRANCO_8, 7, 1);

    Bispo bispoBranco1 = new Bispo(Bispo.BRANCO, Bispo.BISPO_BRANCO_1, 2, 0);
    Bispo bispoBranco2 = new Bispo(Bispo.BRANCO, Bispo.BISPO_BRANCO_2, 5, 0);

    Cavalo cavaloBranco1 = new Cavalo(Cavalo.BRANCO, Cavalo.CAVALO_BRANCO_1, 1, 0);
    Cavalo cavaloBranco2 = new Cavalo(Cavalo.BRANCO, Cavalo.CAVALO_BRANCO_2, 6, 0);

    Torre torreBranca1 = new Torre(Torre.BRANCO, Torre.TORRE_BRANCA_1, 0, 0);
    Torre torreBranca2 = new Torre(Torre.BRANCO, Torre.TORRE_BRANCA_2, 7, 0);

    Rainha rainhaBranca = new Rainha(Rainha.BRANCO, Rainha.RAINHA_BRANCA, 3, 0);

    Rei reiBranco = new Rei(Rei.BRANCO, Rei.REI_BRANCO, 4, 0);

    Peao peaoPreto1 = new Peao(Peao.PRETO, Peao.PEAO_PRETO_1, 0, 6);
    Peao peaoPreto2 = new Peao(Peao.PRETO, Peao.PEAO_PRETO_2, 1, 6);
    Peao peaoPreto3 = new Peao(Peao.PRETO, Peao.PEAO_PRETO_3, 2, 6);
    Peao peaoPreto4 = new Peao(Peao.PRETO, Peao.PEAO_PRETO_4, 3, 6);
    Peao peaoPreto5 = new Peao(Peao.PRETO, Peao.PEAO_PRETO_5, 4, 6);
    Peao peaoPreto6 = new Peao(Peao.PRETO, Peao.PEAO_PRETO_6, 5, 6);
    Peao peaoPreto7 = new Peao(Peao.PRETO, Peao.PEAO_PRETO_7, 6, 6);
    Peao peaoPreto8 = new Peao(Peao.PRETO, Peao.PEAO_PRETO_8, 7, 6);

    Bispo bispoPreto1 = new Bispo(Bispo.PRETO, Bispo.BISPO_PRETO_1, 2, 7);
    Bispo bispoPreto2 = new Bispo(Bispo.PRETO, Bispo.BISPO_PRETO_2, 5, 7);

    Cavalo cavaloPreto1 = new Cavalo(Cavalo.PRETO, Cavalo.CAVALO_PRETO_1, 1, 7);
    Cavalo cavaloPreto2 = new Cavalo(Cavalo.PRETO, Cavalo.CAVALO_PRETO_2, 6, 7);

    Torre torrePreta1 = new Torre(Torre.PRETO, Torre.TORRE_PRETA_1, 0, 7);
    Torre torrePreta2 = new Torre(Torre.PRETO, Torre.TORRE_PRETA_2, 7, 7);

    Rainha rainhaPreta = new Rainha(Rainha.PRETO, Rainha.RAINHA_PRETA, 4, 7);

    Rei reiPreto = new Rei(Rei.PRETO, Rei.REI_PRETO, 3, 7);

    Peca tabuleiro[][] = new Peca[8][8];


    static Vazio vazio = new  Vazio();

    public int getId(int x, int y) {


        return tabuleiro[x][y].id;

    }



    public void preencheTabuleiro() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                tabuleiro[i][j] = Tabuleiro.vazio;

            }
        }


        this.tabuleiro[peaoBranco1.posX][peaoBranco1.posY] = peaoBranco1;
        this.tabuleiro[peaoBranco2.posX][peaoBranco2.posY] = peaoBranco2;
        this.tabuleiro[peaoBranco3.posX][peaoBranco3.posY] = peaoBranco3;
        this.tabuleiro[peaoBranco4.posX][peaoBranco4.posY] = peaoBranco4;
        this.tabuleiro[peaoBranco5.posX][peaoBranco5.posY] = peaoBranco5;
        this.tabuleiro[peaoBranco6.posX][peaoBranco6.posY] = peaoBranco6;
        this.tabuleiro[peaoBranco7.posX][peaoBranco7.posY] = peaoBranco7;
        this.tabuleiro[peaoBranco8.posX][peaoBranco8.posY] = peaoBranco8;

        this.tabuleiro[bispoBranco1.posX][bispoBranco1.posY] = bispoBranco1;
        this.tabuleiro[bispoBranco2.posX][bispoBranco2.posY] = bispoBranco2;

        this.tabuleiro[cavaloBranco1.posX][cavaloBranco1.posY] = cavaloBranco1;
        this.tabuleiro[cavaloBranco2.posX][cavaloBranco2.posY] = cavaloBranco2;

        this.tabuleiro[torreBranca1.posX][torreBranca1.posY] = torreBranca1;
        this.tabuleiro[torreBranca2.posX][torreBranca2.posY] = torreBranca2;

        this.tabuleiro[rainhaBranca.posX][rainhaBranca.posY] = rainhaBranca;
        this.tabuleiro[reiBranco.posX][reiBranco.posY] = reiBranco;


        this.tabuleiro[peaoPreto1.posX][peaoPreto1.posY] = peaoPreto1;
        this.tabuleiro[peaoPreto2.posX][peaoPreto2.posY] = peaoPreto2;
        this.tabuleiro[peaoPreto3.posX][peaoPreto3.posY] = peaoPreto3;
        this.tabuleiro[peaoPreto4.posX][peaoPreto4.posY] = peaoPreto4;
        this.tabuleiro[peaoPreto5.posX][peaoPreto5.posY] = peaoPreto5;
        this.tabuleiro[peaoPreto6.posX][peaoPreto6.posY] = peaoPreto6;
        this.tabuleiro[peaoPreto7.posX][peaoPreto7.posY] = peaoPreto7;
        this.tabuleiro[peaoPreto8.posX][peaoPreto8.posY] = peaoPreto8;

        this.tabuleiro[bispoPreto1.posX][bispoPreto1.posY] = bispoPreto1;
        this.tabuleiro[bispoPreto2.posX][bispoPreto2.posY] = bispoPreto2;

        this.tabuleiro[cavaloPreto1.posX][cavaloPreto1.posY] = cavaloPreto1;
        this.tabuleiro[cavaloPreto2.posX][cavaloPreto2.posY] = cavaloPreto2;

        this.tabuleiro[torrePreta1.posX][torrePreta1.posY] = torrePreta1;
        this.tabuleiro[torrePreta2.posX][torrePreta2.posY] = torrePreta2;

        this.tabuleiro[rainhaPreta.posX][rainhaPreta.posY] = rainhaPreta;
        this.tabuleiro[reiPreto.posX][reiPreto.posY] = reiPreto;


    }

    public void mostraTabuleiro() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {


                System.out.print(this.tabuleiro[j][i].toString() + " ");

            }
            System.out.println();
        }
        System.out.println();

    }
}


