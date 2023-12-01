public class DuplicatesInString {
    public static String removeDuplicate(String string, int index, StringBuilder stringBuilder){
        if (index == string.length()){
            return stringBuilder.toString();
        }

        char character = string.charAt(index);
        if (stringBuilder.indexOf(String.valueOf(character)) == -1) {
            stringBuilder.append(character);
        }
        return removeDuplicate(string, index+1, stringBuilder);
    }

    static void removeDuplicates(String string, int index, StringBuilder stringBuilder, boolean[] map){
        if (index == string.length()){
            System.out.println(stringBuilder.toString());
            return;
        }

        char currentCharacter = string.charAt(index);
        if(map[currentCharacter - 'a']){
            removeDuplicates(string, index+1, stringBuilder, map);
        }else {
            map[currentCharacter-'a'] = true;
            stringBuilder.append(currentCharacter);
            removeDuplicates(string, index+1, stringBuilder, map);
        }

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("Viiinaayy", 0, new StringBuilder()));
        removeDuplicates("akkkkkshhhay", 0, new StringBuilder(), new boolean[26]);
    }
}
