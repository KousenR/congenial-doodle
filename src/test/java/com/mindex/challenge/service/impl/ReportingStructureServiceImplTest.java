package com.mindex.challenge.service.impl;

import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.service.ReportingStructureService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReportingStructureServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ReportingStructureService reportingStructureService;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void setup() {
    }

    @Test
    public void testReportingStructure(){
        ReportingStructure reportingStructure = reportingStructureService.create("16a596ae-edd3-4847-99fe-c4518e82c86f");
        // Expected 4 numOfReports for EmployeeID
        int expectedNumberOfReports = 4;
        int actualNumberOfReports = reportingStructure.getNumOfReports();
        assertEquals(expectedNumberOfReports, actualNumberOfReports);
    }

    @Test
    public void testReportingStructure2(){
        ReportingStructure reportingStructure = reportingStructureService.create("03aa1462-ffa9-4978-901b-7c001562cf6f");
        // Expected 2 numOfReports for EmployeeID
        int expectedNumberOfReports = 2;
        int actualNumberOfReports = reportingStructure.getNumOfReports();
        assertEquals(expectedNumberOfReports, actualNumberOfReports);
    }
}
