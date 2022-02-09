# language: en
# encoding: utf-8

@UITests
Feature: UI Tests

  @ClassAttribute
  Scenario: Find the correct button to click using class attribute
    Given  I'm on Class Attribute page
    When I Click primary button
    Then an alert popup is displayed

  @DynamicTable
  Scenario: Verify information on dynamic table
    Given  I'm on Dynamic Table page
    Then Chrome CPU information on table should be equals to information on label

  @ClientDelay
  Scenario: Wait for element to be calculated on client side
    Given  I'm on Client Delay page
    When I Click client trigger button
    Then data should be presented