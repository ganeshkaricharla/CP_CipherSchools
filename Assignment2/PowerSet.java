class PowerSet{
    static void generatePowerSet(int[] arr){
        int i=0;
        int[] subset=new int[arr.length];
        generatePowerSetHelper(arr,subset,i);
    }
    static void generatePowerSetHelper(int[] arr,int[] subset,int i){
        if(i>=(arr.length)){
            for(int j=0;j<subset.length;j++)
                System.out.print(subset[j]+" ");
            System.out.println();
        }
        else{
            subset[i]=0;
            generatePowerSetHelper(arr,subset,i+1);
            subset[i]=arr[i];
            generatePowerSetHelper(arr,subset,i+1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2};
        generatePowerSet(arr);
    }
}