/*
 * Copyright 2021 Grzegorz Grzybek
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

package com.github.grgrzybek.ocj;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VersionTest {

    public static final Logger LOG = LoggerFactory.getLogger(VersionTest.class);

    @Test
    public void version() throws IOException {
        Properties props = new Properties();
        props.load(getClass().getResourceAsStream("/version.properties"));
        LOG.info("{}/{}/{}", props.get("group"), props.get("artifact"), props.get("version"));
    }

}
