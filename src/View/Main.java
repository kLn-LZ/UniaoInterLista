package View;

import Model.Lista;

public class Main {
    public static void main(String[] args) throws Exception {

        Lista A = new Lista();
        Lista B = new Lista();
        Lista I = new Lista();
        Lista U = new Lista();



        A.addFirst(16);
        A.addFirst(7);
        A.addFirst(9);
        A.addFirst(12);
        A.addFirst(8);
        A.addFirst(5);
        A.addFirst(3);

        B.addFirst(7);
        B.addFirst(3);
        B.addFirst(2);
        B.addFirst(6);
        B.addFirst(9);

        int aTam = A.size() - 1;
        int bTam = B.size() - 1;

        for(int i = 0; i <= aTam; i++) {

            for(int j = 0; j <= bTam; j++) {
                if (A.get(i) == B.get(j)){
                    I.addFirst(A.get(i));
                }

            }
            if(i <= bTam) {
                U.addFirst(B.get(i));
            }
            U.addFirst(A.get(i));

        }


        int cont = 0;
        int uTam = U.size() - 1;
        System.out.println("União");
        while(cont <= uTam) {
            System.out.println(U.get(cont));
            cont++;
        }



        cont = 0;
        int iTam = I.size() - 1;
        System.out.println("Intesecção");
        while(cont <= iTam) {
            System.out.println(I.get(cont));
            cont++;
        }


    }

}
