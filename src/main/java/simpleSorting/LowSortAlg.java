package simpleSorting;

public class LowSortAlg {

    // Пузырьковая
    public static void bubbleSort(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    // Методом выбора
    public static void selectionSort(int[] array){
        int min;
        for (int out = 0; out < array.length - 1; out++){
            min = out;

            for (int in = out + 1; in < array.length; in++){
                if ( array[min] > array[in])
                    min = in;
            }

            if (min != out) {
                int temp = array[out];
                array[out] = array[min];
                array[min] = temp;
            }
        }
    }

    // Метод вставки
    public static void insertionSort(int[] a)
    {
        int in, out;
        for(out=1; out<a.length; out++) // out - разделительный маркер
        {
            int temp = a[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out
            while(in>0 && a[in-1] >= temp) // Пока не найден меньший элемент
            {
                a[in] = a[in-1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            a[in] = temp; // Вставить помеченный элемент
        }
    }
}
