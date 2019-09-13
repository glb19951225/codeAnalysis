package stringAndLong;

/**
 * @auther GeLinBo
 * @date 2019/9/10 9:31
 */

public class Pet {

    private int num;
    public int[] a;

    public Pet(int num){
        this.num = num;
    }

    public void test(Pet pet){
        this.num += pet.num;
    }

    private int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
}
