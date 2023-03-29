import java.util.Arrays;

public class java_hm1 {

public static void main(String[] args) {
    System.out.println(isSumBetween10And20(5, 15)); // true
    System.out.println(isSumBetween10And20(7, 15)); // false
    System.out.println(isSumBetween10And20(2, 6)); // false

    System.out.println(isPositive(5)); // true
    System.out.println(isPositive(-3)); // false

    printString("abcd", 5); // abcdabcdabcdabcdabcd
    System.out.println(isLeapYear(2000));

    System.out.println(Arrays.toString(createArray(5, 8)));
    int[] arr1 ={1,1,0,0,1,0,0,0,1,1};
    System.out.println(Arrays.toString(arr1));
    changeArray(arr1);
    System.out.println(Arrays.toString(arr1));

    int[] arr2 ={ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.println(Arrays.toString(arr2));
    changeArray1(arr2);
    System.out.println(Arrays.toString(arr2));

    int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
    fillDioganal(array);
    for (int i = 0; i < array.length; i++){
        System.out.println(Arrays.toString(array[i]));
    }
    
    //int x = array[2][3];
}

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
private static boolean isSumBetween10And20(int a, int b) {
    // проверить, что сумма a и b лежит между 10 и 20
    if ((a + b) <= 20 && (a + b) >= 10) return true;
    return false;
}

private static boolean isPositive(int x) {
    // проверить, что х положительное
    if (x > 0) return true;
    return false;
}

private static void printString(String source, int repeat) {
    // напечатать строку source repeat раз
    for (int i = 0; i < repeat; i++){
        System.out.print(source);
    }
}

private static boolean isLeapYear(int year) {
    // проверить, является ли год високосным. если да - return true
    // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
    if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) return true;
    return false;
}

private static int[] createArray(int len, int initialValue) {
    // должен вернуть массив длины len, каждое значение которого равно initialValue
    int[] rez = new int [len];
    for (int i = 0; i < len; i++){
        rez[i] = initialValue;
    }
    return rez;
}

private static void changeArray(int[] arr){
 for(int i = 0; i < arr.length; i++){
    if (arr[i] == 0) {
        arr[i] = 1;
    } else if (arr[i] == 1){
        arr[i] = 0;
    }
 }
}

private static void changeArray1(int[] arr){
    for(int i = 0; i < arr.length; i++){
       if (arr[i] < 6) {
           arr[i] *=2;
       } 
    }
   }

private static void fillDioganal(int[][] arr){
    for (int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr[i].length; j++){
            if((i == j) ||(j == arr.length-1-i)){
                arr[i][j] = 1;
            }
        }
    }
}
}
/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */