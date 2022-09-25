Feature: Opening of browser

Background: User cancelled initial Login window
Given User provide browser name as "Chrome" and exe location as "E:\\Automation support\\chromedriver.exe"
Given User enter url as "https://www.flipkart.com/"
Given User cancel initial Login window
@smokeTest
Scenario: Login functionality with valid credentials
When User navigate on Login tab
When User click on MyProfile
When User enter "7507452740" as username
When User enter "studofstat" as password
When User click on Login button
Then Application shows user profile to user
