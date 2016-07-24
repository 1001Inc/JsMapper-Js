package com.ten01.jsmapper.js.dom;

public abstract class Document{
	
	//TODO: fix all mtds 
	
	/*interface 
	 * abstract class
	 * 
	private Link link;
	private Form form;
	private Anchor anchor;
	*/
	/*
	 * Returns a static NodeList containing all elements that matches a specified CSS selector(s) in the document
	 */
	public abstract void querySelectorAll();	
	
	/* 
	 * Returns the (loading) status of the document
	 */
	private Object readyState;
	/*
	 * Returns the URL of the document that loaded the current document
	 */
	private Object referrer;
	/*
	 * Removes an event handler from the document (that has been attached with the addEventListener() method)
	 */
	public abstract void removeEventListener();	
	/*
	 * Renames the specified node
	 */
	public abstract void renameNode();	
	/*
	 * Returns a collection of <script> elements in the document
	 */
	private Object scripts;	
	/*
	 * Sets or returns whether error-checking is enforced or not
	 */
	private Object strictErrorChecking	;
	
	/*
	 * Sets or returns the title of the document
	 */
	private Object title	;
	/*
	 * Returns the full URL of the HTML document
	 */
	private Object URL	;
	
	/*
	 * Writes HTML expressions or JavaScript code to a document
	 */
	public abstract void write();
	/*
	 * 	Same as write(), but adds a newline character after each statement
	 */
	public abstract void writeln();
	
	
	/*

	private Object activeElement	Returns the currently focused element in the document
	void addEventListener()	Attaches an event handler to the document
	void adoptNode()	Adopts a node from another document
	private Object anchors	Returns a collection of all <a> elements in the document that have a name attribute
	private Object applets	Returns a collection of all <applet> elements in the document
	private Object baseURI	Returns the absolute base URI of a document
	private Object body	Sets or returns the document's body (the <body> element)
	void close()	Closes the output stream previously opened with document.open()
	private Object[] cookie	Returns all name/value pairs of cookies in the document
	void createAttribute()	Creates an attribute node
	void createComment()	Creates a Comment node with the specified text
	void createDocumentFragment()	Creates an empty DocumentFragment node
	void createElement()	Creates an Element node
	void createTextNode()	Creates a Text node
	private Object doctype	Returns the Document Type Declaration associated with the document
	private Object documentElement	Returns the Document Element of the document (the <html> element)
	private Object documentMode	Returns the mode used by the browser to render the document
	private Object documentURI	Sets or returns the location of the document
	private Object domain	Returns the domain name of the server that loaded the document
	private Object domConfig	Obsolete. Returns the DOM configuration of the document
	private Object embeds	Returns a collection of all <embed> elements the document
	private Object[]  forms	Returns a collection of all <form> elements in the document
	void getElementById()	Returns the element that has the ID attribute with the specified value
	void getElementsByClassName()	Returns a NodeList containing all elements with the specified class name
	void getElementsByName()	Returns a NodeList containing all elements with a specified name
	void getElementsByTagName()	Returns a NodeList containing all elements with the specified tag name
	void hasFocus()	Returns a Boolean value indicating whether the document has focus
	private Object head	Returns the <head> element of the document
	private Object[] images	Returns a collection of all <img> elements in the document
	private Object implementation	Returns the DOMImplementation object that handles this document
	void importNode()	Imports a node from another document
	private Object inputEncoding	Returns the encoding, character set, used for the document
	private Object lastModified	Returns the date and time the document was last modified
	private Object links	Returns a collection of all <a> and <area> elements in the document that have a href attribute
	void normalize()	Removes empty Text nodes, and joins adjacent nodes
	void normalizeDocument()	Removes empty Text nodes, and joins adjacent nodes
	void open()	Opens an HTML output stream to collect output from document.write()
	void querySelector()	Returns the first element that matches a specified CSS selector(s) in the document
	
*/
}
