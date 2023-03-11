package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest
{

  @Test
  public void testSettingJobId() {
    Job jobOne = new Job();
    Job jobTwo = new Job();


//   Make this test pass. To make it pass use equals method in Job.java
//   to consider two job objects equal when their id fields match

    Assert.assertNotEquals(jobOne.getId(), jobTwo.getId());
  }
  @Test
  public void testJobConstructorSetsAllFields(){
    Job katsJob = new Job(
      "Product tester",
      new Employer("ACME"),
      new Location("Desert"),
      new PositionType("Quality control"),
      new CoreCompetency("Persistence"));

    assertTrue(katsJob.getName() instanceof String);
    assertEquals("Product tester", katsJob.getName());

    assertTrue(katsJob.getEmployer() instanceof Employer);
    assertEquals("ACME", katsJob.getEmployer().getValue());

    assertTrue(katsJob.getLocation() instanceof Location);
    assertEquals("Desert", katsJob.getLocation().getValue());

    assertTrue(katsJob.getPositionType() instanceof PositionType);
    assertEquals("Quality control", katsJob.getPositionType().getValue());

    assertTrue(katsJob.getCoreCompetency() instanceof CoreCompetency);
    assertEquals("Persistence", katsJob.getCoreCompetency().getValue());
  }
  @Test
  public void testJobsForEquality(){
    Job jobOne = new Job(
      "Pup Walker",
      new Employer("Pup Walks"),
      new Location("Beach"),
      new PositionType("Dog walker"),
      new CoreCompetency("Dog Lover"));

    Job jobTwo  = new Job(
      "Pup Walker",
      new Employer("Pup Walks"),
      new Location("Beach"),
      new PositionType("Dog walker"),
      new CoreCompetency("Dog Lover"));


    Assert.assertFalse(jobOne.equals(jobTwo));

  }
  @Test
  public void testToStringStartsAndEndsWithNewLine(){
    Job katzJob = new Job(
      "Pup Walker",
      new Employer("Pup Walks"),
      new Location("Beach"),
      new PositionType("Dog walker"),
      new CoreCompetency("Dog Lover"));

    char firstChar = katzJob.toString().charAt(0);
    char lastChar = katzJob.toString().charAt(katzJob.toString().length()-1);

    assertEquals(firstChar, '\n' );
    assertEquals(lastChar, '\n' );
  }

}

