package com.amazon.tv.tvrecommendations.service;

import java.util.Date;

class SumAggregator<T> implements Aggregator<T> {
    private double mSum = 0.0d;

    SumAggregator() {
    }

    public void add(Date date, T value) {
        if (value instanceof Integer) {
            this.mSum += (Integer) value;
        } else if (value instanceof Long) {
            this.mSum += (double) (Long) value;
        } else if (value instanceof Double) {
            this.mSum += (Double) value;
        }
    }

    public double getAggregatedScore() {
        return this.mSum;
    }

    public void reset() {
        this.mSum = 0.0d;
    }
}
