public class TestDriver extends Stack {

	public void test_push () {
		//Arrange
		Reset();
		int testvalue = 145;

		//Act
		int pushvalue = push(testvalue);

		//Assert
		if (pushvalue == testvalue)
		System.out.println("\nPush Test ...Succesful\n");
		else
		System.out.println("\nPush Test **Failed**\n");

		}

}
			
