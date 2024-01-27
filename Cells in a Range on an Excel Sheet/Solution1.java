class Solution1 {
    public List<String> cellsInRange(String s) {
        List<String> Y = new ArrayList();
        StringBuilder y = new StringBuilder();
        char arr[] = s.toCharArray();
        for(char ch = arr[0]; ch <= arr[3]; ch = (char)(ch + 1)) {
            y.append(ch);
            for(char num = arr[1]; num <= arr[4]; num++) {
                y.append(num);
                Y.add(y.toString());
                y.deleteCharAt(1);
            }
            y.deleteCharAt(0);
        }
        return Y;
    }
}
