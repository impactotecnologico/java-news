package LongFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.LongFunction;

public class Main {

	public static void main(String[] args) {
		LongFunction<String> getStatus = acknowledgementNo->{
			Map<Long,String> claimStatus = new HashMap<>();
			claimStatus.put(912312312L, "Process Completed");
			claimStatus.put(844312343L, "In Progress");
			claimStatus.put(111312353L, "Rejected");
			claimStatus.put(777312399L, "Awaiting Approval");
			
			if(claimStatus.containsKey(acknowledgementNo)) {
				return claimStatus.get(acknowledgementNo);
			} else {
				return "Invalid Acknowledgement No.";
			}
		};
		
		long input = 912312312L;
		String status = getStatus.apply(input);
		System.out.println("Status of Acknowledgement No. "+input+": "+status);


	}

}
