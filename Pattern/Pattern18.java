public static void pattern(int n){

        for (int i=1;i<=n;i++){
            char st= (char) ('A'+n-i);
            for(int j=1;j<=i;j++){
                System.out.print(st);
                st++;
            }

            System.out.println();

        }
    }
