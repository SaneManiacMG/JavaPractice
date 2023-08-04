package com.sane.maniac.mg.genericsandcollections;

import com.sane.maniac.mg.objectorientedconcepts.models.parents.User;

import java.util.Comparator;

public class ComparatorExample implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
