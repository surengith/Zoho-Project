Feature: Checking The Login Functionality of Zoho Application

Scenario: Signin Functionality
Given user Must Launch The Url
When user Click The Signin Button
And user Enter The Email In The Signin Email Field
And user Click The Next Button
And user TakeScreenShot Of The Signin Functionality
Then user Click The SignUp Now Button And It Will Navigate To SignUp Page


Scenario: Signup Functionality
When user Enter The Email In The SignUp Email Field
And user Enter The Password In The Password Field
And user Enter The PhoneNumber In The PhoneNumber Field
And user Click The SignUp For Free Button
Then user TakeScreenShot Of The Signup Functionality