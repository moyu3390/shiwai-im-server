package com.im.imserver.dto;

import com.im.imserver.dto.clientobject.MiscMetricCO;
import com.im.imserver.dto.clientobject.RefactoringMetricCO;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * RefactoringMetricAddCmd
 *
 * @author Frank Zhang
 * @date 2019-03-04 11:04 AM
 */
@Data
public class RefactoringMetricAddCmd extends CommonCommand{
    @NotNull
    private RefactoringMetricCO refactoringMetricCO;
}
