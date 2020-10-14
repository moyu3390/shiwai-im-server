package com.im.imserver.command;

import com.alibaba.cola.dto.Response;
import com.im.imserver.domain.metrics.techcontribution.ContributionMetric;
import com.im.imserver.domain.metrics.techcontribution.MiscMetric;
import com.im.imserver.domain.metrics.techcontribution.MiscMetricItem;
import com.im.imserver.domain.user.UserProfile;
import com.im.imserver.dto.MiscMetricAddCmd;
import com.im.imserver.domain.gateway.MetricGateway;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * MiscMetricAddCmdExe
 *
 * @author Frank Zhang
 * @date 2019-03-04 11:15 AM
 */
@Component
public class MiscMetricAddCmdExe{

    @Resource
    private MetricGateway metricGateway;

    public Response execute(MiscMetricAddCmd cmd) {
        MiscMetricItem miscMetricItem = new MiscMetricItem();
        BeanUtils.copyProperties(cmd.getMiscMetricCO(), miscMetricItem);
        miscMetricItem.setSubMetric(new MiscMetric(new ContributionMetric(new UserProfile(cmd.getMiscMetricCO().getOwnerId()))));
        metricGateway.save(miscMetricItem);
        return Response.buildSuccess();
    }
}