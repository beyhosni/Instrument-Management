package com.example.InstrumentManager.config;


import com.example.InstrumentManager.graphql.InstrumentDataFetcher;
import com.example.InstrumentManager.graphql.MutationResolver;
import com.example.InstrumentManager.graphql.QueryResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {

    @Bean
    public InstrumentDataFetcher instrumentDataFetcher() {
        return new InstrumentDataFetcher();
    }

    @Bean
    public MutationResolver mutationResolver() {
        return new MutationResolver();
    }

    @Bean
    public QueryResolver queryResolver() {
        return new QueryResolver();
    }
}
