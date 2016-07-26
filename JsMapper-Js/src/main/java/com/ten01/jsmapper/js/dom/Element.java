package com.ten01.jsmapper.js.dom;

/**
 * @author chidveer chinthauntla
 */
public abstract class Element {
	
	/**
	* Sets or returns the accesskey attribute of an element
	*/
	public Object accessKey;	
	/**
	* Attaches an event handler to the specified element
	*/
	public abstract Object addEventListener();	
	/**
	* Adds a new child node, to an element, as the last child node
	*/
	public abstract Object appendChild();	
	/**
	* Returns a NamedNodeMap of an element's attributes
	*/
	public Object attributes;	
	/**
	* Removes focus from an element
	*/
	public abstract Object blur();	
	/**
	* Returns the number of child elements an element has
	*/
	public Object childElementCount;	
	/**
	* Returns a collection of an element's child nodes (including text and comment nodes)
	*/
	public Object childNodes;	
	/**
	* Returns a collection of an element's child element (excluding text and comment nodes)
	*/
	public Object children;	
	/**
	* Returns the class name(s) of an element
	*/
	public Object classList;	
	/**
	* Sets or returns the value of the class attribute of an element
	*/
	public Object className;	
	/**
	* Simulates a mouse-click on an element
	*/
	public abstract Object click();	
	/**
	* Returns the height of an element, including padding
	*/
	public Object clientHeight;	
	/**
	* Returns the width of the left border of an element
	*/
	public Object clientLeft;	
	/**
	* Returns the width of the top border of an element
	*/
	public Object clientTop;	
	/**
	* Returns the width of an element, including padding
	*/
	public Object clientWidth;	
	/**
	* Clones an element
	*/
	public abstract Object cloneNode();	
	/**
	* Compares the document position of two elements
	*/
	public abstract Object compareDocumentPosition();	
	/**
	* Returns true if a node is a descendant of a node, otherwise false
	*/
	public abstract Object contains();	
	/**
	* Sets or returns whether the content of an element is editable or not
	*/
	public Object contentEditable;	
	/**
	* Sets or returns the value of the dir attribute of an element
	*/
	public Object dir;	
	/**
	* Returns the first child node of an element
	*/
	public Object firstChild;	
	/**
	* Returns the first child element of an element
	*/
	public Object firstElementChild;	
	/**
	* Gives focus to an element
	*/
	public abstract Object focus();	
	/**
	* Returns the specified attribute value of an element node
	*/
	public abstract Object getAttribute();	
	/**
	* Returns the specified attribute node
	*/
	public abstract Object getAttributeNode();	
	/**
	* Returns a collection of all child elements with the specified class name
	*/
	public abstract Object getElementsByClassName();	
	/**
	* Returns a collection of all child elements with the specified tag name
	*/
	public abstract Object getElementsByTagName();	
	/**
	* Returns an object which implements the APIs of a specified feature
	*/
	public abstract Object getFeature();	
	/**
	* Returns true if an element has the specified attribute, otherwise false
	*/
	public abstract Object hasAttribute();	
	/**
	* Returns true if an element has any attributes, otherwise false
	*/
	public abstract Object hasAttributes();	
	/**
	* Returns true if an element has any child nodes, otherwise false
	*/
	public abstract Object hasChildNodes();	
	/**
	* Sets or returns the value of the id attribute of an element
	*/
	public Object id;	
	/**
	* Sets or returns the content of an element
	*/
	public Object innerHTML;	
	/**
	* Inserts a new child node before a specified, existing, child node
	*/
	public abstract Object insertBefore();	
	/**
	* Returns true if the content of an element is editable, otherwise false
	*/
	public Object isContentEditable;	
	/**
	* Returns true if a specified namespaceURI is the default, otherwise false
	*/
	public abstract Object isDefaultNamespace();	
	/**
	* Checks if two elements are equal
	*/
	public abstract Object isEqualNode();	
	/**
	* Checks if two elements are the same node
	*/
	public abstract Object isSameNode();	
	/**
	* Returns true if a specified feature is supported on the element
	*/
	public abstract Object isSupported();	
	/**
	* 
	*/
	public Object lang;	
	/**
	* Returns the last child node of an element
	*/
	public Object lastChild;	
	/**
	* Returns the last child element of an element
	*/
	public Object lastElementChild;	
	/**
	* Returns the namespace URI of an element
	*/
	public Object namespaceURI;	
	/**
	* Returns the next node at the same node tree level
	*/
	public Object nextSibling;	
	/**
	* 
	*/
	public Object nextElementSibling;	
	/**
	* Returns the name of a node
	*/
	public Object nodeName;	
	/**
	* Returns the node type of a node
	*/
	public Object nodeType;	
	/**
	* Sets or returns the value of a node
	*/
	public Object nodeValue;	
	/**
	* Joins adjacent text nodes and removes empty text nodes in an element
	*/
	public abstract Object normalize();	
	/**
	* Returns the height of an element, including padding, border and scrollbar
	*/
	public Object offsetHeight;	
	/**
	* Returns the width of an element, including padding, border and scrollbar
	*/
	public Object offsetWidth;	
	/**
	* Returns the horizontal offset position of an element
	*/
	public Object offsetLeft;	
	/**
	* Returns the offset container of an element
	*/
	public Object offsetParent;	
	/**
	* Returns the vertical offset position of an element
	*/
	public Object offsetTop;	
	/**
	* Returns the root element (document object) for an element
	*/
	public Object ownerDocument;	
	/**
	* Returns the parent node of an element
	*/
	public Object parentNode;	
	/**
	* Returns the parent element node of an element
	*/
	public Object parentElement;	
	/**
	* Returns the previous node at the same node tree level
	*/
	public Object previousSibling;	
	/**
	* Returns the previous element at the same node tree level
	*/
	public Object previousElementSibling;	
	/**
	* 
	*/
	public abstract Object querySelector();	
	/**
	* Returns all child elements that matches a specified CSS selector(s) of an element
	*/
	public abstract Object querySelectorAll();	
	/**
	* Removes a specified attribute from an element
	*/
	public abstract Object removeAttribute();	
	/**
	* Removes a specified attribute node, and returns the removed node
	*/
	public abstract Object removeAttributeNode();	
	/**
	* Removes a child node from an element
	*/
	public abstract Object removeChild();	
	/**
	* Replaces a child node in an element
	*/
	public abstract Object replaceChild();	
	/**
	* Removes an event handler that has been attached with the addEventListener() method
	*/
	public abstract Object removeEventListener();	
	/**
	* Returns the entire height of an element, including padding
	*/
	public Object scrollHeight;	
	/**
	* Sets or returns the number of pixels an element's content is scrolled horizontally
	*/
	public Object scrollLeft;	
	/**
	* Sets or returns the number of pixels an element's content is scrolled vertically
	*/
	public Object scrollTop;	
	/**
	* Returns the entire width of an element, including padding
	*/
	public Object scrollWidth;	
	/**
	* Sets or changes the specified attribute, to the specified value
	*/
	public abstract Object setAttribute();	
	/**
	* Sets or changes the specified attribute node
	*/
	public abstract Object setAttributeNode();	
	/**
	* Sets or returns the value of the style attribute of an element
	*/
	public Object style;	
	/**
	* Sets or returns the value of the tabindex attribute of an element
	*/
	public Object tabIndex;	
	/**
	* Returns the tag name of an element
	*/
	public Object tagName;	
	/**
	* Sets or returns the textual content of a node and its descendants
	*/
	public Object textContent;	
	/**
	* Sets or returns the value of the title attribute of an element
	*/
	public Object title;	
	
	/**
	* Returns the node at the specified index in a NodeList
	*
	public abstract Object item();	
	
	public Long nodelist.length	Returns the number of nodes in a NodeList
	*/

}
