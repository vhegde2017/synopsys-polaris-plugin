/*
 * synopsys-polaris
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.polaris.common.cli.model;

import java.util.Map;

import com.synopsys.integration.rest.HttpUrl;

public class CommonIssueSummary {
    private Map<String, Integer> issuesBySeverity;
    private HttpUrl summaryUrl;
    private Integer totalIssueCount;

    public Map<String, Integer> getIssuesBySeverity() {
        return issuesBySeverity;
    }

    public void setIssuesBySeverity(Map<String, Integer> issuesBySeverity) {
        this.issuesBySeverity = issuesBySeverity;
    }

    public HttpUrl getSummaryUrl() {
        return summaryUrl;
    }

    public void setSummaryUrl(HttpUrl summaryUrl) {
        this.summaryUrl = summaryUrl;
    }

    public Integer getTotalIssueCount() {
        return totalIssueCount;
    }

    public void setTotalIssueCount(Integer totalIssueCount) {
        this.totalIssueCount = totalIssueCount;
    }

}
