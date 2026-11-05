class Solution {

    public String encode(List<String> strs) {

        StringBuffer buffer = new StringBuffer();
        for(String s : strs){
            buffer.append(s.length()).append('#').append(s);
        }
        return buffer.toString();

    }

    public List<String> decode(String str) {

        List<String> decoded = new ArrayList<>();
        int i = 0;
        int j = 0;
        while( i < str.length()){
            for(j=i;;j++){
                if(str.charAt(j)=='#'){
                    break;
                }
            }
            int length = Integer.parseInt(str.substring(i,j));
            String val = str.substring(j+1, j+1+length);
            decoded.add(val);
            j = j + length + 1;
            i = j;
        }
        return decoded;
    }
}
