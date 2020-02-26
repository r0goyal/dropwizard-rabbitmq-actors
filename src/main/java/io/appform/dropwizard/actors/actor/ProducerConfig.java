package io.appform.dropwizard.actors.actor;

import io.appform.dropwizard.actors.connectivity.ConnectionIsolationStrategy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProducerConfig {

    @NotNull
    private ConnectionIsolationStrategy connectionIsolationStrategy;

}