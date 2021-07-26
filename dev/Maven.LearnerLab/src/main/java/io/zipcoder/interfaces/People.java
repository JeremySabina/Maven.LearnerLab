package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {
    List<E> personList = new ArrayList<>();


    public void add(E person) {
        personList.add(person);
    }

    public E findById(Long id) {
        for (E person : personList) {
            Long currentId = person.getId();
            if (currentId.equals(id)) {
                return person;
            }
        }
         return null;
    }

    public boolean contains(E person) {
        personList.contains(person);
        return true;
    }


    public void remove(E person) {
        if(contains(person)) {
            personList.remove(person);
        }
    }

    public void removeById(Long id) {
        E person = findById(id);
        remove(person);
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
       return personList.size();
    }

    public abstract E[] toArray();

    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
