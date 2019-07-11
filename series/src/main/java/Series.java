package main.java;

import java.util.*;

public class Series {

    String series;

    public Series(String series) {
        this.series = series;
    }

    public List<String> slices(int noOfSlices) {

        if (noOfSlices <= 0) {
            throw new IllegalArgumentException("Slice size is too small.");
        }
        else if (noOfSlices > series.length()) {    
            throw new IllegalArgumentException("Slice size is too big.");
        }

        List<String> slicesList = new ArrayList<String>();

        if (noOfSlices == series.length()) {
            slicesList.add(series);
            return slicesList;
        }

        for (int i = 0; i <= series.length() - noOfSlices; i++) {
            slicesList.add(series.substring(i, i + noOfSlices));
        }
        return slicesList;
    }
}