package com.ocfranz.routes;

import com.ocfranz.handler.RequestHandlerFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class RouterFunctionConfig {
    @Bean
    public RouterFunction<ServerResponse> route(RequestHandlerFunction requestHandlerFunction){
        return RouterFunctions
                .route(GET("/api/flux").and(accept(MediaType.APPLICATION_JSON)), requestHandlerFunction::flux)
                .andRoute(GET("/api/mono").and(accept(MediaType.APPLICATION_JSON)), requestHandlerFunction::mono);
    }
}
