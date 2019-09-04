package com.ccegos.gateway.filter;


import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Description: 全局过滤器
 * @author: tzj
 * @Date: 2019/9/4
 */
@Configuration
public class GatewayGlobalFilter implements GlobalFilter {

    long countSum = 0;
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String ip = exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();
        countSum++;
        System.out.println(countSum+ip);
        return chain.filter(exchange);
    }
}
