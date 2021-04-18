package com.concurrency;

import org.junit.platform.engine.ConfigurationParameters;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfigurationStrategy;

/**
 * @author Nevri on 2021/4/13
 * @Title:
 * @Description:
 */
public class MyParallelExceutionConfigurationStrategy implements ParallelExecutionConfigurationStrategy {
    @Override
    public ParallelExecutionConfiguration createConfiguration(ConfigurationParameters configurationParameters) {
        int parallelism =4;
        //
        return new MyParallelExecutionConfiguration (parallelism, parallelism, 256 + parallelism, parallelism, 30);
    }
}
