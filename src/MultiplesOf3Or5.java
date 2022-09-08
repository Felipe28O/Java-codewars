public class MultiplesOf3Or5 {
    public int exec(int number) {
        int tmp = 0;

        if (number<1){
            return 0;
        }
        for (int i = 1; i < number; i ++)
        tmp += validator(i);
        return tmp;
    }

    public int validator (int iterator){
        if (iterator % 3 == 0 || iterator % 5 == 0){
            return iterator;
        }
        else {
            return 0;
        }
    }
}
