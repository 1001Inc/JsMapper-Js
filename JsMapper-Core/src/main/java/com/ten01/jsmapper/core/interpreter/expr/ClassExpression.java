package com.ten01.jsmapper.core.interpreter.expr;

import java.util.ArrayList;
import java.util.List;

public class ClassExpression extends StructuredExpression{	
	
	private List<MethodExpression> methods = new ArrayList<>();
	private MainMethodExpression mainMethod; 
	private List<DeclarationExpression> VariableDeclarations = new ArrayList<>();

	public List<MethodExpression> getMethods() {
		return methods;
	}
	public void setMethods(List<MethodExpression> methods) {
		this.methods = methods;
	}
	public List<DeclarationExpression> getVariableDeclarations() {
		return VariableDeclarations;
	}
	public void setVariableDeclarations(List<DeclarationExpression> variableDeclarations) {
		VariableDeclarations = variableDeclarations;
	}
	public MainMethodExpression getMainMethod() {
		return mainMethod;
	}
	public void setMainMethod(MainMethodExpression mainMethod) {
		this.mainMethod = mainMethod;
	}
	 
}
