import java.lang.reflect.Array;
import java.util.Arrays;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0] = 3;
        nums[1] = 5;
        nums[2] = 1;
        nums[3] = 2;
        nums[4] = 91;

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}