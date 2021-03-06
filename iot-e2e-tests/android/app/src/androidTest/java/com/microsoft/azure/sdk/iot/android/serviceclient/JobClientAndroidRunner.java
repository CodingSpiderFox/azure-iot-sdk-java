/*
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.azure.sdk.iot.android.serviceclient;

import com.microsoft.appcenter.espresso.Factory;
import com.microsoft.appcenter.espresso.ReportHelper;
import com.microsoft.azure.sdk.iot.android.BuildConfig;
import com.microsoft.azure.sdk.iot.common.tests.serviceclient.JobClientTests;
import com.microsoft.azure.sdk.iot.service.exceptions.IotHubException;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;

import java.io.IOException;
import java.net.URISyntaxException;

@Ignore
public class JobClientAndroidRunner extends JobClientTests
{
    @Rule
    public ReportHelper reportHelper = Factory.getReportHelper();

    @BeforeClass
    public static void setUp() throws IOException, IotHubException, InterruptedException, URISyntaxException
    {
        iotHubConnectionString = BuildConfig.IotHubConnectionString;
        JobClientTests.setUp();
    }
}
