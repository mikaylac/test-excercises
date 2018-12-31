import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Thing {

    public String makeAbba(String a, String b){
        return a+b+b+a;
    }

    public String getFrontOfWordOneOnMatch(String wordOne, String wordTwo){
        if(wordTwo.length() <= wordOne.length()){
            if(wordTwo.substring(1).equals(wordOne.substring(1, wordTwo.length()))){
                return wordOne.substring(0, wordTwo.length());
            }
        }
        return "";
    }

    public boolean firstTwoCharsEqualLastTwoChars(String word){
        if(word.substring(0,2).equals(word.substring(word.length()-2))){
            return true;
        }
        return false;
    }

    public HashMap<String, Integer> mapPlayersToJerseys(ArrayList<String> players, ArrayList<Integer> jerseyNumbers){
        HashMap<String, Integer> mapped = new HashMap();
        for(int i = 0; i < players.size(); i++){
            mapped.put(players.get(i), jerseyNumbers.get(i));
        }
        return mapped;
    }

    public boolean containsTwoOrThree(int[] arrayToEvaluate){
        for(int i = 0; i < arrayToEvaluate.length; i++){
            if(arrayToEvaluate[i] == 2 || arrayToEvaluate[i] == 3){
                return true;
            }
        }
        return false;
    }

    public int[] returnFirstTwo(int[] arr){
        if(arr.length >= 2){
            return new int[]{arr[0], arr[1]};
        }
        return arr;
    }

    public Integer[] combineArrays(int[] arr1, int[] arr2){
        List<Integer> result = new ArrayList<>();
        for(int num : arr1){
            result.add(num);
        }
        for(int num : arr2){
            result.add(num);
        }
        return result.toArray(new Integer[4]);
    }
}
