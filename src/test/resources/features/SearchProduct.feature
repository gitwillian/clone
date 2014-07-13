@regression
Feature: Search Product
@test
Scenario: Search existent product
Given I am on "http://dafiti.com.br"
When I search for "camisa"
Then I should see the item

@test1
Scenario: Search inexistent product
Given I am on "http://dafiti.com.br"
When I search for "###"
Then I should see the item
    
@test2
Scenario: Search empty
Given I am on "http://dafiti.com.br"
When I search for ""
Then I should see the item
