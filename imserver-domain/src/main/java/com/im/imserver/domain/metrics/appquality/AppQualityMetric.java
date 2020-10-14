package com.im.imserver.domain.metrics.appquality;

import com.im.imserver.domain.metrics.MainMetric;
import com.im.imserver.domain.metrics.MainMetricType;
import com.im.imserver.domain.metrics.devquality.BugMetric;
import com.im.imserver.domain.user.UserProfile;

public class AppQualityMetric extends MainMetric {

    private AppMetric appMetric;

    public AppQualityMetric(UserProfile metricOwner){
        this.metricOwner = metricOwner;
        metricOwner.setAppQualityMetric(this);
        this.metricMainType = MainMetricType.APP_QUALITY;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getAppQualityWeight();
    }
}
