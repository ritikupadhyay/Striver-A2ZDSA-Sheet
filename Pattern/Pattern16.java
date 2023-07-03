public static void pattern(int n){
        char st='A';
        for (int i=1;i<=n;i++){

            for(int j=0;j<i;j++){
                System.out.print(st+" ");
            }
            System.out.println();
            st++;
        }
    }
