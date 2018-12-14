/*
 * This file is part of dependency-check-core.
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
 *
 * Copyright (c) 2018 Jeremy Long. All Rights Reserved.
 */
package org.owasp.dependencycheck.dependency;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.owasp.dependencycheck.data.cwe.CweDB;

/**
 * Collection of CWEs with a pretty print implemented in the toString().
 *
 * @author Jeremy Long
 */
public class CweSet {

    private final Set<String> cwes = new HashSet<>();

    /**
     * Get the value of CWEs.
     *
     * @return the value of CWEs
     */
    public Set<String> getCwes() {
        return cwes;
    }

    /**
     * Adds a CWE to the set.
     *
     * @param cwe new CWE to add
     */
    public void addCwe(String cwe) {
        this.cwes.add(cwe);
    }

    @Override
    public String toString() {
        return cwes.stream().map(cwe -> CweDB.getName(cwe)).collect(Collectors.joining(" "));
    }

    /**
     * Streams the CWEs.
     *
     * @return the stream of CWE
     */
    public Stream<String> stream() {
        return cwes.stream();
    }
}