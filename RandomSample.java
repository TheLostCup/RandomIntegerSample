import java.util.Arrays;
public class RandomSample{
    public static void main(String[] args){
        int[] list = { };
        int numbers = list.length/2;
        int[] newList = new int[numbers];
        int j = 0;
        for(int i = 0; i < list.length; i++){
            if (save() == true && j <newList.length){
                newList[j] = list[i];
                j++;
            }
        }
        while(ifZero(newList) == false){
            for(int z = 0; z < newList.length; z++){
                if (save() == true && repeat(newList, list[z]) == false && j <newList.length){
                    newList[j] = list[z];
                    j++;
                }
                ifZero(newList);
            }
        }
        printArray(newList);
        System.out.println("/n");
        Arrays.sort(newList);
        printArray(newList);
    }

    public static boolean save(){
        double num = 0;
        num = (int)(Math.random()*100);
        if (num >= 50)
            return true;
        return false;
    }

    public static boolean ifZero(int[] p){
        for(int j = 0; j < p.length; j++){
            if (p[j] == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean repeat(int[] q, int n){
        for (int i = 0; i < q.length; i++){
            if (n== q[i])
                return true;
        }
        return false;
    }

    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(", " + a[i]);
        }
    }
}