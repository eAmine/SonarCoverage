package net.beyondcoding.sonar;

import org.junit.Test;

public class CoverageIT
{
    private final Coverage coverage = new Coverage();

    @Test
    public void testCoveredByIntegrationTest()
    {
        coverage.coveredByIntegrationTest();
    }
    
    @Test
    public void testCoveredByUnitAndIntegrationTest()
    {
        coverage.coveredByUnitAndIntegrationTest();
    }
}
