public static void pattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=0;j<n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
