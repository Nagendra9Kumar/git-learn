public class linearsearch {
    public static void main(String[] args) {
        int [] list = {1,2,3,4,5,6,7,8,9,0};
        int search = 9;
        int position = linearSearch(list, search);
        if (position==-1){
            System.err.println("Not Found! ");
        }else
        System.out.println("Found at: "+position);
    }
    public static int linearSearch(int[] li,int se){
        for (int i =0;i<li.length-1;i++){
            if (li[i]==se){
                return i;
            }
        }
        return -1;
    }
}
