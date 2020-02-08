/*
 * Copyright 2020. the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ms.dew.core.doc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Collectors;

/**
 * Doc cluster auto configuration.
 *
 * @author gudaoxuri
 */
@Configuration
@ConditionalOnClass(DiscoveryClient.class)
public class DocClusterAutoConfiguration {

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * Doc controller doc controller.
     *
     * @return the doc controller
     */
    @Bean
    public DocController docController() {
        return new DocController(() ->
                discoveryClient.getServices().stream().map(serviceId -> {
                    ServiceInstance instance = discoveryClient.getInstances(serviceId).get(0);
                    return instance.getUri() + "/v2/api-docs";
                }).collect(Collectors.toList()));
    }

}
