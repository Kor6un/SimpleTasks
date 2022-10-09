
    /*
        Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
        Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
    */

public class Task1 {
    double[] array;

    public Task1(double[] array) {
        this.array = array;
    }

    public double max (double[] array) {
        double max;
        max = array[0];
        for (double v : array) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public double min (double[] array) {
        double min;
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public double avg (double[] array) {
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i]/array.length;
        }
        return avg;
    }
}
