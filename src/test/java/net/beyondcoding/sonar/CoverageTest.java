package net.beyondcoding.sonar;

import org.junit.Test;

public class CoverageTest
{
    private final Coverage coverage = new Coverage();

    @Test
    public void testCoveredByUnitTest()
    {
        coverage.coveredByUnitTest();
    }
    
    @Test
    public void testCoveredByUnitAndIntegrationTest()
    {
        coverage.coveredByUnitAndIntegrationTest();
    }
}
