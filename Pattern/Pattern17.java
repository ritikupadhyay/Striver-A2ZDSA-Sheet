public static void pattern(int n){

        for (int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            char st='A';
            for(int j=1;j<=i;j++){
                System.out.print(st);
                st++;
            }
            for(char ch=(char) (st-2);ch>='A';ch--){
                System.out.print(ch);
            }

            System.out.println();

        }
    }
