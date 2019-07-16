package com.finalproject.automated.refactoring.tool.methods.detection.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Ismayadi Jamil
 * @version 1.0.0
 * @since 12 Juni 2019
 */

@Data
@Builder
public class IndexModel {

    private Integer start;

    private Integer end;
}
