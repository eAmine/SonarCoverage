/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beyondcoding.sonar;

/**
 *
 * @author michaeljenkins
 */
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
