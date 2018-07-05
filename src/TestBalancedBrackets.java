
public class TestBalancedBrackets {

	public static void main(String[] args) {

	new BalancedBrackets();

		char exp[] = { '{', '}', '{', '}', '[', ']' };
		if (BalancedBrackets.areParenthesisBalanced(exp))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

}
