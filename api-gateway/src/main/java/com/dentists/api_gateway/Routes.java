package com.dentists.api_gateway;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class Routes {
    @Bean
    public RouterFunction<ServerResponse> clinicServiceRoute() {
        return GatewayRouterFunctions.route("clinic_service")
                .route(RequestPredicates.path("/api/clinic"), HandlerFunctions.http("http://localhost:8080"))
                .build();
    }
}
