package test;

public class AccessModifierExample extends Object{
	
	int i;
	

	public AccessModifierExample() {
	}
	
	boolean equlityEmployeeBeanCheck(EmployeeBean emp1, EmployeeBean emp2)
	{
		
		return emp1.equals(emp2)? true:false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private class AccessPrivateMod extends AccessProtectedMod{

		
		
	}
	
	protected class AccessProtectedMod{
		int j;
		
		AccessProtectedMod(){
			i=0;
			j=0;
		}
		
	}
	
	class AccessDefaultMod extends AccessProtectedMod{
		
		public AccessDefaultMod() {
			super();
			
		}
		
	}
}



