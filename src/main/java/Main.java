public class Main {

    public static void main(String[] args){

        TwoSum twoSum = new TwoSum();
        for(int a : twoSum.twoSum(new int[] {2, 7, 11, 15}, 9))
            System.out.println(a);
//        System.out.println(twoSum.twoSum(new int[] {2, 7, 11, 15}, 9));
    }

}
