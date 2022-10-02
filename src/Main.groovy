static void main(String[] args) {
    Integer[] array = [1 , 3 , 4 , 5 , 1 , 5 , 4];
    System.out.print(Arrays.toString(array) + " -> " + numberIdenticalValues(array));


}

static Map<Integer, Integer> numberIdenticalValues(Integer[] array) {
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer integer : array) {
        if (map.containsKey(integer)) {
            map.put(integer, map.get(integer) + 1);
        } else {
            map.put(integer, 1);
        }
    }
    return map;
}
