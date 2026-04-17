class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedWords = new HashMap<>();
        
        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String signature = new String(charArray);
            
            if (!groupedWords.containsKey(signature)) {
                groupedWords.put(signature, new ArrayList<>());
            }
            
            groupedWords.get(signature).add(word);
        } 
        
        return new ArrayList<>(groupedWords.values());
    }
}