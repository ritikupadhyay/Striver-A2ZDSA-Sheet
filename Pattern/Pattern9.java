public static void pattern1(int n){
        for (int i=1;i<=n;i++){
            for (int j=0;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*(n-i+1)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        pattern(5);

    }
}
