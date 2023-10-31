package com.gerhard.docker.gateway.common.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 路由模型
 * @Description: @TODO
 * @Author: guanhua
 * @UpdateUser: guanhua
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class GatewayRouteDefinition {
    /**
     * 路由ID
     */
    private String id;

    /**
     * 路由断言集合
     */
    private List<GatewayPredicateDefinition> predicates = new ArrayList();
    /**
     * 路由过滤器集合
     */
    private List<GatewayFilterDefinition> filters = new ArrayList();

    /**
     * 路由规则转发的目标uri
     */
    private String uri;
    /**
     * 路由执行的顺序
     */
    private int order;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<GatewayPredicateDefinition> getPredicates() {
        return predicates;
    }

    public void setPredicates(List<GatewayPredicateDefinition> predicates) {
        this.predicates = predicates;
    }

    public List<GatewayFilterDefinition> getFilters() {
        return filters;
    }

    public void setFilters(List<GatewayFilterDefinition> filters) {
        this.filters = filters;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
