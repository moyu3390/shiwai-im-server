package com.im.imserver.domain.metrics.appquality;

import com.im.imserver.domain.metrics.SubMetric;
import com.im.imserver.domain.metrics.SubMetricType;

public class AppMetric extends SubMetric {

    public AppMetric(){
        this.subMetricType = SubMetricType.App;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getUnanimousWeight();
    }

    @Override
    public double calculateScore() {
        int appCount = super.getMetricItemList().size();
        if (appCount == 0){
            return 0;
        }
        double sumScore = super.calculateScore();
        return sumScore/appCount;
    }
}