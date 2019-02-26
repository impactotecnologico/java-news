package ToLongFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.ToLongFunction;

public class Main {

	public static void main(String[] args) {
		ToLongFunction<String> getPhoneNo = person->{
			Map<String,Long> phoneNos = new HashMap<>();
			phoneNos.put("Anthony Lane", 876543871L);
			phoneNos.put("Jade Pluk", 834543982L);
			phoneNos.put("Olivia Tanner",876321654L);
			phoneNos.put("Jesse Jones", 866327745L);
			
			if(phoneNos.containsKey(person)){
				return phoneNos.get(person);
			} else {
				return 00;
			}
		};
		
		String input = "Anthony Lane";
		long phoneNo = getPhoneNo.applyAsLong(input);
		System.out.println("Phone number of "+input+": "+phoneNo);

	}

}
