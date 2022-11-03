College stationery shop is running its annual clearance sale. It is offering steep discounts on a few of the products for this exclusive sale event. They need your help in coming up with a bill calculator.

Products

There are 2 different categories of products. The cost and discount per products are different. Following products are available for the sale at the shop.

Example-

Product Category Original price in Rupees Discount for the sale TSHIRT Clothing 1000 10% JACKET Clothing 2000 5% CAP Clothing 500 20% NOTEBOOK Stationery 200 20% PENS Stationery 300 10% MARKERS Stationery 500 5%

Clearance Sale Rules For each clothing item, the maximum quantity that can be purchased is 2. For each stationery item, the maximum quantity that can be purchased is 3. Discounts can be applied only if the total purchase amount is 1000 rupees or more. An additional discount of 5% can be applied if the total amount to pay is 3000 rupees or more. There is a 10% sales tax on total bill. The tax is calculated after all the discounts are applied.

Goal

Build a command-line application to calculate the total bill amount for the purchase. The application should generate the total bill of the products after applying the discounts, if any and the sales tax. Program should take each individual product with quantity as input. Program should print the total amount to pay and total discount applied in a purchase. Program should print an error message if the terms and conditions are not met.

Assumptions Tax will be applied at the end of bill calculation after the discounts are applied if any. Keep the decimal precision to 2 decimal places.

Input Commands & Format

Your program should take individual product with quantity as input.

ADD_ITEM <ITEM_NAME>

Adds the specified item and quantity of product to the purchases. If the item is added successfully, then it should print: ITEM_ADDED If the quantity exceeds the maximum limit set by clearance sale rules, then it should print the following error: ERROR_QUANTITY_EXCEEDED

PRINT_BILL Prints the total discount applied and the total amount to pay.

Output Commands & Format

Your program should print the total discount applied and the total amount to pay.

TOTAL_DISCOUNT TOTAL_AMOUNT_TO_PAY
