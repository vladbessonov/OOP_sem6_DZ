package sort;

import data.User;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());// описываем метод сортировки
            if (resultOfComparing == 0) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            } else {
                return resultOfComparing;
            }

        } else {
            return resultOfComparing;
        }

    }

}
