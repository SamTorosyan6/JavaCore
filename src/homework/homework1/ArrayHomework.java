package homework.homework1;

public class ArrayHomework {

    public static void main(String[] args) {

        //1.Ունենք թվերի մասիվ, մեջը խառը 10 թիվ։ Ունենք int n = 6; Պետք է հաշվել,
        // թե քանի հատ n փոփոխականից կա մեր թվերի մեջ, ու տպել քանակը։ Եթե չկա՝ 0.

        int[] nums = {12, 8, 21, 6, 9, 22, 6, 14, 5, 21};
        int n = 6;
        int countOfSix = 0;

        for (int x : nums) {

            if (x == n) {
                countOfSix += 1;

            }
        }
        if (countOfSix == 0) {
            System.out.println("6-երի քանակը։ " + 0);
        } else {
            System.out.println("6-երի քանակը։ " + countOfSix);
        }

        System.out.println();
        System.out.println();

        //2.Ունենք թվերի մասիվ, մեջը խառը 10 թիվ, գրել ծրագիր, որը էդ մասիվի մեջի թվերը
        // թարս կդասավորի։

        int[] newArray = new int[10];
        int numsLength = nums.length;
        int indexOfNewArray = 0;
        int index = 0;

        do {
            newArray[indexOfNewArray] = nums[numsLength - 1];
            indexOfNewArray++;
        } while (--numsLength > 0);

        System.out.println("Մասիվի թվերը հակառակ դասավորված");

        for (int num : nums) {

            num = newArray[index];
            index++;
            System.out.print(num + " ");

        }
        System.out.println();
        System.out.println();
        //3.Ունենք թվերի մասիվ, մեջը խառը 10 թիվ, գրել ծրագիր, որը էդ մասիվի մեջ կհաշվի թե
        // քանի կրկնվող թիվ կա։

        int repeatNums = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = i; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > 1) {
                repeatNums++;

            }
        }

        System.out.println("Կրկնվող թվերի քանակը: " + repeatNums);

        System.out.println();
        System.out.println();

        //4.Ունենք char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'} կամ
        // նմանատիպ ցանկացած մասիվ, որտեղ կլինեն հայերեն սինվոլները։ Պետք է ստուգել,
        // թե քանի ձայնավոր կա այս մասիվի մեջ, ու տպել քանակը։

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowels = {'ա', 'ե', 'է', 'ը', 'ի', 'ո', 'u', 'օ'};
        int countOfVowels = 0;

        for (char x : chars) {

            switch (x) {
                case 'ա':
                    countOfVowels += 1;
                    break;
                case 'ե':
                    countOfVowels += 1;
                    break;
                case 'է':
                    countOfVowels += 1;
                    break;
                case 'ը':
                    countOfVowels += 1;
                    break;
                case 'ի':
                    countOfVowels += 1;
                    break;
                case 'ո':
                    countOfVowels += 1;
                    break;
                case 'u':
                    countOfVowels += 1;
                    break;
                case 'օ':
                    countOfVowels += 1;
                    break;
                default: continue;

            }

        }
        System.out.println("Ձայնավորների քանակը։ " + countOfVowels);

    }

}


