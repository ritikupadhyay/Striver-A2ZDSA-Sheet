 public static void pattern(int n){

        for (int i=1;i<=n;i++){
            char st='A';
            for(int j=0;j<i;j++){
                System.out.print(st+" ");
                st++;
            }

            System.out.println();
        }
    }
