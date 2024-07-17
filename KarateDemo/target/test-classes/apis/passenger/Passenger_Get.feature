Feature: Online Fake API-Airlines-Get
 
@execute
Scenario: Get all passenger details
#Given url 'https://api.instantwebtools.net/v1/airlines'
Given url nonSecureBaseURL
And path 'passenger'
When method GET
Then status 200

#@execute
Scenario: Get specific passenger details by id
Given url nonSecureBaseURL
And path 'passenger/6679447b7ad8fb3f5e433c33'
When method GET
Then status 200
#And match responseStatus == 200
    And match response == {"_id":"5ef4a412aab3841847750ce8","name":"John Doe","trips":250,"airline":[{"_id":"252d3bca-d9bb-476c-9a97-562d685e235c","name":"Eva Air","country":"Taiwan","logo":"https://upload.wikimedia.org/wikipedia/en/thumb/e/ed/EVA_Air_logo.svg/250px-EVA_Air_logo.svg.png","slogan":"Sharing the World, Flying Together","head_quaters":"376, Hsin-Nan Rd., Sec. 1, Luzhu, Taoyuan City, Taiwan","website":"www.evaair.com","established":"1989"}],"__v":0}
    #And match $.{"_id":"73dd5420-3bf9-48f3-a0b6-17cf7aa61b19","name":"American Airlines","country":"United States","logo":"https://example.com/logos/american_airlines.png","slogan":"Going for great","head_quaters":"Fort Worth, Texas","website":"https://www.aa.com","established":"1930"}
   	#And match response.country == "United States"
    #And match $.slogan == "Going for great"
    #And match response.name contains "Ame"
    #And print responseHeaders
    #And print responseHeaders["Content-Type"][0]