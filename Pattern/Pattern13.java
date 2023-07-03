 public static void pattern(int n){
        int st=1;
        for (int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(st+" ");
                st++;
            }

            System.out.println();
        }
    }
