package lec30_java_selenium_dynamic_xpath;

/*
 Different ways to create dynamic Xpath:

1. Tag with a single attribute. (mostly used) *****
 
Formula:
 //htmltag[@attributeName='attributeValue']

Source: 
https://www.amazon.com

Example: 
i) search field --->  //input[@id='twotabsearchtextbox']
ii) submit button --->  //input[@id='nav-search-submit-button']
iii) logo ---> //a[@class='nav-logo-link nav-progressive-attribute']

Source: 
https://portaldev.cms.gov/portal/

Example:
i) logo ---> //a[@id='cms-homepage-link']
  
2. Tag with multiple attribute with 'or' logic (not used much)
 
Formula:
//html tag [@attribute name = 'attribute value' or @attribute name = 'attribute value']

Source:
https://www.bestbuy.com/

Example:
i) search field ---> //input[@id='gh-search-input' or @class='search-input']

3) Tag with multiple attribute with 'and' logic ***

Formula:
//html tag [@attribute name = 'attribute value' and @attribute name = 'attribute value']

Source:
https://portaldev.cms.gov/portal/

Example:
i) logo ---> //input[@class='cms-login-field ng-pristine ng-invalid ng-touched' and @id='cms-login-password']

4) Tag with inner text [means complete text] **********

Formula:
//html tag [text() = 'inner text value' ]

Source:
https://www.amazon.com

Example:
i) find a gift ---> //a[text()='Find a Gift']

Source:
https://www.bestbuy.com/

Example:
i) Deal of the Day---> //a[text()='Deal of the Day']



5) Tag with inner text [not actual text, means partial text as well as actual text] (most commonly used) *******



Formula:
//html tag [contains(text(), 'partial or complete inner text value') ]

Source:
https://www.mountsinai.org/care/cancer


Example:
i) Mount Sinai Tisch Cancer Center 
	(Paragraph)
---> //p[contains(text(), 'Cancer i')] (partial text)
         ---> //p[contains(text(), 'At the Mount Sinai')]                          (partial text)
(Heading)
---> //h1[contains(text(), 'Mount Sinai Tisch Cancer Center')]    (complete text)
---> //h1[contains(text(), 'Mount Sinai Tisch')]    (partial text)



6) Tag with attributes and use of contains (not commonly used)

Formula:
//html tag [contains(@attribute, 'attribute value') ]
 
Source:
https://www.mountsinai.org/care/cancer

Example:
Mount Sinai Tisch Cancer Center' ---> i) //h1[contains(@class, 'title visible-xs')]


7) Normalize space -- eliminates leading and trailing spaces. (high level)

Formula:
//html tag [normalize-space(text())='attribute value']

but below other 3 roles applied together

Source:
https://www.mountsinai.org/

Example:
Find a Doctor ---> //a[normalize-space(text())='Find a Doctor' and @class='hidden-xs dropdown']
—-> (//a[normalize-space(text())='Find a Doctor'])[1]

Request an Appointment --> //a[normalize-space(text())='Request an Appointment' and contains(@class, 'hidden-xs dropdown')]   
                        
Request an Appointment--> (//a[normalize-space(text())='Request an Appointment'])[1] 

Patient Care' ---> (//a[normalize-space(text())='Patient Care'])[1]     
 
 8) Starts with text

Formula:
//html tag [starts-with(text(), 'attribute value')]
 
Source:
https://www.mountsinai.org/appointment/sameday
 
i) //p[starts-with(text(), 'You can connect with a Mount Sinai doctor')]
ii) //p[starts-with(text(), 'You can')]
 
 
 9) Starts with attribute (not commonly used, no need to practice it)

Formula:
//html tag [starts-with(@attributes, 'attribute value']
 
 Source:
 https://click4care.mountsinai.org/?_ga=2.242595723.807374898.1629852175-485942330.1629852175

 // we tested header
 Example:
 //h1[starts-with(@class, 'ng-binding')]


10) Tag with parents (you must know)

Formula:
 //html tag[@attributeName='attributeValue']//parent::html tag[@attributeName='attributeValue']

Source:
https://www.mountsinai.org/

Example:
Our Locations ---> i) //a[@class='hidden-xs dropdown']//parent::li[@class='open']


Source:
https://www.bestbuy.com/


Example:
credit Cards ---> i) //a[text()='Credit Cards']//parent::li
Alternate of above line ---> 1) //a[text()='Credit Cards' and @class='bottom-left-links ']
			            2) (//a[text()='Credit Cards'])[1]
										
													
11) Tag with child (not common)
	
Formula:
 //html tag[@attributeName='attributeValue']//child::html tag[@attributeName='attributeValue']

Source:
https://www.amazon.com/Natural-Coconut-Water-Drink-Gluten/dp/B01EFSO2VU/?_encoding=UTF8&pd_rd_w=nYm83&pf_rd_p=ec6f64f9-01a7-46d0-aa3a-31003b26983a&pf_rd_r=AW1AY3A1FAN52EQA74TY&pd_rd_r=2d944f54-7a0c-4c14-8a39-4a03592c53b8&pd_rd_wg=LT48P&ref_=pd_gw_qpp


Example:
ZICO, Natural 100% Coconut Water Drink, Hydrating Electrolytes, No Sugar Added, Gluten Free, 16.9 Fl Oz (Pack of 12)
----> //div[@class='celwidget']//child::div[@id='titleSection']


12)Tag with following sibling {younger brother} (you must know, very important)

Formula:
 //html tag[@attributeName='attributeValue']//following-sibling::html tag[@attributeName='attributeValue']

Source:
https://www.mountsinai.org/


Example: 
Our locations ---> (//a[@class='hidden-xs dropdown']//following-sibling::a[@class='visible-xs dropdown'])[1]


Source:
https://portaldev.cms.gov/portal/

Example:
Check box ---> //label[@class='checkbox sr-only']//following-sibling::input[@id='checkd']


13) Tag with preceding sibling {elder brother} (you must know)

Formula:
 //html tag[@attributeName='attributeValue']//preceding-sibling::html tag[@attributeName='attributeValue']

Source:
https://portaldev.cms.gov/portal/

Example:
Check box ---> //input[@type='checkbox']//preceding-sibling::label[@class='checkbox sr-only' and @for='checkd' ]


14) Tag with inner text/attribute (if multiple is present) [Last choice]

Formula:
(//html tag [text() = 'inner text value' ])[index number]

Source:
https://www.bestbuy.com/

Example:
credit Cards ---> i) //a[text()='Credit Cards']//parent::li
Alternate of above line ---> 1) (//a[text()='Credit Cards'])[1]

Source:
https://www.mountsinai.org/

Example:                         
(//a[normalize-space(text())='Request an Appointment'])[1] 
(//a[normalize-space(text())='Patient Care'])[1]  




 */

public class DynamicXpath {

}
