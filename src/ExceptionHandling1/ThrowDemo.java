package ExceptionHandling1;

class UserDetails {
	
	boolean isUserPresent(int id, int[] ids) {
		
		for(int i=0; i<ids.length; i++) {
			if(ids[i]==id) {
				return true;
			}
		}
		
		
		return false;
	}
}


public class ThrowDemo {
	public static void main(String[] args) {
			
			int[] users = {1,2,3,4};
			UserDetails ud = new UserDetails();
			boolean isUserPresent =  ud.isUserPresent(5, users);
		
			if(isUserPresent) {
				System.out.println("User present");
			} else {
//				throw new UserNotFoundException("User not found");
			}
			
		}
}
