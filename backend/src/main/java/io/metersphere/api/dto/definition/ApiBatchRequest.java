package io.metersphere.api.dto.definition;

import io.metersphere.base.domain.ApiDefinitionWithBLOBs;
import io.metersphere.controller.request.OrderRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ApiBatchRequest extends ApiDefinitionWithBLOBs {
    private List<String> ids;
    private List<OrderRequest> orders;
    private String projectId;
}
