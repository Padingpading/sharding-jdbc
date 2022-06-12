package com.mashibing.shardingsphere.hint;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class MyHintAlgorithm implements HintShardingAlgorithm<Long> {
    @Override
    public Collection<String> doSharding(final Collection<String> availableTargetNames, final HintShardingValue<Long> shardingValue) {
        Collection<String> result = new ArrayList<>();
        for (String each : availableTargetNames) {
            System.out.println("---------------each"+each);
            for (Long value : shardingValue.getValues()) {
                if (each.endsWith(String.valueOf(value % 2))) {
                    result.add(each);
                }
            }
        }
        return result;
    }
}