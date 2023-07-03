    public static void pattern(int n){
        int st=1;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                st=0;
            }
            else{
                st=1;
            }
            for(int j=0;j<i;j++){
                System.out.print(st+" ");
                st=1- st;
            }

            System.out.println();
        }
    }
