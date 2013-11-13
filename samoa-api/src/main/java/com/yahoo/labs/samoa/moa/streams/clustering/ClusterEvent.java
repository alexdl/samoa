
package com.yahoo.labs.samoa.moa.streams.clustering;

/*
 * #%L
 * SAMOA
 * %%
 * Copyright (C) 2010 RWTH Aachen University, Germany
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.EventObject;

public class ClusterEvent extends EventObject {

  private String type;
  private String message;
  private long timestamp;

  public ClusterEvent(Object source, long timestamp, String type, String message) {
    super(source);
    this.type = type;
    this.message = message;
    this.timestamp = timestamp;
  }

  public String getMessage(){
      return message;
  }

  public long getTimestamp(){
      return timestamp;
  }

  public String getType(){
      return type;
  }
}