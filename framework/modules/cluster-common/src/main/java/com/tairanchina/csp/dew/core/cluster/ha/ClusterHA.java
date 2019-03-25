/*
 * Copyright 2019. the original author or authors.
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

package com.tairanchina.csp.dew.core.cluster.ha;

import com.tairanchina.csp.dew.core.cluster.ha.dto.HAConfig;
import com.tairanchina.csp.dew.core.cluster.ha.entity.PrepareCommitMsg;

import java.sql.SQLException;
import java.util.List;

public interface ClusterHA {

    void init(HAConfig haConfig) throws SQLException;

    String mq_afterPollMsg(String addr, String msg);

    void mq_afterMsgAcked(String id);

    List<PrepareCommitMsg> mq_findAllUnCommittedMsg(String addr);

}