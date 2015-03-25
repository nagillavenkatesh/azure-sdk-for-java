/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.scheduler.models;

import com.microsoft.windowsazure.core.AzureOperationResponse;
import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
* The Get Job History operation response.
*/
public class JobGetHistoryResponse extends AzureOperationResponse implements Iterable<JobGetHistoryResponse.JobHistoryEntry> {
    private ArrayList<JobGetHistoryResponse.JobHistoryEntry> jobHistory;
    
    /**
    * Optional. The job history entries.
    * @return The JobHistory value.
    */
    public ArrayList<JobGetHistoryResponse.JobHistoryEntry> getJobHistory() {
        return this.jobHistory;
    }
    
    /**
    * Optional. The job history entries.
    * @param jobHistoryValue The JobHistory value.
    */
    public void setJobHistory(final ArrayList<JobGetHistoryResponse.JobHistoryEntry> jobHistoryValue) {
        this.jobHistory = jobHistoryValue;
    }
    
    /**
    * Initializes a new instance of the JobGetHistoryResponse class.
    *
    */
    public JobGetHistoryResponse() {
        super();
        this.setJobHistory(new LazyArrayList<JobGetHistoryResponse.JobHistoryEntry>());
    }
    
    /**
    * Gets the sequence of JobHistory.
    *
    */
    public Iterator<JobGetHistoryResponse.JobHistoryEntry> iterator() {
        return this.getJobHistory().iterator();
    }
    
    /**
    * A job history entry.
    */
    public static class JobHistoryEntry {
        private JobHistoryActionName actionName;
        
        /**
        * Optional. The action of this execution, MainAction or ErrorAction.
        * @return The ActionName value.
        */
        public JobHistoryActionName getActionName() {
            return this.actionName;
        }
        
        /**
        * Optional. The action of this execution, MainAction or ErrorAction.
        * @param actionNameValue The ActionName value.
        */
        public void setActionName(final JobHistoryActionName actionNameValue) {
            this.actionName = actionNameValue;
        }
        
        private Calendar endTime;
        
        /**
        * Optional. The time the execution attempt concluded.
        * @return The EndTime value.
        */
        public Calendar getEndTime() {
            return this.endTime;
        }
        
        /**
        * Optional. The time the execution attempt concluded.
        * @param endTimeValue The EndTime value.
        */
        public void setEndTime(final Calendar endTimeValue) {
            this.endTime = endTimeValue;
        }
        
        private String id;
        
        /**
        * Optional. The job id that this history entry is for.
        * @return The Id value.
        */
        public String getId() {
            return this.id;
        }
        
        /**
        * Optional. The job id that this history entry is for.
        * @param idValue The Id value.
        */
        public void setId(final String idValue) {
            this.id = idValue;
        }
        
        private String message;
        
        /**
        * Optional. A description of the result of the execution attempt.
        * @return The Message value.
        */
        public String getMessage() {
            return this.message;
        }
        
        /**
        * Optional. A description of the result of the execution attempt.
        * @param messageValue The Message value.
        */
        public void setMessage(final String messageValue) {
            this.message = messageValue;
        }
        
        private int repeatCount;
        
        /**
        * Optional. The occurrence count of this execution.
        * @return The RepeatCount value.
        */
        public int getRepeatCount() {
            return this.repeatCount;
        }
        
        /**
        * Optional. The occurrence count of this execution.
        * @param repeatCountValue The RepeatCount value.
        */
        public void setRepeatCount(final int repeatCountValue) {
            this.repeatCount = repeatCountValue;
        }
        
        private int retryCount;
        
        /**
        * Optional. The retry count of this occurrence.
        * @return The RetryCount value.
        */
        public int getRetryCount() {
            return this.retryCount;
        }
        
        /**
        * Optional. The retry count of this occurrence.
        * @param retryCountValue The RetryCount value.
        */
        public void setRetryCount(final int retryCountValue) {
            this.retryCount = retryCountValue;
        }
        
        private Calendar startTime;
        
        /**
        * Optional. The time the execution attempt began.
        * @return The StartTime value.
        */
        public Calendar getStartTime() {
            return this.startTime;
        }
        
        /**
        * Optional. The time the execution attempt began.
        * @param startTimeValue The StartTime value.
        */
        public void setStartTime(final Calendar startTimeValue) {
            this.startTime = startTimeValue;
        }
        
        private JobState state;
        
        /**
        * Optional. The state of the job: enabled, disabled, faulted, or
        * completed.
        * @return The State value.
        */
        public JobState getState() {
            return this.state;
        }
        
        /**
        * Optional. The state of the job: enabled, disabled, faulted, or
        * completed.
        * @param stateValue The State value.
        */
        public void setState(final JobState stateValue) {
            this.state = stateValue;
        }
        
        private JobHistoryStatus status;
        
        /**
        * Optional. The status of this execution attempt, completed or failed.
        * @return The Status value.
        */
        public JobHistoryStatus getStatus() {
            return this.status;
        }
        
        /**
        * Optional. The status of this execution attempt, completed or failed.
        * @param statusValue The Status value.
        */
        public void setStatus(final JobHistoryStatus statusValue) {
            this.status = statusValue;
        }
        
        private Calendar timestamp;
        
        /**
        * Optional. The time the execution attempt began.
        * @return The Timestamp value.
        */
        public Calendar getTimestamp() {
            return this.timestamp;
        }
        
        /**
        * Optional. The time the execution attempt began.
        * @param timestampValue The Timestamp value.
        */
        public void setTimestamp(final Calendar timestampValue) {
            this.timestamp = timestampValue;
        }
    }
}
