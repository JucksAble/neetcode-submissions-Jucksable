class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> word1 = mapString(s);
        HashMap<Character, Integer> word2 = mapString(t);

        return word1.equals(word2);
    }

    private HashMap<Character, Integer> mapString(String word){
        HashMap<Character, Integer> mappedWord = new HashMap<>();
        for(int i = 0; i < word.length(); i++){

            if(mappedWord.containsKey(word.charAt(i))){
                mappedWord.put(word.charAt(i), mappedWord.get(word.charAt(i))+1);
            }else{
                mappedWord.put(word.charAt(i), 1);
            }
        }
        return mappedWord;
    }

}
