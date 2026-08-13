import static main.search.BinearySearch.binarySearch;

void main() {
    int[] arr = {1, 2, 5, 7, 9, 10, 12};
    int index = binarySearch(arr, 7);

    System.out.println(index);
}
