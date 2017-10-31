package com.aswin.designpatterns.filters;

import java.util.List;


public interface GenericFilter<T> {
    List<T> getFilter(List<T> collections);
}
