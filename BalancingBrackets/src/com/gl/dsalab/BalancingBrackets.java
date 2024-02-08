package com.gl.dsalab;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BalancingBrackets {

	String expression;

	Stack<Character> stack = new Stack<>();

	public BalancingBrackets(String expression) {
		super();
		this.expression = expression;
	}

	void check() {
		if (expression.length() % 2 != 0) {
			System.out.println("The entered Strings do not contain Balanced Brackets");
			System.exit(0);
		}

		Set<Character> openBrackets = new HashSet<Character>();
		openBrackets.add('<');
		openBrackets.add('[');
		openBrackets.add('{');
		openBrackets.add('(');

		Set<Character> closedBrackets = new HashSet<Character>();
		closedBrackets.add('>');
		closedBrackets.add(']');
		closedBrackets.add('}');
		closedBrackets.add(')');

		for (int i = 0; i < expression.length(); i++) {
			if (openBrackets.contains(expression.charAt(i))) {
				stack.push(expression.charAt(i));
			} else if (closedBrackets.contains(expression.charAt(i))) {
				char poppedChar = stack.pop();
				char actualChar = getOpenBracket(expression.charAt(i));
				if (actualChar == poppedChar)
					continue;
				else
					break;

			} else {
				System.out.println("Invalid characters entered");
				break;
			}
		}
		if (stack.isEmpty())
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}

	Character getCloseBracket(char input) {
		if (input == '<')
			return '>';

		else if (input == '(')
			return ')';

		else if (input == '{')
			return '}';

		else if (input == '[')
			return ']';

		return ' ';

	}

	Character getOpenBracket(char input) {
		if (input == '>')
			return '<';

		else if (input == ')')
			return '(';

		else if (input == '}')
			return '{';

		else if (input == ']')
			return '[';

		return ' ';

	}

	public static void main(String[] args) {
		BalancingBrackets bbobj = new BalancingBrackets("{[<#)>]}");

		bbobj.check();
	}

}
