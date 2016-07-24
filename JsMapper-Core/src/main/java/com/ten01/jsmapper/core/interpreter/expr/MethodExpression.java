package com.ten01.jsmapper.core.interpreter.expr;

import java.util.ArrayList;
import java.util.List;

public class MethodExpression extends StructuredExpression{
	
	private List<ParameterExpression> parameterExpressions = new ArrayList<>();
	private List<LineExpression> lineExpressions = new ArrayList<>();
	
	
	public MethodExpression() {
	}
	public MethodExpression(String name) {
		setName(name);
	}
	public List<ParameterExpression> getParameterExpressions() {
		return parameterExpressions;
	}
	public void setParameterExpressions(List<ParameterExpression> parameterExpressions) {
		this.parameterExpressions = parameterExpressions;
	}
	public List<LineExpression> getLineExpressions() {
		return lineExpressions;
	}
	public void setLineExpressions(List<LineExpression> lineExpressions) {
		this.lineExpressions = lineExpressions;
	}
	
}
