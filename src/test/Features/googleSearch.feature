@UserStory01
Feature: google searches
    # feature is a user story

  Scenario: search apple products from the google
    # scenario is a test case

      When  go to website google
      Then  webpage titile contains google
      And   user enters apple products name and click Enter
      *   title changes


    # only When, Given, Then  have cucumber annotations.
      #   And, But, *   does not have cucumber annotations when they are implemented, they will
      #       copy the previous one' annotation, if there isn't any by default it will be @given
