/*
 * Copyright 2012 jts
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.jts.data.parser;

import ru.jts.data.AbstractDataParser;
import ru.jts.data.holder.FreewayInfoHolder;

/**
 * @author : Camelion
 * @date : 27.08.12  13:14
 */
public class FreewayInfoParser extends AbstractDataParser<FreewayInfoHolder> {
    private static FreewayInfoParser ourInstance = new FreewayInfoParser();

    public static FreewayInfoParser getInstance() {
        return ourInstance;
    }

    private FreewayInfoParser() {
        super(FreewayInfoHolder.getInstance());
    }

    @Override
    protected String getFileName() {
        return "data/freewayinfo.txt";
    }
}
