package net.beyondcoding.sonar;

public class Coverage
{
    public void coveredByUnitTest()
    {
        System.out.println( "Covered by Unit Test" );
    }
    
    public void coveredByIntegrationTest()
    {
        System.out.println( "Covered by Integration Test" );
    }

    public void coveredByUnitAndIntegrationTest()
    {
        System.out.println( "Covered by both Unit & Integration Tests" );
    }
    
    public void notCoveredByAnyTests()
    {
        System.out.println( "No test Coverage at all" );
    }    
}
