class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, String> wordList = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < 1){
                wordList.put(i, "._.");
            }else{
                wordList.put(i, mapString(strs[i]));
            }
        }

        List<String> uniqueSignatures = new ArrayList();

        for(Integer key : wordList.keySet()){
            if(!uniqueSignatures.contains(wordList.get(key))){
                uniqueSignatures.add(wordList.get(key));
            }
        }

        List<List<String>> result = new ArrayList(){};
        
        for(int i = 0; i < uniqueSignatures.size(); i++){
            List<String> groupedAnagram = new ArrayList();
            for(Integer key : wordList.keySet()){
                if(uniqueSignatures.get(i).equals(wordList.get(key))){
                    groupedAnagram.add(strs[key]);
                }
            }
            result.add(groupedAnagram);
        }

        return result;
    }

    private String mapString(String word){
        TreeMap<Character, Integer> hashMappedWord = new TreeMap<>();
        for(int i = 0; i < word.length(); i++){
            if(hashMappedWord.containsKey(word.charAt(i))){
                hashMappedWord.put(word.charAt(i), hashMappedWord.get(word.charAt(i))+1);
            }else{
                hashMappedWord.put(word.charAt(i), 1);
            }
        }

        String mappedWord = "";
        for(Character key : hashMappedWord.keySet()){
            mappedWord = mappedWord + key + hashMappedWord.get(key);
        }

        return mappedWord;
    }
}
