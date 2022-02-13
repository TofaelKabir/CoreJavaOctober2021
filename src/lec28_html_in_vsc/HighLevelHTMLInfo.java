package lec28_html_in_vsc;

/*
 High level HTML Info (not mandatory): 

https://www.w3schools.com/html/
https://examples.javacodegeeks.com/enterprise-java/html/eclipse-html-editor-tutorial/
Need eclipse for JAVA EE Developer to perform html work in eclipse


1) HTML = HyperText Markup Language
2) An HTML element is defined by a start tag, some content, and an end tag:
3) It has a start tag <html> and an end tag </html>.
4) The <html> element is the root element and it defines the whole HTML document.
5) Inside the <html> element there is <head> and <body> element
6) <head> contain metadata, recognized by the browser to publish
7) The <body> element defines the document's body. Contain - <header>, <aside>, <main>, <footer>.
8) <main> contain Almost all the tags. 
9) some contain no end tag: <hr>, <br>, <img> etc.
10) Never Skip the End Tag. Some HTML elements will display correctly, even if you forget the end tag. Unexpected results and errors may occur if you forget the end tag!
11) HTML elements with no content are called empty elements. The <br> tag defines a line break, and is an empty element without a closing tag.
12) HTML tags are not case sensitive: <P> means the same as <p>. The HTML standard does not require lowercase tags, but we recommends lower case in HTML, and demands lower case for stricter document types like XHTML
 
13) HTML Attributes:
           a) All HTML elements can have attributes
           b) Attributes provide additional information about elements
           c) Attributes are always specified in the start tag
           d) Attributes usually come in name/value pairs like: name="value"
           example: The <a> tag defines a hyperlink. The href attribute specifies the URL of the page the link is going.
           e) The <img> tag is used to embed an image in an HTML page. The src attribute specifies the path to the image to be displayed. There are two ways to specify the URL in the src attribute:
              
               i. Absolute URL - Links to an external image that is hosted on another web site. Example: src="https://www.w3schools.com/images/img_girl.jpg".
              
               Notes: External images might be under copyright. If you do not get permission to use it, you may be in violation of copyright laws. In addition, you cannot control external images; it can suddenly be removed or changed.
              
               ii. Relative URL - Links to an image that is hosted within the web site. Here, the URL does not include the domain name. If the URL begins without a slash, it will be relative to the current page. Example: src="img_girl.jpg". If the URL begins with a slash, it will be relative to the domain. Example: src="/images/img_girl.jpg".
              
               Tip: It is almost always best to use relative URLs. They will not break if you change domain.
              
               The required alt attribute for the <img> tag specifies an alternate text for an image, if the image for some reason cannot be displayed.
              
               The <img> tag should also contain the width and height attributes, which specifies the width and height of the image (in pixels):
 
               iii) local images (which we also showed here as an example before 2 above)
14) The style attribute is used to add styles to an element, such as color, font, size, and more
     You should always include the lang attribute inside the <html> tag, to declare the language of the Web page. This is meant to assist search engines and browsers
    
15) Country codes can also be added to the language code in the lang attribute.
     <html lang="en-US">
     <body>
     ...
     </body>
    
16) The title attribute defines some extra information about a page.
         type link:favicon, to add favorite icon

17) The HTML standard does not require quotes around attribute values. However, We recommend quotes in HTML, and demand quotes for stricter document types like XHTML. Double quotes around attribute values are the most common in HTML, but single quotes can also be used. In some situations, when the attribute value itself contains double quotes, it is necessary to use single quotes.
 
18) The most important attribute of the <a> element is the href attribute, which indicates the link's destination. called anchor tag.
      
19) The link text is the part that will be visible to the reader. By default, the linked page will be displayed in the current browser window. To change this, you must specify another target for the link.
      
20) The target attribute specifies where to open the linked document. The target attribute can have one of the following values:
            _self - Default. Opens the document in the same window/tab as it was clicked
           _blank - Opens the document in a new window or tab
           _parent - Opens the document in the parent frame
           _top - Opens the document in the full body of the window
21) Absolute URLs vs. Relative URLs. an absolute URL (a full web address) in the href attribute. A local link (a link to a page within the same website) is specified with a relative URL (without the "https://www" part):
 
22) In visual studio code: control + ~ (tilde) = to open the terminal, the blue bar below to pull it up.
23) Summary for <a>
           a) Use the <a> element to define a link
           b) Use the href attribute to define the link address
           c) Use the target attribute to define where to open the linked document
           d) Use the <img> element (inside <a>) to use an image as a link
           e) Use the mailto: scheme inside the href attribute to create a link that opens the user's email program.
    
24) Install Prettier code formatter plug in on VSC. See below video for setting.
         Code formatting with prettier in VSC: https://www.youtube.com/watch?v=h3PJjP0nE98&t=211s
    
25) command+coma to open the setting. search 'format on save'. check it. in prettier 'tab width' =4
    
26) Formatting elements were designed to display special types of text:
 
27) download live server plugin and open it by clicking right and choose 'open with live server'
    
28) Most of the Application have 3 layer: FrontEnd (first layer) -- what you see as color and image and text, Middle layer  -- API, BackEnd (end layer) -- Database




What is CSS?
CSS stands for Cascading Style Sheets and it is the language used to style the visual presentation of web pages. CSS is the language that tells web browsers how to render the different parts of a web page.
html.com

Read more: https://html.com/css/#ixzz5hPpL396h


 */

public class HighLevelHTMLInfo {

}
