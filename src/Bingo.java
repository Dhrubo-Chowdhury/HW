import java.util.*;

public class Bingo {

    static Set<String> seen = new HashSet<>();

    public static boolean isBingo(int[][] bingoCard, List<Integer> drawnNumbers){

        seen.clear();

        for(Integer num : drawnNumbers){
            //first column contains only numbers from 1-15
            if(num < 16){
                for(int i = 0; i < bingoCard.length; i++){
                    if(bingoCard[i][0] == num){
                        seen.add("r" + i + "c0");
                        if(isBingoVerify()) return true;
                        break;
                    }
                }
            } else if(num < 31){
                for(int i = 0; i < bingoCard.length; i++){
                    if(bingoCard[i][1] == num){
                        seen.add("r" + i + "c1");
                        if(isBingoVerify()) return true;
                        break;
                    }
                }
            } if(num < 46){
                for(int i = 0; i < bingoCard.length; i++){
                    if(bingoCard[i][2] == num){
                        seen.add("r" + i + "c2");
                        if(isBingoVerify()) return true;
                        break;
                    }
                }
            } if(num < 61){
                for(int i = 0; i < bingoCard.length; i++){
                    if(bingoCard[i][3] == num){
                        seen.add("r" + i + "c3");
                        if(isBingoVerify()) return true;
                        break;
                    }
                }
            } else {
                for(int i = 0; i < bingoCard.length; i++){
                    if(bingoCard[i][4] == num){
                        seen.add("r" + i + "c4");
                        if(isBingoVerify()) return true;
                        break;
                    }
                }
            }
        }

        return false;

    }

    public static boolean isBingoVerify(){

        if(seen.contains("r0c1") && seen.contains("r0c2") && seen.contains("r0c3") && seen.contains("r0c4") && seen.contains("r0c0")) return true;
        if(seen.contains("r1c1") && seen.contains("r1c2") && seen.contains("r1c3") && seen.contains("r1c4") && seen.contains("r1c0")) return true;
        if(seen.contains("r2c1") && seen.contains("r2c3") && seen.contains("r2c4") && seen.contains("r2c0")) return true;
        if(seen.contains("r3c1") && seen.contains("r3c2") && seen.contains("r3c3") && seen.contains("r3c4") && seen.contains("r3c0")) return true;
        if(seen.contains("r4c1") && seen.contains("r4c2") && seen.contains("r4c3") && seen.contains("r4c4") && seen.contains("r4c0")) return true;
        if(seen.contains("r0c0") && seen.contains("r1c0") && seen.contains("r2c0") && seen.contains("r3c0") && seen.contains("r4c0")) return true;
        if(seen.contains("r0c1") && seen.contains("r1c1") && seen.contains("r2c1") && seen.contains("r3c1") && seen.contains("r4c1")) return true;
        if(seen.contains("r0c2") && seen.contains("r1c2") && seen.contains("r3c2") && seen.contains("r4c2")) return true;
        if(seen.contains("r0c3") && seen.contains("r1c3") && seen.contains("r2c3") && seen.contains("r3c3") && seen.contains("r4c3")) return true;
        if(seen.contains("r0c4") && seen.contains("r1c4") && seen.contains("r2c4") && seen.contains("r3c4") && seen.contains("r4c4")) return true;
        if(seen.contains("r0c0") && seen.contains("r1c1") && seen.contains("r3c3") && seen.contains("r4c4")) return true;
        if(seen.contains("r4c0") && seen.contains("r3c1") && seen.contains("r1c3") && seen.contains("r0c4")) return true;

        return false;
    }

    public static void main(String[] args) throws Exception{

        int[][] bingoCard = new int[][]{
                {
                    8, 29, 35, 54, 65
                },
                {
                        13, 24, 44, 48, 67
                },
                {
                        9, 21, -1, 59, 63
                },
                {
                        7, 19, 34, 53, 61
                },
                {
                        1, 20, 33, 46, 72
                }
        };

        List<Integer> drawnNumbers = new ArrayList<>();
        drawnNumbers.add(8);
        drawnNumbers.add(24);
        drawnNumbers.add(53);
        drawnNumbers.add(72);

        List<Integer> drawnNumbers2 = new ArrayList<>();
        drawnNumbers2.add(13);
        drawnNumbers2.add(24);
        drawnNumbers2.add(44);
        drawnNumbers2.add(48);
        drawnNumbers2.add(67);

        System.out.println(drawnNumbers2);

        System.out.println(isBingo(bingoCard, drawnNumbers2));

        System.out.println(isBingo(bingoCard, drawnNumbers));

    }

}
