    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            int j=1;
            for(;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int l=j-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
