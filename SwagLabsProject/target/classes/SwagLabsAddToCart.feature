Feature: SwagLabs Add To Cart feature
Add to cart feature allow user to add items to the cart.
 

Scenario: User is trying to add items to the cart

   Given User is successfully logged in to SwagLabs account
   When User click on Add to cart for multiple products
   |Product|
   |Sauce Labs Backpack|
   |Sauce Labs Bike Light|
   |Sauce Labs Bolt T-Shirt|
   
   And click on the cart
   And User clicks on Checkout button.
   Then User should Enter Customer details
   |FirstName | LastName | PostalCode|
   |Snehal | Pawar | 411032 |
   And Click on Continue. 
   And Click on Finish.
   
 