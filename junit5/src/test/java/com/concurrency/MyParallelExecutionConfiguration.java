package com.concurrency;

import lombok.Data;

/**
 * @author Nevri on 2021/4/13
 * @Title:
 * @Description:
 */
@Data
public class MyParallelExecutionConfiguration implements org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration {

    private final int parallelism;
    private final int minimumRunnable;
    private final int maxPoolSize;
    private final int corePoolSize;
    private final int keepAliveSeconds;

}
