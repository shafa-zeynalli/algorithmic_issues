package algoritm;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> strMap = new HashMap<>();

        for (String str: strs){
            String s = sortString(str);
            List<String> list = strMap.getOrDefault(s,new ArrayList<>());
            list.add(str);
            strMap.put(s, list);
        }
        List<List<String>> result = new ArrayList<>(strMap.values());
        return result;
    }

    private static String sortString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
